package in.embryo;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertRecord {

	public static void main(String[] args) {
		
		Employee employee = new Employee(103,"Jamser",new BigDecimal(30000d));
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.saveOrUpdate(employee);
		session.getTransaction().commit();		
		session.close();
		sessionFactory.close();
	
	}
}
