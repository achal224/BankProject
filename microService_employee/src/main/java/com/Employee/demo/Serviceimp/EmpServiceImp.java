package com.Employee.demo.Serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.demo.Serviceint.EmoServiceInt;
import com.Employee.demo.homerepo.HomeRepo;
import com.Employee.demo.model.Employee;

@Service
public class EmpServiceImp implements EmoServiceInt {

	@Autowired
	HomeRepo hr;

	@Override
	public void saveemp(Employee e) {
		hr.save(e);
		
	}

	@Override
	public Iterable getAlldata() {
		List<Employee> l=(List<Employee>) hr.findAll();
		return l;
	}
	
	
	
}
