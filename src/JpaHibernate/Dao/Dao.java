package JpaHibernate.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import JpaHibernate.Libreria.Entidad.AuthorEntity;

public class Dao {

	protected EntityManager em = Persistence.createEntityManagerFactory("aplicacion").createEntityManager();

}
