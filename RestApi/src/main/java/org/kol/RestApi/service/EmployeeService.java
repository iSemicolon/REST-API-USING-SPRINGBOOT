package org.kol.RestApi.service;

import java.util.List;

import org.kol.RestApi.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
