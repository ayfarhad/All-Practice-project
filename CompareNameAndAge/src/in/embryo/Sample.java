package in.embryo;

import java.util.ArrayList;
import java.util.Collections;

public class Sample {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(21, "Hanna"));
		list.add(new Person(11,"Manirul"));
		list.add(new Person(3,"Farhad"));
		list.add(new Person(1,"Manirul"));
		list.add(new Person(6, "Hanna"));
		
		Collections.sort(list, new NameAgeComparator());
		
		
		list.forEach(person -> {
			System.out.println(person.getPid()+"  "+person.getName());
		});
	}
}
