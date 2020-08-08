package by.epamtc.module4_09.view;

import java.util.List;

import by.epamtc.module4_09.bean.Book;

public class BookView {

	private static final BookView instance = new BookView();

	private BookView() {

	}

	public static BookView getInstance() {
		return instance;
	}

	public void printInfo(Book book) {

		if (book == null) {
			System.out.println("Book == null");
			return;
		}

		String bookInfo;
		bookInfo = this.createBookInfo(book);

		System.out.println(bookInfo);

	}

	public void printSimpleInfo(Book book) {

		if (book == null) {
			System.out.println("Book == null");
			return;
		}

		String bookInfo;
		bookInfo = this.createSimpleInfo(book);

		System.out.println(bookInfo);
	}

	private String createBookInfo(Book book) {

		String strHelp;
		StringBuilder builder = new StringBuilder();

		builder.append("Book [id = ");
		builder.append(book.getId());

		builder.append(", title = ");
		builder.append(book.getTitle());

		builder.append(", authors = ");
		strHelp = this.createAuthorsStr(book);
		builder.append(strHelp);

		builder.append(", publisher = ");
		builder.append(book.getPublisher());

		builder.append(", year = ");
		builder.append(book.getYear());

		builder.append(", numPages = ");
		builder.append(book.getNumPages());

		builder.append(", price = ");
		builder.append(book.getPrice());

		builder.append(", cover = ");
		builder.append(book.getCover());

		builder.append("]");

		return new String(builder);
	}

	private String createAuthorsStr(Book book) {

		StringBuilder builder = new StringBuilder();

		List<String> list;

		list = book.getAuthors();

		if (list == null) {
			return " null ";
		}

		for (String string : list) {
			builder.append(string);
			builder.append(", ");
		}

		return new String(builder);
	}

	private String createSimpleInfo(Book book) {

		String strHelp;
		StringBuilder builder = new StringBuilder();

		builder.append("Book [id = ");
		builder.append(book.getId());

		builder.append(", title = ");
		builder.append(book.getTitle());

		builder.append(", authors = ");
		strHelp = this.createAuthorsStr(book);
		builder.append(strHelp);

		builder.append(", publisher = ");
		builder.append(book.getPublisher());

		builder.append(", year = ");
		builder.append(book.getYear());

		builder.append("]");

		return new String(builder);
	}

}