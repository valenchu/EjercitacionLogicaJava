package JpaHibernate.Libreria;

import java.util.Scanner;

import JpaHibernate.Libreria.Entidad.AuthorEntity;
import JpaHibernate.Libreria.Entidad.BookEntity;
import JpaHibernate.Libreria.Entidad.PublisherEntity;
import JpaHibernate.Libreria.Servicio.AuthorService;
import JpaHibernate.Libreria.Servicio.BookService;
import JpaHibernate.Libreria.Servicio.PublisherService;

public class MenLibreria {
	static AuthorService aus = new AuthorService();
	static PublisherService pus = new PublisherService();
	static BookService bookService = new BookService();

	public static void menLib() {
		boolean ver = false;

		Scanner sn = new Scanner(System.in);
		do {
			System.out.println("---ALL AUTHORS---");
			aus.callListAuthor();
			System.out.println("---ALL PUBLISHERS---");
			pus.callListPublisher();
			System.out.println("---ALL BOOKS---");
			bookService.printAllBook();
			System.out.println("1 create and call author,\n2 create and call publisher,\n3 create a book and call,"
					+ "\n4 CRUD Author,\n5 CRUD Publisher,\n6 CRUD book,\n0 exit app create call;");
			int number = sn.nextInt();
			switch (number) {
			case 1:
				try {
					// Create the authors
					sn.nextLine();
					System.out.println("Insert name author");
					String name = sn.nextLine();
					AuthorEntity au = new AuthorEntity(name, true);
					aus.createAuthor(au);
					System.out.println("Author create");
//					aus.callListAuthor();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}

				break;
			case 2:
				try {
					sn.nextLine();
					// Create the authors
					System.out.println("Insert name publisher");
					String name = sn.nextLine();
					PublisherEntity puentity = new PublisherEntity(name, true);
					pus.createPublisher(puentity);
					System.out.println("Publisher create");
					// puentity.callListAuthor();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					sn.nextLine();
					BookEntity book = null;
					System.out.println("----CREATE A NEW BOOK----");
					System.out.println("Insert title of book");
					String title = sn.nextLine();
					System.out.println("Insert year of book");
					Integer year = sn.nextInt();
					System.out.println("Insert models of book");
					Integer models = sn.nextInt();
					System.out.println("Insert models borrowed of book");
					Integer modelsBorrowed = sn.nextInt();
					System.out.println("Insert models remaing of book");
					Integer modelsRemainings = sn.nextInt();
					Boolean top = true;
					System.out.println("Insert PUBLISHER in the of book");
					System.out.println("---- LIST PUBLISHER UP ----");
					pus.callListPublisher();
					System.out.println("Selected id of publisher for insert the book");
					Integer idPubl = sn.nextInt();
					PublisherEntity publisher = pus.searchPublisher(idPubl);
					System.out.println("Insert AUTHOR in the of book");
					System.out.println("---- LIST AUTHOR UP ----");
					aus.callListAuthor();
					System.out.println("Selected id of author for insert the book");
					Integer idAuth = sn.nextInt();
					AuthorEntity author = aus.searchAuthor(idAuth);
					book = new BookEntity(title, year, models, modelsBorrowed, modelsRemainings, top, publisher,
							author);
					bookService.createBook(book);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					crudAuthor();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					crudPublisher();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 0:
				ver = true;
				break;
			default:
				System.out.println("Number incorrect");
				ver = false;
				break;
			}

		} while (ver != true);
	}

	public static void crudAuthor() throws Exception {
		Scanner sn = new Scanner(System.in);
		int value = -1;
		int id = -1;
		try {
			do {
				System.out.println("---WELCOME CRUD AUTHOR---");
				System.out.println("Select 1 for UPDATE,\n2 for DELETE,\n0 EXIT crud author;  ");
				value = sn.nextInt();
				switch (value) {
				case 1:
					aus.callListAuthor();
					System.out.println("Selected ID AUTHOR to update the data");
					id = sn.nextInt();
					aus.updateAuthor(id);
					break;
				case 2:
					aus.callListAuthor();
					System.out.println("Selected ID AUTHOR to softDelete the data");
					id = sn.nextInt();
					aus.deletedAuthor(id);
					break;
				case 0:
					value = 0;
					break;
				default:
					System.out.println("Command not find ");
					break;
				}
			} while (value != 0);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	public static void crudPublisher() throws Exception {
		Scanner sn = new Scanner(System.in);
		int value = -1;
		int id = -1;
		try {
			do {
				System.out.println("---WELCOME CRUD PUBLISHER---");
				System.out.println("Select 1 for UPDATE,\n2 for DELETE,\n0 EXIT crud publisher;  ");
				value = sn.nextInt();
				switch (value) {
				case 1:
					pus.callListPublisher();
					System.out.println("Selected ID PUBLISHER to update the data");
					id = sn.nextInt();
					pus.updatePublisher(id);
					break;
				case 2:
					pus.callListPublisher();
					System.out.println("Selected ID PUBLISHER to softDelete the data");
					id = sn.nextInt();
					pus.deletedPublisher(id);
					break;
				case 0:
					value = 0;
					break;
				default:
					System.out.println("Command not find ");
					break;
				}
			} while (value != 0);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
}
