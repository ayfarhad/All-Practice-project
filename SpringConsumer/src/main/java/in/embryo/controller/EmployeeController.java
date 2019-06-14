package in.embryo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.embryo.client.EmployeeService;
import in.embryo.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/{eno}")
	public Employee getAll(@PathVariable("eno") Integer eno) {
		Employee employee = employeeService.getEmpoyeeByEno(eno);
		return employee;
	}
}
