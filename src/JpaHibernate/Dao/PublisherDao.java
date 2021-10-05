package JpaHibernate.Dao;

import java.util.List;

import JpaHibernate.Libreria.Entidad.AuthorEntity;
import JpaHibernate.Libreria.Entidad.PublisherEntity;

public class PublisherDao extends Dao {
	// Create
	public void createPublisher(Object dataObject) {
		try {
			em.getTransaction().begin();
			em.persist(dataObject);
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
	public void updatePublisher(PublisherEntity entity) {
		try {
			em.getTransaction().begin();
			em.merge(entity);
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

	// Deleted
	public void deleted(PublisherEntity entity) {
		try {
			em.getTransaction().begin();
			em.remove(entity);
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

	// Search and print all publisher
	public void printAll() {
		List<PublisherEntity> publisher = (List<PublisherEntity>) em
				.createQuery("FROM PublisherEntity WHERE top = true").getResultList();
		System.out.println("The cant of publisher there are in BD is : " + publisher.size());
		publisher.forEach(au -> System.out.println(au.toString()));
	}

	// Search and return the publisherd required
	public List<PublisherEntity> searchPublisher() {
		List<PublisherEntity> publisher = (List<PublisherEntity>) em
				.createQuery("FROM PublisherEntity WHERE top = true").getResultList();
		System.out.println("The cant of publisher there are in BD is : " + publisher.size());
		return publisher;

	}

}
