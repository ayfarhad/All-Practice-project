package in.embryo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJPAEmployeeApplication {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJPAEmployeeApplication.class, args);
	}

	@PostConstruct
	public void operation() {
				
		Date dob = null;
		try {
			dob = new SimpleDateFormat("yyyy-MM-dd").parse("2016-12-22");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long time = dob.getTime();
//		
//		employeeRepository.save(new Employee("Fariyad", 56000d, new java.sql.Date(time)));
		
//		Iterable<Employee> empList = employeeRepository.findAllOrderBySalary();
//		
		List<Employee> empList = employeeRepository.findByDoj(new java.sql.Date(time));

		
		empList.forEach(employee->{
			System.out.println(employee.getName()+"--"+employee.getSalary()+"---"+employee.getDoj());
		});
		
		
	}
}
