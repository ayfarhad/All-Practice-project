package in.embryo;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import in.embryo.entity.Course;
import in.embryo.entity.Student;
import in.embryo.entity.connection.EntityManagerFactoryUtil;

public class InsertRecord {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setSname("Adil khan");
		Student student1 = new Student();
		student1.setSname("Abdul Hannan");
//		Student student2 = new Student();
//		student.setSname("Rakib Sarkar");
//		Student student3 = new Student();
//		student.setSname("Hasan");
//		
		
		Course course = new Course();
		course.setCname("Oracle");
		Course course1 = new Course();
		course.setCname("Angular");
		Course course2 = new Course();
		course.setCname("Core Java");
		Course course3 = new Course();
		course.setCname("Advance Java");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Course> courseList = new ArrayList<Course>();
		
		studentList.add(student);
//		studentList.add(student1);
		course.setStudents(studentList);
		
		courseList.add(course);
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		
		student.setCourses(courseList);
		
		
		EntityManager entityManager = EntityManagerFactoryUtil.entityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		//Course course2 = entityManager.find(Course.class, 103l);
		//System.out.println(course2.getCname());
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
}
