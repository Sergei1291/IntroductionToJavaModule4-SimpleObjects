package by.epamtc.module4_08.view;

import by.epamtc.module4_08.bean.Customer;

public class CustomerView {

	private static final CustomerView instance = new CustomerView();

	private CustomerView() {

	}

	public static CustomerView getInstance() {
		return instance;
	}

	public void print(Customer customer) {

		if (customer == null) {
			System.out.println("cutomer == null");

			return;
		}

		StringBuilder customerInfo;
		customerInfo = this.createInfo(customer);

		System.out.println(customerInfo);

	}

	private StringBuilder createInfo(Customer customer) {

		StringBuilder builder = new StringBuilder();
		StringBuilder numCard;

		builder.append("Customer [id = ");
		builder.append(customer.getId());

		builder.append(", surname = ");
		builder.append(customer.getSurname());

		builder.append(", name = ");
		builder.append(customer.getName());

		builder.append(", patronymic = ");
		builder.append(customer.getPatronymic());

		builder.append(", numCard = ");
		numCard = this.covert(customer.getNumCard());
		builder.append(numCard);

		builder.append(", account = ");
		builder.append(customer.getAccount());

		builder.append(", address = ");
		builder.append(customer.getAddress());
		builder.append("]");

		return builder;
	}

	private StringBuilder covert(long numCard) {

		StringBuilder builder = new StringBuilder();

		int i;
		int j;

		char[] arr;
		char[] arr1 = new char[16];

		arr = String.valueOf(numCard).toCharArray();

		for (i = 0; i < arr1.length; i++) {
			arr1[i] = '0';
		}

		i = 0;

		while ((i < arr.length) && (i < arr1.length)) {
			arr1[i] = arr[arr.length - 1 - i];
			i++;
		}

		for (i = arr1.length - 1, j = 0; i >= 0; i--, j++) {

			if ((j % 4 == 0) && (j != 0)) {
				builder.append("_");
			}
			builder.append(arr1[i]);
		}

		return builder;
	}

}