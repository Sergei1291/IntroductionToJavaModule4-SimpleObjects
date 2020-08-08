package by.epamtc.module4_08.logic;

import by.epamtc.module4_08.bean.Customer;

public class CustomerLogic {

	private static final CustomerLogic instance = new CustomerLogic();

	private CustomerLogic() {

	}

	public static CustomerLogic getInstance() {
		return instance;
	}

	public boolean isHasNumCard(long min, long max, Customer customer) {

		if (customer == null) {
			return false;
		}

		long numCard;

		numCard = customer.getNumCard();

		if ((numCard >= min) && (numCard <= max)) {
			return true;
		}

		return false;
	}

}