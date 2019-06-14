package in.embryo;

public class Person {

	Integer pid;
	String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
