package JpaHibernate.Libreria.Servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import JpaHibernate.Dao.AuthorDao;
import JpaHibernate.Libreria.Entidad.AuthorEntity;

public class AuthorService {
	AuthorDao ad = new AuthorDao();
	Scanner sn = new Scanner(System.in);

	// I verify author
	public AuthorEntity createAuthor(AuthorEntity authorEntity) throws Exception {
		if (authorEntity.getName().isEmpty() || authorEntity.getName() == null) {
			throw new Exception("Name empty or null");// I verify author name
		}

		ad.createAuthor(authorEntity);
		return authorEntity;
	}

	// call the list of author
	public void callListAuthor() {
		ad.printAll();
	}

	// Return author solicited in the main
	public AuthorEntity searchAuthor(int id) throws Exception {
		ArrayList<AuthorEntity> auth = (ArrayList<AuthorEntity>) ad.searchAuthor();
		AuthorEntity au;
		/*
		 * stream () converts the list to a Stream. filter () applies a predicate to the
		 * Product that processes the Stream and considers it valid if it evaluates to
		 * true. In this case the predicate is the lambda p -> p.getId (). Equals (id)
		 * which simply checks for equality. finAny () causes the stream to finish
		 * processing as soon as it finds an element. orElse (): in case the Optional
		 * returned by findAny is empty causes it to return what we passed in the method
		 * parameter
		 */
		au = auth.stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);
		if (au == null) {
			throw new Exception("Id no encontrado");
		}
		return au;
	}

	// search author for name
	public void searchAuthorForName() throws Exception {
		try {
			System.out.println("----WELCOME TO SEARCH AUTHOR FOR NAME SECTION----");
			System.out.println("Insert the name of author to search");
			String name = sn.nextLine();
			if (name != "" || name != null) {
				List<AuthorEntity> a = ad.searchAuthorForName(name);
				if (a == null) {
					System.out.println("NO FOUND RESULT");
				} else {
					System.out.println("Result FOUND for name " + name);
					a.forEach(print -> System.out.println(print));
					System.out.println("--FIN RESULT--");
				}
			} else {
				throw new Exception("Name Empty return the menu");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}

	}

	// update author selected
	public AuthorEntity updateAuthor(int id) throws Exception {
		try {
			if (!(id <= 0)) {
				AuthorEntity au = searchAuthor(id);
				System.out.println("----WELCOME TO MODIFY SECTION----");
				System.out.println("Modify name the author");
				System.out.println("ACTUAL NAME = " + au.getName());
				String name = sn.nextLine();

				if (!name.isEmpty()) {
					au.setName(name);
					ad.updateAuthor(au);
				} else {
					System.out.println("name empty no modify");
				}
				return au;
			} else {
				throw new Exception("id Empty");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	// Deleted the author
	public AuthorEntity deletedAuthor(int id) throws Exception {
		try {
			if (!(id <= 0)) {
				AuthorEntity auto = searchAuthor(id);
				ad.deleted(auto);
				return auto;
			} else {
				throw new Exception("id Empty");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

}
