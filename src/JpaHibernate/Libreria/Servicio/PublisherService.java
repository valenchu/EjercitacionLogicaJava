package JpaHibernate.Libreria.Servicio;

import java.util.ArrayList;
import java.util.Scanner;

import JpaHibernate.Dao.PublisherDao;
import JpaHibernate.Libreria.Entidad.PublisherEntity;

public class PublisherService {
	PublisherDao publisherDao = new PublisherDao();
	Scanner sn = new Scanner(System.in);

	// I verify Publisher
	public PublisherEntity createPublisher(PublisherEntity dataObject) throws Exception {
		if (dataObject.getName().isEmpty() || dataObject.getName() == null) {
			throw new Exception("Name empty or null");
		}
		publisherDao.createPublisher(dataObject);
		return dataObject;
	}

	// call the list of publisher
	public void callListPublisher() {
		publisherDao.printAll();
	}

	public PublisherEntity searchPublisher(int id) throws Exception {
		ArrayList<PublisherEntity> publi = (ArrayList<PublisherEntity>) publisherDao.searchPublisher();
		PublisherEntity pub;
		/*
		 * stream () converts the list to a Stream. filter () applies a predicate to the
		 * Product that processes the Stream and considers it valid if it evaluates to
		 * true. In this case the predicate is the lambda p -> p.getId (). Equals (id)
		 * which simply checks for equality. finAny () causes the stream to finish
		 * processing as soon as it finds an element. orElse (): in case the Optional
		 * returned by findAny is empty causes it to return what we passed in the method
		 * parameter
		 */
		pub = publi.stream().filter(p -> p.getId().equals(id)).findAny().orElse(null);

		if (pub == null) {
			throw new Exception("Id no encontrado");
		}
		return pub;

	}

	// update author selected
	public PublisherEntity updatePublisher(int id) throws Exception {
		try {
			if (!(id <= 0)) {
				PublisherEntity publi = searchPublisher(id);
				System.out.println("Modify name the publisher");
				System.out.println("ACTUAL NAME = " + publi.getName());
				String name = sn.nextLine();

				if (!name.isEmpty()) {
					publi.setName(name);
					publisherDao.updatePublisher(publi);
				} else {
					System.out.println("name empty no modify");
				}
				return publi;
			} else {
				throw new Exception("id Empty");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	// Deleted the author
	public PublisherEntity deletedPublisher(int id) throws Exception {
		try {
			if (!(id <= 0)) {
				PublisherEntity publi = searchPublisher(id);
				publisherDao.deleted(publi);
				return publi;
			} else {
				throw new Exception("id Empty");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
}
