package by.epamtc.module4_08.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.epamtc.module4_08.bean.Customer;
import by.epamtc.module4_08.bean.Group;

public class GroupLogic {

	private static final GroupLogic instance = new GroupLogic();

	private GroupLogic() {

	}

	public static GroupLogic getInstance() {
		return instance;
	}

	public void sortAZ(Group group) {

		if ((group == null) || (group.getCustomers() == null)) {
			return;
		}

		Collections.sort(group.getCustomers(), AZCustomerComparator.getInstance());

	}

	public Group createGroupHaveNumCard(long min, long max, Group group) {

		if ((group == null) || (group.getCustomers() == null)) {
			return null;
		}

		List<Customer> newList = new ArrayList<Customer>();
		List<Customer> customers;
		CustomerLogic customerLogic;

		customers = group.getCustomers();
		customerLogic = CustomerLogic.getInstance();

		for (Customer customer : customers) {
			if (customerLogic.isHasNumCard(min, max, customer)) {
				newList.add(customer);
			}
		}

		return new Group(newList);
	}

}