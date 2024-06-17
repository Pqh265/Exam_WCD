package org.aptech.t2208e.controller;

import org.aptech.t2208e.dto.EmployeeDto;
import org.aptech.t2208e.service.EmployeeService;
import org.aptech.t2208e.service.impl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    EmployeeService employeeService = new EmployeeServiceImpl();


    @GetMapping("/all_employees")
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeDto> employeeDtos = employeeService.getAll();
        return employeeDtos;
    }




    @PutMapping(value = "/employee/create")
    public Optional<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
            Optional<EmployeeDto> createdEmployee = employeeService.createEmployee(employeeDto);
            return createdEmployee;

    }


}
