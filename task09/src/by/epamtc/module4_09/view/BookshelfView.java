package by.epamtc.module4_09.view;

import java.util.List;

import by.epamtc.module4_09.bean.Book;
import by.epamtc.module4_09.bean.Bookshelf;

public class BookshelfView {

	private static final BookshelfView instance = new BookshelfView();

	private BookshelfView() {

	}

	public static BookshelfView getInstance() {
		return instance;
	}

	public void print(Bookshelf bookshelf) {

		if (bookshelf == null) {
			System.out.println("bookshelf == null");
			return;
		}

		List<Book> books;

		books = bookshelf.getBooks();

		if (books == null) {
			System.out.println("bookshelf's list == null");
			return;
		}

		if (books.size() == 0) {
			System.out.println("bookshelf is empty");
			return;
		}

		BookView bookView;
		bookView = BookView.getInstance();

		for (Book book : books) {
			bookView.printSimpleInfo(book);
		}

	}

}