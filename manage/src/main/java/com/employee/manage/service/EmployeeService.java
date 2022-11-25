package com.employee.manage.service;


import java.util.List;
import com.employee.manage.model.*;
import org.springframework.data.domain.Page;

import com.employee.manage.*;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}

