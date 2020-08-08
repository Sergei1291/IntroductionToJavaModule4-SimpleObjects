package by.epamtc.module4_09.logic;

import by.epamtc.module4_09.bean.Book;
import by.epamtc.module4_09.bean.Bookshelf;

public class BookshelfLogic {

	private static final BookshelfLogic instance = new BookshelfLogic();

	private BookshelfLogic() {

	}

	public static BookshelfLogic getInstance() {
		return instance;
	}

	public Bookshelf createAuthorsBooks(Bookshelf books, String author) {

		if ((books == null) || (books.getBooks() == null)) {
			return null;
		}

		Bookshelf authorsBooks = new Bookshelf();
		BookLogic bookLogic;

		bookLogic = BookLogic.getinstance();

		for (Book book : books.getBooks()) {
			if (bookLogic.isAuthors(book, author)) {
				authorsBooks.addBook(book);
			}
		}

		return authorsBooks;
	}

	public Bookshelf createPublishersBooks(Bookshelf books, String publisher) {

		if ((books == null) || (books.getBooks() == null)) {
			return null;
		}

		Bookshelf publishersBooks = new Bookshelf();
		BookLogic bookLogic;

		bookLogic = BookLogic.getinstance();

		for (Book book : books.getBooks()) {
			if (bookLogic.isPublishers(book, publisher)) {
				publishersBooks.addBook(book);
			}
		}

		return publishersBooks;
	}

	public Bookshelf createBooksAfterYear(Bookshelf books, int year) {

		if ((books == null) || (books.getBooks() == null)) {
			return null;
		}

		Bookshelf afterYearBooks = new Bookshelf();
		BookLogic bookLogic;

		bookLogic = BookLogic.getinstance();

		for (Book book : books.getBooks()) {
			if (bookLogic.isAfterYear(book, year)) {
				afterYearBooks.addBook(book);
			}
		}

		return afterYearBooks;
	}

}