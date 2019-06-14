package in.embryo.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.embryo.entity.Employee;

@Component
public class EmployeeService {

	
	public Employee getEmpoyeeByEno(Integer eno) {
		RestTemplate restTemplate = new RestTemplate();
		Employee employee = restTemplate.getForObject("http://localhost:9010/getEmployeeByEno/"+eno, Employee.class);
		System.out.println(employee.getEno());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		return employee;
	}
}
