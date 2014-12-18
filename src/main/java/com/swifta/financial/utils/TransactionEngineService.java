package com.swifta.financial.utils;

import java.rmi.RemoteException;
import java.util.logging.Logger;

import com.swifta.sub.mats.operation.data.DataServiceFault;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.CompleteTransaction;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.DebitfloatInsertresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.DebitfloatInsertresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.DebitfloatInsertresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.DepositFloatUpdate;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.DepositFloatinsert;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.InitializeTransaction;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.InitializeTransactionresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.InitializeTransactionresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.InitializeTransactionresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Transactionresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Transactionresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.TransactionresponsesE;
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
		depositFloatUpdate.setTransactionchannelid(String
				.valueOf(Constants.MOBILE_CHANNEL));
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
		InitializeTransaction initializeTransaction = new InitializeTransaction();
		initializeTransaction.setAmount(Double.valueOf(transactionDetail
				.getAmount()));
		initializeTransaction.setFrommessage(transactionDetail
				.getSenderDescription());
		// cashoutinsert.setIexternaltransactionid(param);
		initializeTransaction.setReceivinguserresourceid(transactionDetail
				.getAgentId());
		initializeTransaction.setSendinguserresourceid(transactionDetail
				.getMmo());
		initializeTransaction.setStatusMessage(Constants.PENDING_VALUE);
		initializeTransaction.setTomessage(transactionDetail
				.getRecieverDescription());
		initializeTransaction.setTransactionchannelid(Integer
				.valueOf(Constants.MOBILE_CHANNEL));
		initializeTransaction.setTransactionid(Integer
				.valueOf(Constants.TRANSACTIONID));
		initializeTransaction.setTransactionIdE(Constants.TRANSACTIONID);
		initializeTransaction.setTransactionstatusid(Constants.PENDING_STATUS);
		initializeTransaction.setTransactiontypeid(String
				.valueOf(Constants.CASHOUT_TRANSACTIONTYPE));
		logger.info("----------------------initiate cash out response\nRecieving ID : "
				+ initializeTransaction.getReceivinguserresourceid()
				+ "\nSending ID : "
				+ initializeTransaction.getSendinguserresourceid());
		InitializeTransactionresponsesE initializeTransactionResponsesE = new InitializeTransactionresponsesE();

		logger.info("----------------------initiate cash out stub");
		try {
			matsStub = new MatsdataserviceStub();
			logger.info("----------------------before making stub call");
			long timeOutInMilliSeconds = (5 * 36 * 1000);
			matsStub._getServiceClient().getOptions()
					.setTimeOutInMilliSeconds(timeOutInMilliSeconds);
			initializeTransactionResponsesE = matsStub
					.initializeTransaction(initializeTransaction);
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
		if (initializeTransactionResponsesE != null) {
			logger.info("----------------------initializeTransactionResponsesE is not null");
			InitializeTransactionresponses initializeTransactionresponses = initializeTransactionResponsesE
					.getInitializeTransactionresponses();
			logger.info("----------------------after getting feedback from cashoutresponses");
			if (initializeTransactionresponses != null) {
				logger.info("----------------------initializeTransactionresponses is not null");
				InitializeTransactionresponse[] initializeTransactionresponseArray = initializeTransactionresponses
						.getInitializeTransactionresponse();
				for (InitializeTransactionresponse initializeResponse : initializeTransactionresponseArray) {
					logger.info("----------------------initializeResponse is :::\nStatus Message : "
							+ initializeResponse.getStatusMessage()
							+ "\nTransaction ID : "
							+ initializeResponse.getTransactionId());
					transactionDetail
							.setInitialMessageStatus(initializeResponse
									.getStatusMessage());
					if (!initializeResponse
							.getStatusMessage()
							.equalsIgnoreCase(
									"RECEIVING_RESOURCE_CANNOT_BE_FOUND OR INACTIVE")
							&& !initializeResponse
									.getStatusMessage()
									.equalsIgnoreCase(
											"SENDING_RESOURCE_CANNOT_BE_FOUND OR INACTIVE")) {

						transactionDetail
								.setTransactionId(Integer
										.valueOf(initializeResponse
												.getTransactionId()));
					}
				}
			} else {
				logger.info("----------------------initializeTransactionresponses is  null");
			}
		} else {
			logger.info("----------------------initializeTransactionResponsesE is null");
		}
		return transactionDetail;
	}

	public TransactionDetail updateCashout(TransactionDetail transactionDetail) {
		boolean status = false;
		logger.info("----------------------update cash out");
		CompleteTransaction completeTransaction = new CompleteTransaction();
		completeTransaction.setAmount(Double.valueOf(transactionDetail
				.getAmount()));
		completeTransaction.setExternalstatuscode(transactionDetail
				.getExternalStatusCode());
		completeTransaction.setExternalreference(transactionDetail.getSender());
		completeTransaction.setExternaltransactionid(transactionDetail
				.getExternalTransactionId());
		completeTransaction.setReceivinguserresourceid(transactionDetail
				.getAgentId());
		completeTransaction.setSendingmsisdn(transactionDetail.getMmo());
		completeTransaction
				.setSendinguserresourceid(transactionDetail.getMmo());

		completeTransaction.setTransactionchannelid(Constants.MOBILE_CHANNEL);
		completeTransaction.setTransactionid(transactionDetail
				.getTransactionId());
		logger.info("----------------------initiate cash out response\nRecieving ID : "
				+ completeTransaction.getReceivinguserresourceid()
				+ "\nSending ID : "
				+ completeTransaction.getSendinguserresourceid()
				+ "\nExt Transaction ID : "
				+ completeTransaction.getExternaltransactionid()
				+ "\nTransaction ID : "
				+ completeTransaction.getTransactionid()
				+ "\nTransaction Complete : "
				+ transactionDetail.isTransactionComplete());

		if (transactionDetail.isTransactionComplete()) {
			completeTransaction
					.setTransactionstatusid(Constants.COMPLETE_STATUS);
			completeTransaction.setStatusMessage(Constants.COMPLETE_VALUE);
		} else {
			completeTransaction.setTransactionstatusid(Constants.FAILED_STATUS);
			completeTransaction.setStatusMessage(Constants.FAILED_VALUE);
		}
		completeTransaction.setTransactiontypeid(String
				.valueOf(Constants.CASHOUT_TRANSACTIONTYPE));

		TransactionresponsesE transactionresponsesE = new TransactionresponsesE();
		try {
			long timeOutInMilliSeconds = (5 * 36 * 1000);
			matsStub._getServiceClient().getOptions()
					.setTimeOutInMilliSeconds(timeOutInMilliSeconds);
			matsStub = new MatsdataserviceStub();
			logger.info("----------------------before making stub call");
			transactionresponsesE = matsStub
					.completeTransaction(completeTransaction);
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
		if (transactionresponsesE != null) {
			logger.info("----------------------transactionresponsesE is not null");
			Transactionresponses transactionresponses = transactionresponsesE
					.getTransactionresponses();
			logger.info("----------------------after getting feedback from cashoutresponses");
			if (transactionresponses != null) {
				logger.info("----------------------transactionresponses is not null");
				Transactionresponse[] transactionResponseArray = transactionresponses
						.getTransactionresponse();
				for (Transactionresponse transactionResponse : transactionResponseArray) {
					logger.info("----------------------Transaction Details \n Status Message : "
							+ transactionResponse.getStatusMessage()
							+ " \nService Fee : "
							+ transactionResponse.getServicefee()
							+ "\nService Commission : "
							+ transactionResponse.getServicecommission());
					transactionDetail
							.setUpdateMessageStatus(transactionResponse
									.getStatusMessage());
					if (!transactionResponse
							.getStatusMessage()
							.equalsIgnoreCase(
									"RECEIVING_RESOURCE_CANNOT_BE_FOUND OR INACTIVE")
							&& !transactionResponse
									.getStatusMessage()
									.equalsIgnoreCase(
											"SENDING_RESOURCE_CANNOT_BE_FOUND OR INACTIVE")) {
						if (transactionResponse.getServicefee() != null)
							transactionDetail.setServiceFee(Double
									.valueOf(transactionResponse
											.getServicefee()));
						if (transactionResponse.getServicecommission() != null)
							transactionDetail.setServiceCommission(Double
									.valueOf(transactionResponse
											.getServicecommission()));
					}
				}
			} else {
				logger.info("----------------------transactionresponses is null");
			}
		} else {
			logger.info("----------------------transactionresponsesE is null");

		}
		return transactionDetail;
	}
}
