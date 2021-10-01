package JpaHibernate.Libreria.Entidad;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long isbn;
	private String title;
	private Integer year;
	private Integer models;
	@Column(name = "mod_borrow")
	private Integer modelsBorrowed;
	@Column(name = "mod_remain")
	private Integer modelsRemainings;
	private Boolean top;
	@OneToOne
	private PublisherEntity publisher;
	@OneToOne
	private AuthorEntity author;

	public BookEntity(Long isbn, String title, Integer year, Integer models, Integer modelsBorrowed,
			Integer modelsRemainings, Boolean top, PublisherEntity publisher, AuthorEntity author) {
		this.isbn = isbn;
		this.title = title;
		this.year = year;
		this.models = models;
		this.modelsBorrowed = modelsBorrowed;
		this.modelsRemainings = modelsRemainings;
		this.top = top;
		this.publisher = publisher;
		this.author = author;
	}

	public BookEntity(String title, Integer year, Integer models, Integer modelsBorrowed, Integer modelsRemainings,
			Boolean top, PublisherEntity publisher, AuthorEntity author) {
		this.title = title;
		this.year = year;
		this.models = models;
		this.modelsBorrowed = modelsBorrowed;
		this.modelsRemainings = modelsRemainings;
		this.top = top;
		this.publisher = publisher;
		this.author = author;
	}

	public BookEntity() {
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getModels() {
		return models;
	}

	public void setModels(Integer models) {
		this.models = models;
	}

	public Integer getModelsBorrowed() {
		return modelsBorrowed;
	}

	public void setModelsBorrowed(Integer modelsBorrowed) {
		this.modelsBorrowed = modelsBorrowed;
	}

	public Integer getModelsRemainings() {
		return modelsRemainings;
	}

	public void setModelsRemainings(Integer modelsRemainings) {
		this.modelsRemainings = modelsRemainings;
	}

	public Boolean getTop() {
		return top;
	}

	public void setTop(Boolean top) {
		this.top = top;
	}

	public PublisherEntity getPublisher() {
		return publisher;
	}

	public void setPublisher(PublisherEntity publisher) {
		this.publisher = publisher;
	}

	public AuthorEntity getAuthor() {
		return author;
	}

	public void setAuthor(AuthorEntity author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookEntity [isbn=" + isbn + ", title=" + title + ", year=" + year + ", models=" + models
				+ ", modelsBorrowed=" + modelsBorrowed + ", modelsRemainings=" + modelsRemainings + ", top=" + top
				+ ", publisher=" + publisher + ", author=" + author + "]";
	}

}
