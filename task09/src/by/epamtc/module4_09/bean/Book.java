package by.epamtc.module4_09.bean;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private int id;
	private String title;
	private List<String> authors;
	private String publisher;
	private String year;
	private String numPages;
	private String price;
	private Cover cover;

	{
		id = 0;
		title = "";
		authors = new ArrayList<String>();
		publisher = "";
		year = "0";
		numPages = "1";
		price = "0.00";
		cover = Cover.UNKNOWN;
	}

	public Book() {

	}

	public Book(String title, List<String> authors, String publisher, String year, String numPages, String price,
			Cover cover) {

		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
		this.numPages = numPages;
		this.price = price;
		this.cover = cover;

	}

	public Book(int id, String title, List<String> authors, String publisher, String year, String numPages,
			String price, Cover cover) {

		this(title, authors, publisher, year, numPages, price, cover);
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getNumPages() {
		return numPages;
	}

	public void setNumPages(String numPages) {
		this.numPages = numPages;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Cover getCover() {
		return cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + id;
		result = prime * result + ((numPages == null) ? 0 : numPages.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (cover != other.cover)
			return false;
		if (id != other.id)
			return false;
		if (numPages == null) {
			if (other.numPages != null)
				return false;
		} else if (!numPages.equals(other.numPages))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", title=" + title + ", authors=" + authors
				+ ", publisher=" + publisher + ", year=" + year + ", numPages=" + numPages + ", price=" + price
				+ ", cover=" + cover + "]";
	}

}