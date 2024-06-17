package org.aptech.t2208e.mapper.impl;

import org.aptech.t2208e.dto.EmployeeDto;
import org.aptech.t2208e.entity.Employee;
import org.aptech.t2208e.mapper.EmployeeMapper;
import org.springframework.beans.BeanUtils;

public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public Employee dtoToEntity(EmployeeDto dto) {
        Employee employee  = new Employee();
        BeanUtils.copyProperties(dto,employee);
        return employee;
    }

    @Override
    public EmployeeDto entityToDto(Employee entity) {
        EmployeeDto dto = new EmployeeDto();
        BeanUtils.copyProperties(entity,dto);
        return dto;
    }
}

