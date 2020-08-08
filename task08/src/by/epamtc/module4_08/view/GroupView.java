package by.epamtc.module4_08.view;

import by.epamtc.module4_08.bean.Customer;
import by.epamtc.module4_08.bean.Group;

public class GroupView {

	private static final GroupView instance = new GroupView();

	private GroupView() {

	}

	public static GroupView getInstance() {
		return instance;
	}

	public void print(Group group) {

		if (group == null) {
			System.out.println("customer's group == null");
			return;
		}

		if (group.getCustomers() == null) {
			System.out.println("customer's group's list == null");
			return;
		}

		if (group.getCustomers().isEmpty()) {
			System.out.println("customer's group's list is Empty");
			return;
		}

		CustomerView custView;
		custView = CustomerView.getInstance();

		for (Customer customer : group.getCustomers()) {
			custView.print(customer);
		}

	}

}