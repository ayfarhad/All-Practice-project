package in.embryo;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmployeeHandaler extends DefaultHandler{

	private StringBuffer data;
	private ArrayList<Employee> empList;
	private Employee employee;
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		data = new StringBuffer();
		data.append(ch, start, length);
	}
	
	@Override
	public void startDocument() throws SAXException {
		empList = new ArrayList<Employee>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("employee")) {
			 employee = new Employee();
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("eno")) {
			employee.setEno(Integer.parseInt(data.toString()));
		}
		if(qName.equals("name")) {
			employee.setName(data.toString());
		}
		if(qName.equals("salary")) {
			employee.setSalary(Double.parseDouble(data.toString()));
		}
		
		if(qName.equals("employee")) {
			empList.add(employee);
		}
	}
	
	public ArrayList<Employee> getEmployeeList() {
		return empList;
	}
}
