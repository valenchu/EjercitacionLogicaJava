package JpaHibernate.Libreria.Servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import JpaHibernate.Dao.BookDao;
import JpaHibernate.Libreria.Entidad.AuthorEntity;
import JpaHibernate.Libreria.Entidad.BookEntity;
import JpaHibernate.Libreria.Entidad.PublisherEntity;

public class BookService {
	BookDao book = new BookDao();
	Scanner sn = new Scanner(System.in);
	AuthorService au = new AuthorService();
	PublisherService pu = new PublisherService();

	public BookEntity createBook(BookEntity bookEntity) throws Exception {
		if (bookEntity.getTitle().isEmpty() || bookEntity.getTitle() == null) {
			throw new Exception("Title empty or null");
		}
		if (bookEntity.getYear() == 0 || bookEntity.getYear() < 0) {
			throw new Exception("Year empty or less than 0");
		}
		if (bookEntity.getModels() <= 0) {
			throw new Exception("Models empty or less than 0");
		}
		if (bookEntity.getModelsBorrowed() <= 0 || bookEntity.getModelsRemainings() <= 0) {
			throw new Exception("Models Borrowed o Models Remaining less than or equals 0");
		}
		book.createBook(bookEntity);
		return bookEntity;

	}

	public void printAllBook() {
		book.printAll();
	}

	public BookEntity searchBook(long id) throws Exception {
		try {
			if (!(id <= 0)) {
				ArrayList<BookEntity> buuk = (ArrayList<BookEntity>) book.searchAuthor();

				BookEntity b = buuk.stream().filter(p -> p.getIsbn().equals(id)).findAny().orElse(null);
				if (b != null) {
					if (b.getAuthor().getTop().equals(false)) {
						b.setAuthor(null);
					}
					if (b.getPublisher().getTop().equals(false)) {
						b.setPublisher(null);
					}
				}
				return b;
			} else {
				throw new Exception("id NO FOUND");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	// Deleted book
	public BookEntity deletedBook(long id) throws Exception {
		try {
			if (!(id <= 0)) {
				BookEntity book = searchBook(id);
				this.book.deleted(book);
				return book;
			} else {
				throw new Exception("id Empty");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	// Search for title of book
	public void searchForTitle() throws Exception {
		try {
			System.out.println("----WELCOME TO SEARCH BOOK FOR TITLE SECTION----");
			System.out.println("Insert the TITLE to search");
			String title = sn.nextLine();
			List<BookEntity> listBook = book.searchForTitle(title);
			if (!listBook.isEmpty()) {
				System.out.println("DATA FOUND");
				listBook.forEach(bok -> System.out.println(bok));
				System.out.println("FIN DATA FOUND");
			} else {
				System.out.println("NO FOUND ANYTHING");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	// Search book for name of the author
	public void searchForNameTheAuthor() throws Exception {
		try {
			System.out.println("----WELCOME TO SEARCH BOOK FOR NAME OF AUTHOR SECTION----");
			System.out.println("Insert the NAME AUTHOR to search in BOOK");
			String nameAut = sn.nextLine();
			List<BookEntity> listBook = book.searchForNameTheAuthor(nameAut);
			if (!listBook.isEmpty()) {
				System.out.println("DATA FOUND");
				listBook.forEach(System.out::println);
				System.out.println("FIN DATA FOUND");
			} else {
				System.out.println("NO FOUND ANYTHING");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	// Search book for name of publisher
	public void searchForNameThePublisher() throws Exception {
		try {
			System.out.println("----WELCOME TO SEARCH BOOK FOR NAME OF PUBLISHER SECTION----");
			System.out.println("Insert the NAME PUBLISHER to search in BOOK");
			String namePub = sn.nextLine();
			List<BookEntity> listBook = book.searchForNameThePublisher(namePub);
			if (!listBook.isEmpty()) {
				System.out.println("DATA FOUND");
				listBook.forEach(System.out::println);
				System.out.println("FIN DATA FOUND");
			} else {
				System.out.println("NO FOUND ANYTHING");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	// Search for isbn
	public void searchForISBN() throws Exception {
		try {
			System.out.println("----WELCOME TO SEARCH BOOK FOR ISBN SECTION----");
			System.out.println("Insert the ISBN to search");
			BookEntity isb = searchBook(sn.nextLong());
			sn.nextLine();
			if (isb != null) {
				System.out.println("DATA FOUND");
				System.out.println(isb.toString());
				System.out.println("FIN DATA FOUND");
			} else {
				System.out.println("NO FOUND ANYTHING");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	// update book
	public BookEntity updateBook(long id) throws Exception {
		int value = -1;
		BookEntity book = searchBook(id);
		try {
			if (!(id <= 0)) {
				do {

					System.out.println("----WELCOME TO MODIFY SECTION----");
					System.out.println("What do you wish modify?");
					System.out.println("1 modify title,\n2 modify year,\n3 modify models,"
							+ "\n4 modify modelsBorrowed,\n5 modify modelsRemainings,\n6 modify publisher,"
							+ "\n7 modify author,\n0 exit the modify section");
					value = sn.nextInt();
					sn.nextLine();
					switch (value) {
					case 1:
						System.out.println("Insert the new title");
						System.out.println("the current title is = " + book.getTitle().toLowerCase());
						book.setTitle(sn.nextLine());
						break;

					case 2:
						System.out.println("Insert the new year");
						System.out.println("the current year is = " + book.getYear());
						book.setYear(sn.nextInt());
						sn.nextLine();
						break;

					case 3:
						System.out.println("Insert the new models");
						System.out.println("the current models is = " + book.getModels());
						book.setModels(sn.nextInt());
						sn.nextLine();
						break;

					case 4:
						System.out.println("Insert the new modelsBorrowed");
						System.out.println("the current model borrowed is = " + book.getModelsBorrowed());
						book.setModelsBorrowed(sn.nextInt());
						sn.nextLine();
						break;

					case 5:
						System.out.println("Insert the new models remainings");
						System.out.println("the current models remainings is = " + book.getModelsRemainings());
						book.setModelsRemainings(sn.nextInt());
						sn.nextLine();
						break;

					case 6:
						if (book.getPublisher() != null) {
							System.out.println("Insert the new punlisher");
							System.out.println("the current punlisher is = " + book.getPublisher());
							PublisherEntity p = book.getPublisher();
							p.setName(sn.nextLine());
							book.setPublisher(p);
						} else {
							System.out.println("no exist publisher in this book if you wish add one type 1 else 0");
							int va = sn.nextInt();
							sn.nextLine();
							if (va == 1) {
								System.out.println("Insert the name the new publisher to create");
								String name = sn.nextLine();
								PublisherEntity pub = new PublisherEntity(name, true);
								book.setPublisher(pu.createPublisher(pub));
							}
						}
						break;

					case 7:
						if (book.getAuthor() != null) {
							System.out.println("Insert the new author");
							System.out.println("the current author is = " + book.getAuthor());
							AuthorEntity a = book.getAuthor();
							a.setName(sn.nextLine());
							book.setAuthor(a);
						} else {
							System.out.println("no exist author in this book if you wish add one type 1 else 0");
							int va = sn.nextInt();
							sn.nextLine();
							if (va == 1) {
								System.out.println("Insert the name the new author to create");
								String name = sn.nextLine();
								AuthorEntity authorEntity = new AuthorEntity(name, true);
								book.setAuthor(au.createAuthor(authorEntity));
							}

						}
						break;

					case 0:
						value = 0;
						break;

					default:
						System.out.println("COMMANDS NO FOUND");
						break;
					}
				} while (value != 0);
				this.book.updateBook(book);
				System.out.println("Book UPDATE");
				return book;
			} else {
				throw new Exception("id NO FOUND");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

}
