package in.embryo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	@Query(value="select e from Employee e order by e.doj desc")
	List<Employee> findAllOrderBySalary();
	
	List<Employee> findByDoj(Date date);
}
