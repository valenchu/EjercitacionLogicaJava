package JpaHibernate.Dao;

import java.util.List;

import JpaHibernate.Libreria.Entidad.AuthorEntity;
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

	// update
	public void updateBook(BookEntity book) {
		try {
			em.getTransaction().begin();
			em.merge(book);
			em.getTransaction().commit();
		} catch (Exception e) {
			try {
				em.getTransaction().rollback();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();

		}
	}

	// Deleted book
	public void deleted(BookEntity book) {
		try {
			em.getTransaction().begin();
			em.remove(book);
			em.getTransaction().commit();

		} catch (Exception e) {
			try {
				em.getTransaction().rollback();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			e.printStackTrace();

		}
	}

	// print list book
	public void printAll() {
		List<BookEntity> book = (List<BookEntity>) em.createQuery("FROM BookEntity WHERE top = true").getResultList();
		System.out.println("The amount of books there are in BD is : " + book.size());
		book.forEach(au -> {
			if (au.getAuthor().getTop() != false && au.getPublisher().getTop() != false) {
				System.out.println(au.toString());
			} else {
				System.out.println("NO FOUND");
			}
		});
	}

	// Search and return list of book for insert in the book
	public List<BookEntity> searchAuthor() {
		List<BookEntity> book = (List<BookEntity>) em.createQuery("FROM BookEntity WHERE top = true").getResultList();
		System.out.println("The amount of books there are in BD is : " + book.size());
		return book;

	}
}
