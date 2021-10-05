package JpaHibernate.Libreria.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "author")
@SQLDelete(sql = "UPDATE Author SET top = false WHERE id=?")
public class AuthorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private Boolean top;

	public AuthorEntity(Integer id, String name, Boolean top) {
		this.id = id;
		this.name = name;
		this.top = top;
	}

	public AuthorEntity(String name, Boolean top) {
		this.name = name;
		this.top = top;
	}

	public AuthorEntity() {
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
		return "AuthorEntity [id=" + id + ", name=" + name + ", top=" + top + "]";
	}

}
