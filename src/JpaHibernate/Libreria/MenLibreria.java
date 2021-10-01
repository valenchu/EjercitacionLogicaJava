package JpaHibernate.Libreria;

import JpaHibernate.Dao.Dao;
import JpaHibernate.Libreria.Entidad.AuthorEntity;
import JpaHibernate.Libreria.Servicio.AuthorService;

public class MenLibreria {

	public static void menLib() {
		try {
			// Create the authors
			AuthorService aus = new AuthorService();
//		AuthorEntity au = new AuthorEntity("Pedro Molina", true);
//		aus.createAuthor(au);
//			for (int i = 0; i < 13; i++) {
//				AuthorEntity au = new AuthorEntity("Jaimito Aleatorio[" + i + "]", true);
//				aus.createAuthor(au);
//			}
			aus.callListAuthor();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
