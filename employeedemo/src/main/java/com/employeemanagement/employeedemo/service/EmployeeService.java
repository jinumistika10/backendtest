package com.employeemanagement.employeedemo.service;

import com.employeemanagement.employeedemo.dto.EmployeeDTO;
import com.employeemanagement.employeedemo.entity.EmployeeEntity;
import com.employeemanagement.employeedemo.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public String addEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = EmployeeEntity.builder()
                .name(employeeDTO.getName())
                .role(employeeDTO.getRole())
                .salary(employeeDTO.getSalary())
                .build();
        employeeRepository.save(employeeEntity);
        return "Employee was added";
    }

    public List<EmployeeEntity> getAllEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable).getContent();
    }
}
