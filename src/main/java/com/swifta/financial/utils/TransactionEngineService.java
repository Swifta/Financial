package com.swifta.financial.utils;

import java.rmi.RemoteException;
import java.util.logging.Logger;

import com.swifta.sub.mats.operation.data.DataServiceFault;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Cashoutinsert;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Cashoutresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Cashoutresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.CashoutresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Cashoutupdate;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.DebitfloatInsertresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.DebitfloatInsertresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.DebitfloatInsertresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.DepositFloatUpdate;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.DepositFloatinsert;
import com.swifta.sub.mats.operation.financial.v1.Depositfloatresponse;
import com.swifta.sub.mats.operation.financial.v1.ParameterExtension;
import com.swifta.sub.mats.operation.financial.v1.StatusCode;

public class TransactionEngineService {
	private static final Logger logger = Logger
			.getLogger(TransactionEngineService.class.getName());
	private MatsdataserviceStub matsStub;

	public boolean depositFloatinsert(String orginatingresourceid,
			String destinationresourceid, String amount,
			String sendingdescription, String receivingdescription,
			ParameterExtension extensionparameters) {
		boolean status = false;

		logger.info("----------------------initiate deposit float");
		DepositFloatinsert depositFloatinsert = new DepositFloatinsert();
		depositFloatinsert.setAmount(amount);
		depositFloatinsert.setReceivinguserresourceid(destinationresourceid);
		depositFloatinsert.setSendinguserresourceid(orginatingresourceid);
		depositFloatinsert.setStatusMessage(StatusCode.PENDING.toString());
		depositFloatinsert.setTransactionchannelid(Integer
				.valueOf(Constants.MOBILE_CHANNEL));
		depositFloatinsert.setTransactionid(Integer
				.valueOf(Constants.TRANSACTIONID));
		depositFloatinsert.setTransactionstatusid(Constants.PENDING_STATUS);
		depositFloatinsert.setTransactiontypeid(String
				.valueOf(Constants.DEPOSITFLOAT_TRANSACTIONTYPEID));
		logger.info("----------------------after setting parameters for deposit float insert");
		DebitfloatInsertresponsesE debitFloatinsertresponsesE = null;
		try {
			matsStub = new MatsdataserviceStub();
			logger.info("----------------------before making stub call");
			debitFloatinsertresponsesE = matsStub
					.depositFloatinsert(depositFloatinsert);
			logger.info("----------------------after stub call");
		} catch (RemoteException e) {
			logger.info("----------------------Remote Exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataServiceFault e) {
			logger.info("----------------------Data Service Fault");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (debitFloatinsertresponsesE != null) {
			logger.info("----------------------debitFloatinsertresponsesE is not null");
			DebitfloatInsertresponses debitFloatInsertresponses = debitFloatinsertresponsesE
					.getDebitfloatInsertresponses();
			if (debitFloatInsertresponses != null) {
				logger.info("----------------------debitFloatInsertresponses is not null");
				DebitfloatInsertresponse[] debitFloatInsertresponse = debitFloatInsertresponses
						.getDebitfloatInsertresponse();

				for (DebitfloatInsertresponse debitfloatInsertresponse : debitFloatInsertresponse) {
					if (debitfloatInsertresponse.getStatusMessage()
							.equalsIgnoreCase("ACCOUNT_TRXN_SET_TO_PENDING")) {
						logger.info("----------------------Response is ACCOUNT_TRXN_SET_TO_PENDING");
						status = true;
					} else {
						logger.info("----------------------Response is not ACCOUNT_TRXN_SET_TO_PENDING");
					}
				}
			} else {
				logger.info("----------------------debitFloatInsertresponses is not null");
			}
		} else {
			logger.info("----------------------debitFloatinsertresponsesE is not null");
		}

		return status;

	}

	public Depositfloatresponse depositFloatUpdate(String orginatingresourceid,
			String destinationresourceid, String amount,
			String sendingdescription, String receivingdescription,
			ParameterExtension extensionparameters) {
		boolean status = false;
		String statusMessage = "";
		logger.info("----------------------update cash in");
		DepositFloatUpdate depositFloatUpdate = new DepositFloatUpdate();
		depositFloatUpdate.setAmount(amount);
		depositFloatUpdate.setReceivinguserresourceid(destinationresourceid);
		depositFloatUpdate.setSendinguserresourceid(orginatingresourceid);
		depositFloatUpdate.setStatusMessage(StatusCode.COMPLETED.toString());
		depositFloatUpdate.setTransactionchannelid(Constants.MOBILE_CHANNEL);
		depositFloatUpdate.setTransactionid(Constants.TRANSACTIONID);
		depositFloatUpdate.setTransactiontypeid(String
				.valueOf(Constants.DEPOSITFLOAT_TRANSACTIONTYPEID));
		logger.info("----------------------after setting parameters for deposit float insert");
		DebitfloatInsertresponsesE debitFloatinsertresponsesE = null;
		try {
			matsStub = new MatsdataserviceStub();
			logger.info("----------------------before making stub call");
			debitFloatinsertresponsesE = matsStub
					.depositFloatUpdate(depositFloatUpdate);
			logger.info("----------------------after stub call");
		} catch (RemoteException e) {
			logger.info("----------------------Remote Exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataServiceFault e) {
			logger.info("----------------------Data Service Fault");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (debitFloatinsertresponsesE != null) {
			logger.info("----------------------debitFloatinsertresponsesE is not null");
			DebitfloatInsertresponses debitFloatInsertresponses = debitFloatinsertresponsesE
					.getDebitfloatInsertresponses();
			if (debitFloatInsertresponses != null) {
				logger.info("----------------------debitFloatInsertresponses is not null");
				DebitfloatInsertresponse[] debitFloatInsertresponse = debitFloatInsertresponses
						.getDebitfloatInsertresponse();

				for (DebitfloatInsertresponse debitfloatInsertresponse : debitFloatInsertresponse) {
					if (debitfloatInsertresponse.getStatusMessage()
							.equalsIgnoreCase("ACCOUNT_TRXN_SET_TO_PENDING")) {
						logger.info("----------------------Response is ACCOUNT_TRXN_SET_TO_PENDING");
						status = true;
					} else {
						logger.info("----------------------Response is not ACCOUNT_TRXN_SET_TO_PENDING");
					}
					statusMessage = debitfloatInsertresponse.getStatusMessage();
				}
			} else {
				logger.info("----------------------debitFloatInsertresponses is not null");
			}
		} else {
			logger.info("----------------------debitFloatinsertresponsesE is not null");
		}
		Depositfloatresponse depositFloatResponse = new Depositfloatresponse();
		depositFloatResponse.setDestinationpartnerbalanceafter(amount);

		ParameterExtension pe = new ParameterExtension();
		pe.setMmoperator(Constants.DEPOSITFLOAT_CHANNEL);
		pe.setSpTransactionid(String.valueOf(depositFloatUpdate
				.getTransactionid()));
		pe.getExtensionparam().add(statusMessage);
		pe.getExtensionparam().add(String.valueOf(status));

		depositFloatResponse.setExtension(pe);
		depositFloatResponse.setFinancialtransactionid(String
				.valueOf(depositFloatUpdate.getTransactionid()));
		depositFloatResponse.setOrginatingpartnerbalanceafter(amount);
		depositFloatResponse.setOrginatingpartnerfee("");

		return depositFloatResponse;
	}

	public boolean initiateCashin() {
		boolean status = false;
		logger.info("----------------------initiate cash in");
		return status;
	}

	public boolean updateCashin() {
		boolean status = false;
		logger.info("----------------------update cash in");
		return status;
	}

	public TransactionDetail initiateCashout(TransactionDetail transactionDetail) {
		logger.info("----------------------initiate cash out insert");
		Cashoutinsert cashoutinsert = new Cashoutinsert();
		cashoutinsert.setAmount(transactionDetail.getAmount());
		cashoutinsert.setFrommessage(transactionDetail.getSenderDescription());
		// cashoutinsert.setIexternaltransactionid(param);
		cashoutinsert
				.setReceivinguserresourceid(transactionDetail.getAgentId());
		cashoutinsert.setSendinguserresourceid(transactionDetail.getSender());
		cashoutinsert.setStatusMessage(Constants.PENDING_VALUE);
		cashoutinsert.setTomessage(transactionDetail.getRecieverDescription());
		cashoutinsert.setTransactionchannelid(Integer
				.valueOf(Constants.MOBILE_CHANNEL));
		cashoutinsert
				.setTransactionid(Integer.valueOf(Constants.TRANSACTIONID));
		cashoutinsert.setTransactionIdE(Constants.TRANSACTIONID);
		cashoutinsert.setTransactionstatusid(Constants.PENDING_STATUS);
		cashoutinsert.setTransactiontypeid(String
				.valueOf(Constants.CASHOUT_TRANSACTIONTYPE));
		logger.info("----------------------initiate cash out response");
		CashoutresponsesE cashoutResponsesE = new CashoutresponsesE();
		logger.info("----------------------initiate cash out stub");
		try {
			matsStub = new MatsdataserviceStub();
			logger.info("----------------------before making stub call");
			cashoutResponsesE = matsStub.cashoutinsert(cashoutinsert);
			logger.info("----------------------after stub call");
		} catch (RemoteException e) {
			logger.info("----------------------Remote Exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataServiceFault e) {
			logger.info("----------------------Data Service Fault");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("----------------------after getting feedback from insert");
		Cashoutresponses cashoutResponses = cashoutResponsesE
				.getCashoutresponses();
		logger.info("----------------------after getting feedback from cashoutresponses");
		Cashoutresponse[] cashoutResponseArray = cashoutResponses
				.getCashoutresponse();
		for (Cashoutresponse cashoutResponse : cashoutResponseArray) {
			transactionDetail.setInitialMessageStatus(cashoutResponse
					.getStatusMessage());
			transactionDetail.setTransactionId(cashoutResponse
					.getTransactionId());
		}
		return transactionDetail;
	}

	public TransactionDetail updateCashout(TransactionDetail transactionDetail) {
		boolean status = false;
		logger.info("----------------------update cash out");
		Cashoutupdate cashoutupdate = new Cashoutupdate();
		cashoutupdate.setAmount(transactionDetail.getAmount());
		cashoutupdate
				.setReceivinguserresourceid(transactionDetail.getAgentId());
		cashoutupdate.setSendingmsisdn(transactionDetail.getSender());
		cashoutupdate.setSendinguserresourceid(transactionDetail.getSender());
		cashoutupdate.setStatusMessage(Constants.COMPLETE_VALUE);
		cashoutupdate.setTransactionchannelid(Constants.MOBILE_CHANNEL);
		cashoutupdate.setTransactionid(transactionDetail
				.getExternalTransactionId());
		cashoutupdate.setTransactiontypeid(String
				.valueOf(Constants.CASHOUT_TRANSACTIONTYPE));

		CashoutresponsesE cashoutResponsesE = new CashoutresponsesE();
		try {
			matsStub = new MatsdataserviceStub();
			logger.info("----------------------before making stub call");
			cashoutResponsesE = matsStub.cashoutupdate(cashoutupdate);
			logger.info("----------------------after stub call");
		} catch (RemoteException e) {
			logger.info("----------------------Remote Exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataServiceFault e) {
			logger.info("----------------------Data Service Fault");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("----------------------after getting feedback from insert");
		Cashoutresponses cashoutResponses = cashoutResponsesE
				.getCashoutresponses();
		logger.info("----------------------after getting feedback from cashoutresponses");
		Cashoutresponse[] cashoutResponseArray = cashoutResponses
				.getCashoutresponse();
		for (Cashoutresponse cashoutResponse : cashoutResponseArray) {
			transactionDetail.setUpdateMessageStatus(cashoutResponse
					.getStatusMessage());
			cashoutResponse.getTransactionId();
		}
		return transactionDetail;
	}
}
