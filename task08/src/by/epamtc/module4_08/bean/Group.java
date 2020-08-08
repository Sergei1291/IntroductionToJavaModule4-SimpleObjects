package by.epamtc.module4_08.bean;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Customer> customers;

	public Group() {

		customers = new ArrayList<Customer>();

	}

	public Group(List<Customer> customers) {

		this.customers = customers;

	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer getCustomers(int index) {
		return customers.get(index);
	}

	public void setCustomers(Customer customer, int index) {
		customers.set(index, customer);
	}

	public void add(Customer customer) {
		customers.add(customer);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [customers=" + customers + "]";
	}

}