package org.aptech.t2208e.mapper;


import org.aptech.t2208e.dto.EmployeeDto;
import org.aptech.t2208e.entity.Employee;

public interface EmployeeMapper {
    Employee dtoToEntity(EmployeeDto dto);
    EmployeeDto entityToDto(Employee entity);
}
