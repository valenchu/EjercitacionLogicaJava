package JpaHibernate.Libreria.Servicio;

import JpaHibernate.Dao.BookDao;
import JpaHibernate.Libreria.Entidad.BookEntity;

public class BookService {
	BookDao book = new BookDao();

	public BookEntity createBook(BookEntity bookEntity) throws Exception {
		if (bookEntity.getTitle().isEmpty() || bookEntity.getTitle() == null) {
			throw new Exception("Title empty or null");
		}
		if (bookEntity.getYear() == 0 || bookEntity.getYear() < 0) {
			throw new Exception("Year empty or less than 0");
		}
		if (bookEntity.getModels() <= 0) {
			throw new Exception("Models empty or less than 0");
		}
		if (bookEntity.getModelsBorrowed() <= 0 || bookEntity.getModelsRemainings() <= 0) {
			throw new Exception("Models Borrowed o Models Remaining less than or equals 0");
		}
		book.createBook(bookEntity);
		return bookEntity;

	}

	public void printAllBook() {
		book.printAll();
	}

}
