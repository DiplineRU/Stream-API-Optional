package com.example.Stream_API.Optional;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeBook {
    private List<Employee> employees;

    public EmployeeBook(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee maxSalaryInDepartmentSalaryInDepartment(int deparment) {
        return employees.stream()
                .filter(deparmentt -> deparmentt.getDepartment() == deparment)
                .toList()
                .stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .get();
    }

    public Employee minSalaryInDepartment(int deparment) {
        return employees.stream()
                .filter(deparmentt -> deparmentt.getDepartment() == deparment)
                .toList()
                .stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .get();
    }

    public List<Employee> findByDepartment(int department) {
        return
                employees.stream()
                        .filter(departmentt -> departmentt.getDepartment() == department)
                        .toList();
    }

    public Employee add(String firstname, String lastname, int salary, int department) {
        int id = 0;
        if (employees.size() == 0) {
            id = 1;
        } else {
            id = employees.stream()
                    .max(Comparator.comparingInt(Employee::getId))
                    .get().getId() + 1;
        }
        Employee employee = new Employee(firstname, lastname, salary, department, id);
        this.employees.add(employee);
        return employee;
    }

    public List<Employee> findAll() {
        return this.employees;
    }
}
