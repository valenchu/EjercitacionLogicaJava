package JpaHibernate.Dao;

import java.awt.print.Book;
import java.util.List;

import javax.persistence.Query;

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

	// Search for book title
	public List<BookEntity> searchForTitle(String title) {
		@SuppressWarnings("unchecked")
		List<BookEntity> book = em.createQuery("FROM BookEntity WHERE title LIKE ?1 AND top = true", BookEntity.class)
				.setParameter(1, title + "%").getResultList();
		return book;

	}

	// print list book
	public void printAll() {
		List<BookEntity> book = em.createQuery("FROM BookEntity WHERE top = true").getResultList();
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

	// Search for name of author
	public List<BookEntity> searchForNameTheAuthor(String nameAut) {
		Query query = em.createQuery("SELECT b FROM BookEntity b INNER JOIN b.author a "
				+ "WHERE a.name LIKE ?1 AND b.top = true AND a.top = true").setParameter(1, nameAut + "%");
		List<BookEntity> book = query.getResultList();
		System.out.println("The amount of books there are in BD is : " + book.size());

		return book;
	}

	// Search for name of publisher
	public List<BookEntity> searchForNameThePublisher(String namePub) {
		Query query = em.createQuery("SELECT b FROM BookEntity b INNER JOIN b.publisher p "
				+ "WHERE p.name LIKE ?1 AND b.top = true AND p.top = true").setParameter(1, namePub + "%");
		List<BookEntity> book = query.getResultList();
		System.out.println("The amount of books there are in BD is : " + book.size());

		return book;
	}
}
