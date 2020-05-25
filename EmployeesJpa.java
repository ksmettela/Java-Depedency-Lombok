package com.project.AssignmentLombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class EmployeesJpa {
    @Id
    @Getter
    @Setter
    private String empId;
    private String name;
    private String DOB;
    private String salary;
    private String location;
    private String married;

    public EmployeesJpa() {
    }
}


