package com.employeemanagement.employeedemo.controller;

import com.employeemanagement.employeedemo.dto.EmployeeDTO;
import com.employeemanagement.employeedemo.entity.EmployeeEntity;
import com.employeemanagement.employeedemo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/add")
    public String addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping("/get")
    public List<EmployeeEntity> getAllEmployees(@RequestParam(defaultValue = "0") int pageNum,
                                                @RequestParam(defaultValue = "5") int pageSize){
        return employeeService.getAllEmployees(PageRequest.of(pageNum, pageSize));
    }
}
