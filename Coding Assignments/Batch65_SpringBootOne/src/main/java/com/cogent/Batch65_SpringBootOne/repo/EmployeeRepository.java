package com.cogent.Batch65_SpringBootOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.Batch65_SpringBootOne.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// by default lots of methods available that will do some magic to deal with database connect and query
}
