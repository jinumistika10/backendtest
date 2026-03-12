package com.employeemanagement.employeedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "employee")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    private String id;
    private String name;
    private String role;
    private double salary;
}
