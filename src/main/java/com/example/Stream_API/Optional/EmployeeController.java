package com.example.Stream_API.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class EmployeeController {

    public EmployeeBook employeeBook;

    public EmployeeController(EmployeeBook employeeBook) {
        this.employeeBook = employeeBook;
    }

    @RequestMapping("/add")
    public Employee add(@RequestParam(value = "firstname") String name,
                    @RequestParam(value = "lastname") String othername,
                    @RequestParam(value = "salary") int salary,
                    @RequestParam(value = "department") int department) {
        return employeeBook.add(name, othername, salary, department);
    }

    @RequestMapping("/max-salary")
    public Employee maxSalaryInDepartment(@RequestParam(value = "departmentId") int department) {
        return employeeBook.maxSalaryInDepartmentSalaryInDepartment(department);
    }

    @RequestMapping("/min-salary")
    public Employee minSalaryInDepartment(@RequestParam(value = "departmentId") int department) {
        return employeeBook.minSalaryInDepartment(department);
    }

    @RequestMapping(value = "/all", params = "department")
    public List<Employee> findByDepartment(@RequestParam(value = "department") int department) {
        return employeeBook.findByDepartment(department);
    }

    @RequestMapping("/all")
    public List<Employee> printAll() {
        return employeeBook.findAll();
    }
}
