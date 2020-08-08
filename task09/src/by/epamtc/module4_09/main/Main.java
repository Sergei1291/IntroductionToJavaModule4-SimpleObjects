package by.epamtc.module4_09.main;

import java.util.ArrayList;
import java.util.List;

import by.epamtc.module4_09.bean.Book;
import by.epamtc.module4_09.bean.Bookshelf;
import by.epamtc.module4_09.logic.BookLogic;
import by.epamtc.module4_09.logic.BookshelfLogic;
import by.epamtc.module4_09.view.BookshelfView;

/*
 * Создайте класс Book, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
 * агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль. Класс Book:
 * id, название, автор(ы), издательство, год издания, количество страниц, цена,
 * тип переплета. Найти и вывести: а) список книг заданного автора; б) список
 * книг, выпущенных заданным издательством; в) список книг, выпущенных после
 * заданного года.
 */

public class Main {

	public static void main(String[] args) {

		BookshelfLogic logic;
		BookshelfView view;
		BookLogic bookLogic;

		logic = BookshelfLogic.getInstance();
		view = BookshelfView.getInstance();
		bookLogic = BookLogic.getinstance();

		String[] title = new String[15];

		title[0] = "title0";
		title[1] = "title1";
		title[2] = null;
		title[3] = "title3";
		title[4] = null;
		title[5] = "title5";
		title[6] = "title6";
		title[7] = "title7";
		title[8] = "title8";
		title[9] = "title9";
		title[10] = "title10";
		title[11] = "title11";
		title[12] = null;
		title[13] = "title13";
		title[14] = "title14";

		String[] authors = new String[4];

		authors[0] = "A";
		authors[1] = "B";
		authors[2] = "C";
		authors[3] = null;

		String[] publisher = new String[15];

		publisher[0] = "Moscow";
		publisher[1] = "Three cats";
		publisher[2] = "Moscow";
		publisher[3] = "Three cats";
		publisher[4] = null;
		publisher[5] = "Three cats";
		publisher[6] = "Moscow";
		publisher[7] = "Three cats";
		publisher[8] = "Moscow";
		publisher[9] = "Three cats";
		publisher[10] = null;
		publisher[11] = "Three cats";
		publisher[12] = "Moscow";
		publisher[13] = null;
		publisher[14] = "Moscow";

		String[] year = new String[15];

		year[0] = "2015";
		year[1] = "2001";
		year[2] = null;
		year[3] = "1980";
		year[4] = "2025";
		year[5] = "189";
		year[6] = "1995";
		year[7] = "1549";
		year[8] = "2009";
		year[9] = "2001";
		year[10] = "2020";
		year[11] = null;
		year[12] = "2018";
		year[13] = "1919";
		year[14] = "1984";

		Book book;
		Bookshelf books0 = new Bookshelf();

		for (int i = 0; i < 15; i++) {

			List<String> list = new ArrayList<String>();

			if (i % 5 == 0) {
				list.add(authors[0]);
			}
			if (i % 5 == 1) {
				list.add(authors[1]);
				list.add(authors[2]);
			}
			if (i % 5 == 2) {
				list.add(authors[2]);
			}
			if (i % 5 == 3) {
				list.add(authors[3]);
			}
			if (i % 5 == 4) {
				list.add(authors[0]);
				list.add(authors[3]);
			}

			book = bookLogic.createBook(title[i], list, publisher[i], year[i], null, null, null);
			books0.addBook(book);
		}

		view.print(books0);
		System.out.println("__________________________________");

		String author;
		author = "A";

		Bookshelf booksAuthors;
		booksAuthors = logic.createAuthorsBooks(books0, author);

		System.out.println("Author's books:");
		view.print(booksAuthors);
		System.out.println("__________________________________");

		String publisher0;
		publisher0 = "Moscow";

		Bookshelf booksPublisher;
		booksPublisher = logic.createPublishersBooks(books0, publisher0);

		view.print(booksPublisher);
		System.out.println("__________________________________");

		int year0;
		year0 = 2010;

		Bookshelf booksAfterYear;
		booksAfterYear = logic.createBooksAfterYear(books0, year0);

		view.print(booksAfterYear);

	}

}