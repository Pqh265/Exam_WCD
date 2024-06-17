package org.aptech.t2208e.service.impl;

import org.aptech.t2208e.dto.EmployeeDto;
import org.aptech.t2208e.entity.Employee;
import org.aptech.t2208e.mapper.EmployeeMapper;
import org.aptech.t2208e.mapper.impl.EmployeeMapperImpl;
import org.aptech.t2208e.repository.EmployeeRepository;
import org.aptech.t2208e.repository.impl.EmployeeRepositoryImpl;
import org.aptech.t2208e.service.EmployeeService;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    EmployeeMapper employeeMapper = new EmployeeMapperImpl();

    @Override
    public Optional<EmployeeDto> createEmployee(EmployeeDto employeeDto) {
        Optional<Employee> optionalEmployee = employeeRepository.createEmployee(employeeDto);
        return optionalEmployee.map(employeeMapper::entityToDto);
    }



    @Override
    public List<EmployeeDto> getAll() {
        List<Employee> employees = employeeRepository.getAll();
        return employees.stream()
                .map(employeeMapper::entityToDto)
                .collect(Collectors.toList());

    }

}
