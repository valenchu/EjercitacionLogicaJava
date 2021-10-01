package JpaHibernate.Libreria.Servicio;

import JpaHibernate.Dao.AuthorDao;
import JpaHibernate.Libreria.Entidad.AuthorEntity;

public class AuthorService {
	AuthorDao ad = new AuthorDao();
	//I verify author
	public AuthorEntity createAuthor(AuthorEntity authorEntity) throws Exception {
		if (authorEntity.getName().isEmpty() || authorEntity.getName().equalsIgnoreCase(null)) {
			throw new Exception("Name empty or null");//I verify author name
		}

		ad.createAuthor(authorEntity);
		return authorEntity;
	}
	public void callListAuthor() {
		ad.printAll();
	}

}
