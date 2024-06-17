package org.aptech.t2208e.service;

import org.aptech.t2208e.dto.EmployeeDto;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Optional<EmployeeDto> createEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getAll();
}
