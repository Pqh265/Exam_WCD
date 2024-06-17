package org.aptech.t2208e.repository;


import org.aptech.t2208e.dto.EmployeeDto;
import org.aptech.t2208e.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    List<Employee> getAll();
    Optional<Employee> createEmployee(EmployeeDto employeeDto);

}
