package in.embryo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	@SequenceGenerator(name="emp_id_seq",initialValue=1, allocationSize=1)
	@GeneratedValue(generator="emp_id_seq",strategy=GenerationType.SEQUENCE)
	private Integer empId;
	private String name;
	private Double salary;
	private Date doj;
	
	
	
	
	public Employee() {
		super();
	}
	public Employee(Integer empId, String name, Double salary, Date doj) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	public Employee(String name, Double salary, Date doj) {
		super();
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	
	
	
}
