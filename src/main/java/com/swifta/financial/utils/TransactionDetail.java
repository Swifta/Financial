package com.swifta.financial.utils;

import java.util.List;

import com.swifta.sub.mats.operation.financial.v1.ParameterExtension;

public class TransactionDetail {
	private String amount;
	private String sender;
	private String reciever;
	private String senderDescription;
	private String recieverDescription;
	private String agentId;
	private String agentPin;
	private String mmo;
	private int transactionId;
	private String externalTransactionId;
	private String externalStatusCode;
	private String initialMessageStatus;
	private String updateMessageStatus;

	public TransactionDetail(String sender, String reciever, String amount,
			String senderDescription, String recieverDescription,
			ParameterExtension extensionparameters) {
		this.sender = sender;
		this.reciever = reciever;
		this.amount = amount;
		this.senderDescription = senderDescription;
		this.recieverDescription = recieverDescription;

		if (extensionparameters != null) {
			this.mmo = extensionparameters.getMmoperator();
			this.transactionId = Integer.valueOf(extensionparameters
					.getSpTransactionid());

			List<String> parameterList = extensionparameters
					.getExtensionparam();
			this.agentId = parameterList.get(0);
			this.agentPin = parameterList.get(1);
		}

	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReciever() {
		return reciever;
	}

	public void setReciever(String reciever) {
		this.reciever = reciever;
	}

	public String getSenderDescription() {
		return senderDescription;
	}

	public void setSenderDescription(String senderDescription) {
		this.senderDescription = senderDescription;
	}

	public String getRecieverDescription() {
		return recieverDescription;
	}

	public void setRecieverDescription(String recieverDescription) {
		this.recieverDescription = recieverDescription;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentPin() {
		return agentPin;
	}

	public void setAgentPin(String agentPin) {
		this.agentPin = agentPin;
	}

	public String getMmo() {
		return mmo;
	}

	public void setMmo(String mmo) {
		this.mmo = mmo;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getExternalTransactionId() {
		return externalTransactionId;
	}

	public void setExternalTransactionId(String externalTransactionId) {
		this.externalTransactionId = externalTransactionId;
	}

	public String getInitialMessageStatus() {
		return initialMessageStatus;
	}

	public void setInitialMessageStatus(String initialMessageStatus) {
		this.initialMessageStatus = initialMessageStatus;
	}

	public String getUpdateMessageStatus() {
		return updateMessageStatus;
	}

	public void setUpdateMessageStatus(String updateMessageStatus) {
		this.updateMessageStatus = updateMessageStatus;
	}

	public String getExternalStatusCode() {
		return externalStatusCode;
	}

	public void setExternalStatusCode(String externalStatusCode) {
		this.externalStatusCode = externalStatusCode;
	}

}
