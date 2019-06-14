package in.embryo;

public class SchoolAdapter implements School{

	College college;
	
	public SchoolAdapter(College college) {
		this.college = college;
	}
	
	@Override
	public void schoolName() {
		System.out.println("schollName form adapter");
		college.collegeCode();
		college.collegeName();
	}
	
}
