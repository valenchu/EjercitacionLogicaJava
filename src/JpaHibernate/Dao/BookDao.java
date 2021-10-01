package JpaHibernate.Dao;

public class BookDao extends Dao {

	public void searchAllBook() {
		em.createQuery("SELECT * FROM BookEntity be");
	}

	public void createBook() {

	}

}
