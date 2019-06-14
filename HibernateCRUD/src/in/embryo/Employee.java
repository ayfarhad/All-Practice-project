package in.embryo;
// Generated May 28, 2019 9:19:56 PM by Hibernate Tools 5.2.11.Final

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EmpTbl generated by hbm2java
 */
@Entity
@Table(name = "EMP_TBL", schema = "BMS")
public class Employee implements java.io.Serializable {

	private int eno;
	private String name;
	private BigDecimal salary;

	public Employee() {
	}

	public Employee(int eno) {
		this.eno = eno;
	}

	
	public Employee(int eno, String name, BigDecimal salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	public Employee( String name, BigDecimal salary) {
		
		this.name = name;
		this.salary = salary;
	}

	
	@Id
//	@SequenceGenerator(name="eno_seq_emp",allocationSize=1,initialValue=100)
//	@GeneratedValue(generator="eno_seq_emp", strategy=GenerationType.SEQUENCE)
	@Column(name = "ENO", precision=4, scale=0)
	public int getEno() {
		return this.eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	@Column(name = "NAME", length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "SALARY", precision = 10, scale=2)
	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
