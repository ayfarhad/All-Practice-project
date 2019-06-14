package in.embryo;

import java.util.Comparator;

public class NameAgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		int nameCompare = o1.getName().compareTo(o2.getName());
		int ageCompare = o1.getPid() - o2.getPid();
		
		if(nameCompare==0) {
			return ageCompare;
		}
		else  {
			return nameCompare;
		}
		
		
	}

}
