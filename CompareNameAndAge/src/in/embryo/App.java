package in.embryo;

import java.util.ArrayList;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "Farhad"));
		list.add(new Person(48, "Manirul"));
		list.add(new Person(6, "Hannan"));
		list.add(new Person(3, "Farhad"));
		list.add(new Person(34, "Fariyad"));
		list.add(new Person(1, "Hannann"));
//		
//		Collections.sort(list,
//			new Comparator<Person>() {
//
//				@Override
//				public int compare(Person o1, Person o2) {
//					int nameCompare = o1.getName().compareTo(o2.getName());
//					//int ageCompare = o1.getPid() - o2.getPid();
//					
////					if(nameCompare==0) {
////						return ((ageCompare==0)? nameCompare:ageCompare);
////					}else {
////						return nameCompare;
////					}
//					return nameCompare;
//				}
//			}
//		);
		
		Iterator<Person> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getPid()+"   "+iterator.next().getName());
		}
	}
}
