package embryo.in.demo;

import java.io.File;
import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class App {

	public static void main(String[] args) throws JAXBException {
		
		EmployeeType employee1 = new EmployeeType();
		employee1.setEno(new BigInteger("101"));
		employee1.setName("Korim");
		employee1.setSalary(10000d);
		
		EmployeeType employee2 = new EmployeeType();
		employee2.setEno(new BigInteger("102"));
		employee2.setName("Hannan");
		employee2.setSalary(22000d);
		
		EmployeeType employee3 = new EmployeeType();
		employee3.setEno(new BigInteger("103"));
		employee3.setName("Sanjeeb");
		employee3.setSalary(300000d);
		
		EmployeesType employeesType = new EmployeesType();
		List<EmployeeType> empList = employeesType.getEmployee();
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		
		ObjectFactory objectFactory = new ObjectFactory();
		JAXBElement<EmployeesType> jaxbElement = objectFactory.createEmployees(employeesType);
		
		JAXBContext jaxbContext = JAXBContext.newInstance("embryo.in.demo");
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(jaxbElement, new File("employee.xml"));
	}
}
