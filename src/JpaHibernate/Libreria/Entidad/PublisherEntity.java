package JpaHibernate.Libreria.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publisher")
public class PublisherEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private Boolean top;

	public PublisherEntity(Integer id, String name, Boolean top) {
		this.id = id;
		this.name = name;
		this.top = top;
	}

	public PublisherEntity() {
	}

	public PublisherEntity(String name, Boolean top) {
		this.name = name;
		this.top = top;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getTop() {
		return top;
	}

	public void setTop(Boolean top) {
		this.top = top;
	}

	@Override
	public String toString() {
		return "PublisherEntity [id=" + id + ", name=" + name + ", top=" + top + "]";
	}

}
