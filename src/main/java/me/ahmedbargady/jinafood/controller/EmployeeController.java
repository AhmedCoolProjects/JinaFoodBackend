package me.ahmedbargady.jinafood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ahmedbargady.jinafood.model.Employee;
import me.ahmedbargady.jinafood.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    @GetMapping("/id/{id}")
    public Optional<Employee> get(@PathVariable String id) {
        return employeeService.get(id);
    }

    @GetMapping
    public List<Employee> getall() {
        return employeeService.getall();
    }

    @PostMapping("/add")
    public Employee add(@RequestBody Employee p) {
        return employeeService.add(p);
    }

    @PostMapping("/update")
    public Employee update(@RequestBody Employee p) {
        return employeeService.update(p);
    }

    @GetMapping("/delete/{id}")
    public String delelte(@PathVariable String id) {
        return employeeService.delete(id);
    }

}
