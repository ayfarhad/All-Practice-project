package in.embryo;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class App {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		EmployeeHandaler employeeHandaler = new EmployeeHandaler();
		saxParser.parse("employee.xml", employeeHandaler);
		
		ArrayList<Employee> empList = employeeHandaler.getEmployeeList();
		empList.forEach(employee -> {
			System.out.println(employee.getEno());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
		});
		
	}
}
