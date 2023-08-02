package com.steveowino.SpringServer;

import com.steveowino.SpringServer.model.employee.Employee;
import com.steveowino.SpringServer.model.employee.EmployeeDao;
import org.apache.catalina.LifecycleState;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringServerApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;

	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setName("caroline");
		employee.setBranch("Web ");
		employee.setLocation("Nairobi C");
		employeeDao.save(employee);
	}
	//@Test
	void getAllEmployees(){
		List<Employee> employees = employeeDao.getAllEmployee();
		System.out.println(employees);
		for (Employee employee:employees) {
			employeeDao.delete(employee);
		}
		}
	}


