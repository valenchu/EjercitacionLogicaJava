package JpaHibernate.Dao;

import java.util.List;

import JpaHibernate.Libreria.Entidad.BookEntity;

public class BookDao extends Dao {

	// create a book
	public void createBook(BookEntity bookEntity) {
		try {
			em.getTransaction().begin();
			em.persist(bookEntity);
			em.getTransaction().commit();
		} catch (Exception e) {
			try {
				em.getTransaction().rollback();
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println(ex.getMessage());
			}
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}

	// print list book
	public void printAll() {
		List<BookEntity> book = (List<BookEntity>) em.createQuery("FROM BookEntity WHERE top = true").getResultList();
		System.out.println("The cant of books there are in BD is : " + book.size());
		book.forEach(au -> System.out.println(au.toString()));
	}
}
