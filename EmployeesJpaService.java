package com.project.AssignmentLombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesJpaService {
    @Autowired
    private com.project.AssignmentLombok.EmployeesJpaRepository ejr;

    public List<EmployeesJpa> getAllEmployeesJpa(){
        return ejr.findAll();
    }
    public void addEmployeesJpa(EmployeesJpa ej){
        ejr.save(ej);
    }
    public Optional<EmployeesJpa> getEmployeesJpaById(String id){
        return ejr.findById(id);
    }
    public void updateEmployeesJpa(EmployeesJpa ej,String id){
        ejr.save(ej);
    }
    public void deleteEmployeesJpa( String id,EmployeesJpa ej){
        ejr.delete(ej);
    }


}
