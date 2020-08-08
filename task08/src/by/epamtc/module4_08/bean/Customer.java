package by.epamtc.module4_08.bean;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private long numCard;
	private long account;

	{
		id = 0;
		surname = "";
		name = "";
		patronymic = "";
		address = "";
		numCard = 0L;
		account = 0L;
	}

	public Customer() {

	}

	public Customer(String surname, String name, String patronymic) {

		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;

	}

	public Customer(String surname, String name, String patronymic, long numCard, long account) {

		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.numCard = numCard;
		this.account = account;

	}

	public Customer(int id, String surname, String name, String patronymic, String address, long numCard,
			long account) {

		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.numCard = numCard;
		this.account = account;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getNumCard() {
		return numCard;
	}

	public void setNumCard(long numCard) {
		this.numCard = numCard;
	}

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (account ^ (account >>> 32));
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (numCard ^ (numCard >>> 32));
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (account != other.account)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numCard != other.numCard)
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", surname=" + surname + ", name=" + name
				+ ", patronymic=" + patronymic + ", address=" + address + ", numCard=" + numCard + ", account="
				+ account + "]";
	}

}