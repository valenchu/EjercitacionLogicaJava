package JpaHibernate.Dao;

import JpaHibernate.Libreria.Entidad.AuthorEntity;

import java.util.List;

public class AuthorDao extends Dao {
	
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

	
	public void printAll() {
		List<AuthorEntity> author = (List<AuthorEntity>) em.createQuery("FROM AuthorEntity").getResultList();
		System.out.println("The cant of authors there are in BD is : " + author.size());
		author.forEach(au -> System.out.println(au.toString()));
	}

}
