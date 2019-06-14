package in.embryo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;

/**
 * @author FARHAD
 *
 */
@Configuration
@Entity
@Table(name="Student_reg_tbl")
public class Student {

	@Id
	@Column(precision=5, scale=0)
	private Integer id;
	@Column(length=20)
	private String name;
	@Column(length=8)
	private Boolean male;
	@Column(precision=3, scale=2)
	private Double marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String name, Boolean male, Double marks) {
		super();
		this.id = id;
		this.name = name;
		this.male = male;
		this.marks = marks;
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
	public Boolean getMale() {
		return male;
	}
	public void setMale(Boolean male) {
		this.male = male;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
	
}
