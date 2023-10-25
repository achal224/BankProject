package com.Employee.demo.homerepo;

import org.springframework.data.repository.CrudRepository;

import com.Employee.demo.model.Employee;

public interface HomeRepo extends CrudRepository<Employee, Integer> {

}
