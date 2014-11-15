package com.swifta.financial.utils;

import java.util.logging.Logger;

import com.swifta.sub.mats.operation.financial.v1.Depositfloatresponse;
import com.swifta.sub.mats.operation.financial.v1.ParameterExtension;

public class TransactionEngineService {
	private static final Logger logger = Logger
			.getLogger(TransactionEngineService.class.getName());

	public Depositfloatresponse initiateDepositFloat(
			String orginatingresourceid, String destinationresourceid,
			String amount, String sendingdescription,
			String receivingdescription, ParameterExtension extensionparameters) {
		logger.info("----------------------initiate deposit float");
		Depositfloatresponse depositfloatresponse = new Depositfloatresponse();
		return depositfloatresponse;
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

	public boolean initiateCashout() {
		boolean status = false;
		logger.info("----------------------initiate cash out");
		return status;
	}

	public boolean updateCashout() {
		boolean status = false;
		logger.info("----------------------update cash out");
		return status;
	}

}
