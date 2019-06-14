package in.embryo.entity.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {
	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		 entityManagerFactory = Persistence.createEntityManagerFactory("JPAManyToManyRelation");
	}

	private EntityManagerFactoryUtil() {

	}
	
	public static EntityManagerFactory createEntityManagerFactory() {
		return entityManagerFactory;
	}
	
	public static EntityManager entityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
