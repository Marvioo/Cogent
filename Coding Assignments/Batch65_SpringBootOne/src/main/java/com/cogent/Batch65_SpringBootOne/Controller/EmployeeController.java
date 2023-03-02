package com.cogent.Batch65_SpringBootOne.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cogent.Batch65_SpringBootOne.Entity.Employee;
import com.cogent.Batch65_SpringBootOne.repo.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeRepository empolyeeRepository;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("Add employee");
		return empolyeeRepository.save(employee);
	}
	
	@GetMapping("/get")
	public List<Employee> getEmployee() {
		return empolyeeRepository.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		empolyeeRepository.deleteById(id);
	}
	
	@PutMapping("/update")
	public String updateEmployee() {
		return "Update successfull";
	}
}
