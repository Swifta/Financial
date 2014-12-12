package com.swifta.financial.utils;

import java.rmi.RemoteException;
import java.util.logging.Logger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.axis2.AxisFault;

import com.swifta.sub.mats.operation.financial.v1.Adjustaccountresponse;
import com.swifta.sub.mats.operation.financial.v1.Adjustaccounttransactionparameters;
import com.swifta.sub.mats.operation.financial.v1.Cashinresponse;
import com.swifta.sub.mats.operation.financial.v1.Cashoutresponse;
import com.swifta.sub.mats.operation.financial.v1.Depositfloatresponse;
import com.swifta.sub.mats.operation.financial.v1.EntryType;
import com.swifta.sub.mats.operation.financial.v1.Floattransferresponse;
import com.swifta.sub.mats.operation.financial.v1.Getaccounttransactionhistoryresponse;
import com.swifta.sub.mats.operation.financial.v1.Gettransactionhistoryparameter;
import com.swifta.sub.mats.operation.financial.v1.Gettransactionhistoryresponse;
import com.swifta.sub.mats.operation.financial.v1.OperationType;
import com.swifta.sub.mats.operation.financial.v1.ParameterExtension;
import com.swifta.sub.mats.operation.financial.v1.Transfertobankrequestresponse;
import com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub;
import com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.Cashinrequest;
import com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.CashinrequestE;
import com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.CashinrequestResponse;
import com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.CashinrequestResponseE;
import com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.Cashoutrequest;
import com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.CashoutrequestE;
import com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.CashoutrequestResponse;
import com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.CashoutrequestResponseE;

public class TransactionService {
	private static final Logger logger = Logger
			.getLogger(TransactionService.class.getName());
	private TransactionEngineService transactionEngineService = new TransactionEngineService();
	private SpfinancialsStub spFinancialStub = null;

	public Getaccounttransactionhistoryresponse getaccounttransactionhistoryrequest(
			String accountresource, String otheraccountresource,
			XMLGregorianCalendar fromdate, XMLGregorianCalendar todate,
			String nooftransactionhistory, String transactionid,
			EntryType transactionentrytype, OperationType operationtype) {
		logger.info("----------------------initiate Getaccounttransactionhistoryresponse");

		Getaccounttransactionhistoryresponse getaccounttransactionhistoryresponse = new Getaccounttransactionhistoryresponse();
		return getaccounttransactionhistoryresponse;
	}

	public Cashoutresponse cashoutrequest(String orginatingresourceid,
			String destinationresourceid, String amount,
			String sendingdescription, String receivingdescription,
			ParameterExtension extensionparameters) {
		logger.info("----------------------initiate Cashoutresponse");
		TransactionDetail transactionDetail = new TransactionDetail(
				orginatingresourceid, destinationresourceid, amount,
				sendingdescription, receivingdescription, extensionparameters);

		transactionDetail = transactionEngineService
				.initiateCashout(transactionDetail);

		logger.info("----------------------before instantiating cashoutrequestE");
		Cashoutrequest cashoutrequest = new Cashoutrequest();
		cashoutrequest.setAmount(amount);
		cashoutrequest.setDestinationresourceid(destinationresourceid);
		cashoutrequest.setOrginatingresourceid(orginatingresourceid);
		cashoutrequest.setSendingdescription(sendingdescription);
		cashoutrequest.setReceivingdescription(receivingdescription);

		com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.ParameterExtension spFinancialExtension = new com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.ParameterExtension();
		spFinancialExtension.setMmoperator(extensionparameters.getMmoperator());
		// spFinancialExtension.setExtensionparam((Object[])
		// extensionparameters.getExtensionparam().toArray());
		String[] extensionArray = new String[extensionparameters
				.getExtensionparam().size()];
		int paramcount = 0;
		for (Object extensionObject : extensionparameters.getExtensionparam()
				.toArray()) {
			extensionArray[paramcount] = extensionObject.toString();
			paramcount++;
		}
		spFinancialExtension.setExtensionparam(extensionArray);
		cashoutrequest.setExtensionparameters(spFinancialExtension);
		CashoutrequestE cashoutrequestE = new CashoutrequestE();
		cashoutrequestE.setCashoutrequest(cashoutrequest);
		CashoutrequestResponseE cashoutResponseE = null;
		try {
			spFinancialStub = new SpfinancialsStub();
			logger.info("----------------------before instantiating stub");
			long timeOutInMilliSeconds = (5 * 36 * 1000);
			spFinancialStub._getServiceClient().getOptions()
					.setTimeOutInMilliSeconds(timeOutInMilliSeconds);
			spFinancialStub = new SpfinancialsStub();
			logger.info("----------------------After instantiation of stub");
			cashoutResponseE = spFinancialStub.cashoutrequest(cashoutrequestE);
		} catch (AxisFault e) {
			logger.info("----------------------Axis exception on instantiation of stub");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CashoutrequestResponse cashoutRequestResponse = cashoutResponseE
				.getCashoutrequestResponse();
		com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.Cashoutresponse spCashoutResponse = cashoutRequestResponse
				.get_return();
		logger.info("---------------------- before initiating Cashoutresponse");
		Cashoutresponse cashoutresponse = new Cashoutresponse();
		logger.info("---------------------- after instantiating  Cashoutresponse");
		cashoutresponse.setDestinationpartnerbalanceafter(spCashoutResponse
				.getDestinationpartnerbalanceafter());

		com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.ParameterExtension spPe = new com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.ParameterExtension();
		ParameterExtension pe = new ParameterExtension();
		spPe = spCashoutResponse.getExtensionparameters();
		if (spPe != null) {
			pe.setMmoperator(spPe.getMmoperator());
			pe.setSpTransactionid(spPe.getSpTransactionid());
			transactionDetail.setExternalTransactionId(pe.getSpTransactionid());
			int count = 1;
			for (String paramValue : spPe.getExtensionparam()) {
				if (count == 1) {
					transactionDetail.setExternalStatusCode(paramValue);
				}
				if (count == 2) {
					transactionDetail.setExternalStatusMessage(paramValue);
				}
				if (count == 3) {
					transactionDetail.setTransactionComplete(Boolean
							.valueOf(paramValue));
				}
				count++;
				pe.getExtensionparam().add(paramValue);
			}
		}
		cashoutresponse.setParameter(pe);

		cashoutresponse.setFinancialtransactionid(spCashoutResponse
				.getFinancialtransactionid());
		cashoutresponse.setOrginatingpartnerbalanceafter(spCashoutResponse
				.getOrginatingpartnerbalanceafter());
		cashoutresponse.setOrginatingpartnerfee(spCashoutResponse
				.getOrginatingpartnerfee());
		logger.info("---------------------- update Cashout");
		transactionEngineService.updateCashout(transactionDetail);
		logger.info("---------------------- after update Cashout");
		return cashoutresponse;
	}

	public Gettransactionhistoryresponse gettransactionhistoryrequest(
			Gettransactionhistoryparameter transactionhistoryparameter) {
		logger.info("----------------------initiate Gettransactionhistoryresponse");
		Gettransactionhistoryresponse gettransactionhistoryresponse = new Gettransactionhistoryresponse();
		return gettransactionhistoryresponse;
	}

	public Transfertobankrequestresponse transfertobankaccountrequest(
			String userresourceid, String accountresourceid, String amount,
			String description, String bankcode, String bankaccountnumber,
			ParameterExtension extension) {
		logger.info("----------------------initiate Transfertobankrequestresponse");
		Transfertobankrequestresponse transfertobankrequestresponse = new Transfertobankrequestresponse();
		return transfertobankrequestresponse;
	}

	public Depositfloatresponse depositfloat(String orginatingresourceid,
			String destinationresourceid, String amount,
			String sendingdescription, String receivingdescription,
			ParameterExtension extensionparameters) {
		logger.info("----------------------initiate Depositfloatresponse");
		return transactionEngineService.depositFloatUpdate(
				orginatingresourceid, destinationresourceid, amount,
				sendingdescription, receivingdescription, extensionparameters);

	}

	public Floattransferresponse floattransferrequest(
			String orginatingresourceid, String destinationresourceid,
			String amount, String sendingdescription,
			String receivingdescription, ParameterExtension extension) {
		logger.info("----------------------initiate Floattransferresponse");
		Floattransferresponse floattransferresponse = new Floattransferresponse();
		return floattransferresponse;
	}

	public Cashinresponse cashinrequest(String orginatingresourceid,
			String destinationresourceid, String amount,
			String sendingdescription, String receivingdescription,
			ParameterExtension extensionparameters) {

		logger.info("----------------------initiate Cashinresponse");

		transactionEngineService.initiateCashin();

		logger.info("----------------------convert Financial ParameterExtension to spFinancials ParameterExtension");
		com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.ParameterExtension spFinancialExtension = new com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.ParameterExtension();
		spFinancialExtension.setMmoperator(extensionparameters.getMmoperator());
		spFinancialExtension.setExtensionparam((String[]) extensionparameters
				.getExtensionparam().toArray());

		logger.info("----------------------before instantiating cashoutrequestE");
		Cashinrequest cashinrequest = new Cashinrequest();
		cashinrequest.setAmount(amount);
		cashinrequest.setDestinationresourceid(destinationresourceid);
		cashinrequest.setOrginatingresourceid(orginatingresourceid);
		cashinrequest.setSendingdescription(sendingdescription);
		cashinrequest.setReceivingdescription(receivingdescription);
		cashinrequest.setExtensionparameters(spFinancialExtension);
		CashinrequestE cashinrequestE = new CashinrequestE();
		cashinrequestE.setCashinrequest(cashinrequest);
		CashinrequestResponseE cashinResponseE = null;
		try {
			logger.info("----------------------before instantiating stub");
			long timeOutInMilliSeconds = (5 * 36 * 1000);
			spFinancialStub._getServiceClient().getOptions()
					.setTimeOutInMilliSeconds(timeOutInMilliSeconds);
			spFinancialStub = new SpfinancialsStub();
			logger.info("----------------------After instantiation of stub");
			cashinResponseE = spFinancialStub.cashinrequest(cashinrequestE);
		} catch (AxisFault e) {
			logger.info("----------------------Axis exception on instantiation of stub");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CashinrequestResponse cashinRequestResponse = cashinResponseE
				.getCashinrequestResponse();
		com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.Cashinresponse spCashinResponse = cashinRequestResponse
				.get_return();
		logger.info("---------------------- before initiating Cashinresponse");
		Cashinresponse cashinresponse = new Cashinresponse();
		logger.info("---------------------- after instantiating  Cashoutresponse");
		cashinresponse.setDestinationresourcebalanceafter(spCashinResponse
				.getDestinationpartnerbalanceafter());
		com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.ParameterExtension spPe = new com.swifta.subsidiary.mats.serviceprovider.operation.spfinancial.v1_0.SpfinancialsStub.ParameterExtension();
		ParameterExtension pe = new ParameterExtension();
		spPe = spCashinResponse.getExtensionparameters();
		if (spPe != null) {
			pe.setMmoperator(spPe.getMmoperator());
			pe.setSpTransactionid(spPe.getSpTransactionid());
			for (String paramValue : spPe.getExtensionparam()) {
				pe.getExtensionparam().add(paramValue);
			}
		}

		cashinresponse.setExtension(pe);

		cashinresponse.setFinancialtransactionid(spCashinResponse
				.getFinancialtransactionid());
		cashinresponse.setOrginatingresourcebalanceafter(spCashinResponse
				.getOrginatingpartnerbalanceafter());
		cashinresponse.setFee(spCashinResponse.getFee());
		logger.info("---------------------- update Cashin");
		transactionEngineService.updateCashin();
		logger.info("---------------------- after update Cashin");
		return cashinresponse;

	}

	public Adjustaccountresponse adjustaccountrequest(String description,
			Adjustaccounttransactionparameters adjustaccountinstruction) {
		logger.info("----------------------initiate Adjustaccountresponse");
		Adjustaccountresponse adjustaccountresponse = new Adjustaccountresponse();
		return adjustaccountresponse;
	}
}
