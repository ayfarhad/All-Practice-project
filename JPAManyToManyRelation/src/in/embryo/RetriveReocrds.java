package in.embryo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import in.embryo.entity.Course;
import in.embryo.entity.Student;
import in.embryo.entity.connection.EntityManagerFactoryUtil;

public class RetriveReocrds {

	public static void main(String[] args) {
		
		EntityManager entityManager = EntityManagerFactoryUtil.entityManager();
//		Student student = entityManager.find(Student.class, 123l);
//		System.out.println(student.getSid()+"  "+student.getSname());
//		List<Course> courses = student.getCourses();
//		courses.forEach(cour->{
//			System.out.println(cour.getCname());
//		});
		
		String query = "SELECT s FROM Student s";
		TypedQuery<Student> typedQuery = entityManager.createQuery(query, Student.class);
		List<Student> studentList = typedQuery.getResultList();
		studentList.forEach(student ->{
			System.out.println(student.getSid()+"  "+student.getSname());
			System.out.println("He is all course name- ");
			List<Course> courseList = student.getCourses();
			courseList.forEach(course->{
				System.out.print(course.getCname()+"  ,  ");
			});
			System.out.println();
			System.out.println("------------------");
			
		});
		
		entityManager.close();
	}
}
