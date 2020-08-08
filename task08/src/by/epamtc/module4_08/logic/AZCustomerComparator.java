package by.epamtc.module4_08.logic;

import java.util.Comparator;

import by.epamtc.module4_08.bean.Customer;

public class AZCustomerComparator implements Comparator<Customer> {

	private static final AZCustomerComparator instance = new AZCustomerComparator();

	private AZCustomerComparator() {

	}

	public static AZCustomerComparator getInstance() {
		return instance;
	}

	@Override
	public int compare(Customer cust1, Customer cust2) {

		if ((cust1 == null) && (cust2 != null)) {
			return 1;
		}

		if ((cust1 != null) && (cust2 == null)) {
			return -1;
		}

		if ((cust1 == null) && (cust2 == null)) {
			return 0;
		}

		int compareNum;

		String surname1;
		String surname2;

		String name1;
		String name2;

		String patronymic1;
		String patronymic2;

		surname1 = cust1.getSurname();
		surname2 = cust2.getSurname();

		compareNum = this.compareString(surname1, surname2);

		if (compareNum != 0) {
			return compareNum;
		} else {
			name1 = cust1.getName();
			name2 = cust2.getName();

			compareNum = this.compareString(name1, name2);

			if (compareNum != 0) {
				return compareNum;
			} else {
				patronymic1 = cust1.getPatronymic();
				patronymic2 = cust2.getPatronymic();

				compareNum = this.compareString(patronymic1, patronymic2);

				return compareNum;
			}
		}

	}

	private int compareString(String str1, String str2) {

		if ((str1 == null) && (str2 != null)) {
			return 1;
		}

		if ((str1 != null) && (str2 == null)) {
			return -1;
		}

		if ((str1 == null) && (str2 == null)) {
			return 0;
		}

		return str1.compareToIgnoreCase(str2);
	}

}