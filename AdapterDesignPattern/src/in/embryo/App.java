package in.embryo;

public class App {

	public static void main(String[] args) {
		CollegeImpl collegeImpl = new CollegeImpl();
		SchoolAdapter schoolAdapter = new SchoolAdapter(collegeImpl);
		schoolAdapter.schoolName();
	}
}
