package spring.CRUD.Swagger.sankar.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String descr;
	private Integer yearOfPublication;
	private String bookType;
	
	public Book() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public Integer getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(Integer yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", descr=" + descr + ", yearOfPublication=" + yearOfPublication
				+ ", bookType=" + bookType + "]";
	}
	public Book(int id, String name, String descr, Integer yearOfPublication, String bookType) {
		super();
		this.id = id;
		this.name = name;
		this.descr = descr;
		this.yearOfPublication = yearOfPublication;
		this.bookType = bookType;
	}
	
	
	

}
