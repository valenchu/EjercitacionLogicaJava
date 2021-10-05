package JpaHibernate.Dao;

import java.util.List;

import JpaHibernate.Libreria.Entidad.AuthorEntity;

public class AuthorDao extends Dao {
	// Create
	public void createAuthor(AuthorEntity authorEntity) {
		try {
			em.getTransaction().begin();
			em.persist(authorEntity);
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

	// update
	public void updateAuthor(AuthorEntity authorEntity) {
		try {
			em.getTransaction().begin();
			em.merge(authorEntity);
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
	//Deleted
	public void deleted(AuthorEntity authorEntity) {
		try {
			em.getTransaction().begin();
			em.remove(authorEntity);
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

	// search and print all author
	public void printAll() {
		List<AuthorEntity> author = (List<AuthorEntity>) em.createQuery("FROM AuthorEntity WHERE top = true")
				.getResultList();
		System.out.println("The cant of authors there are in BD is : " + author.size());
		author.forEach(au -> System.out.println(au.toString()));
	}

	// Search and return list of author for insert in the book
	public List<AuthorEntity> searchAuthor() {
		List<AuthorEntity> author = (List<AuthorEntity>) em.createQuery("FROM AuthorEntity WHERE top = true")
				.getResultList();
		System.out.println("The cant of publisher there are in BD is : " + author.size());
		return author;

	}

}
