package JpaHibernate.Dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Dao {

	protected EntityManager em = Persistence.createEntityManagerFactory("aplicacion").createEntityManager();

}
