package embryo.in.demo;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

public class Unmarshaller {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance("embryo.in.demo");
		javax.xml.bind.Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Object object = unmarshaller.unmarshal(new File("employee.xml"));
		System.out.println(object);
		JAXBElement<EmployeesType> employees = (JAXBElement<EmployeesType>) object;
		EmployeesType employeesType = employees.getValue();
		List<EmployeeType> empList = employeesType.getEmployee();
		empList.forEach(emp->{
			System.out.println(emp.getEno());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		});
	}
}
