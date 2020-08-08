package by.epamtc.module4_09.logic;

import java.util.List;
import java.util.regex.Pattern;

import by.epamtc.module4_09.bean.Book;
import by.epamtc.module4_09.bean.Cover;

public class BookLogic {

	private static final BookLogic instance = new BookLogic();

	private BookLogic() {

	}

	public static BookLogic getinstance() {
		return instance;
	}

	public Book createBook(String title, List<String> authors, String publisher, String year, String numPages,
			String price, Cover cover) {

		if (!this.checkYear(year)) {
			year = "0";
		}

		if (!this.checkNumPages(numPages)) {
			numPages = "1";
		}

		if (!this.checkPrice(price)) {
			price = "0.00";
		}

		return new Book(title, authors, publisher, year, numPages, price, cover);
	}

	public boolean isAuthors(Book book, String author) {

		if (book == null) {
			return false;
		}

		List<String> authors;

		authors = book.getAuthors();

		if (authors == null) {
			return false;
		}

		if (authors.contains(author)) {
			return true;
		}

		return false;
	}

	public boolean isPublishers(Book book, String publisher) {

		if (book == null) {
			return false;
		}

		if ((book.getPublisher() != null) && (publisher != null)) {
			if (book.getPublisher().equals(publisher)) {
				return true;
			}
		}

		if ((book.getPublisher() == null) && (publisher == null)) {
			return true;
		}

		return false;
	}

	public boolean isAfterYear(Book book, int year) {

		if (book == null) {
			return false;
		}

		int yearBooks;

		yearBooks = this.convertYear(book.getYear());

		if (yearBooks == -1) {
			return false;
		}

		if (yearBooks >= year) {
			return true;
		}

		return false;
	}

	private boolean checkYear(String year) {

		if (year == null) {
			return true;
		}

		int yearInt;

		if (Pattern.matches("[1-9][0-9]{0,3}", year)) {

			yearInt = this.convertYear(year);

			if (yearInt <= 2020) {
				return true;
			}
		}

		return false;
	}

	private int convertYear(String year) {

		if (year == null) {
			return -1;
		}

		char[] array;
		int yearInt;

		array = year.toCharArray();
		yearInt = array[0] - 48;

		for (int i = 1; i < array.length; i++) {
			yearInt *= 10;
			yearInt += (array[i] - 48);
		}

		return yearInt;
	}

	private boolean checkNumPages(String numPages) {

		if (numPages == null) {
			return true;
		}

		if (Pattern.matches("[1-9][0-9]{0,3}", numPages)) {
			return true;
		}

		return false;
	}

	private boolean checkPrice(String price) {

		if (price == null) {
			return true;
		}

		if (Pattern.matches("[0-9]+(\\.[0-9]{2})?", price)) {
			return true;
		}

		return false;
	}

}