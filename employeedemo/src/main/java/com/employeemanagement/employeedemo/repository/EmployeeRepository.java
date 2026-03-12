package com.employeemanagement.employeedemo.repository;

import com.employeemanagement.employeedemo.entity.EmployeeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<EmployeeEntity, String> {
}
