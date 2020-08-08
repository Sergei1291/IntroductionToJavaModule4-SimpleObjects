package by.epamtc.module4_09.bean;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

	private List<Book> books;

	public Bookshelf() {

		books = new ArrayList<Book>();

	}

	public Bookshelf(List<Book> books) {

		this.books = books;

	}

	public List<Book> getBooks() {
		return books;
	}

	public Book getBooks(int index) {
		return books.get(index);
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void setBooks(Book book, int index) {
		books.set(index, book);
	}

	public void addBook(Book book) {
		books.add(book);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
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
		Bookshelf other = (Bookshelf) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [books=" + books + "]";
	}

}