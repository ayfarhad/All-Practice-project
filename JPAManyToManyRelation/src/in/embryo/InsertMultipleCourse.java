package in.embryo;

import java.util.List;

import javax.persistence.EntityManager;

import in.embryo.entity.Course;
import in.embryo.entity.Student;
import in.embryo.entity.connection.EntityManagerFactoryUtil;

public class InsertMultipleCourse {

	public static void main(String[] args) {
		
		EntityManager entityManager = EntityManagerFactoryUtil.entityManager();
		entityManager.getTransaction().begin();
		
		Course angularCourse = entityManager.find(Course.class, 147l);
		Course oracleCourse = entityManager.find(Course.class, 148l);
		
		
		Student student = new Student();
		student.setSname("Abdul Hannan");
		List<Course> coursesList = student.getCourses();
		coursesList.add(angularCourse);
		coursesList.add(oracleCourse);
		student.setCourses(coursesList);
		
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		
		
		entityManager.close();
	}
}
