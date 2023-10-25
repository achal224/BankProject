package com.Employee.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Employee.demo.Serviceint.EmoServiceInt;
import com.Employee.demo.model.Employee;

@RestController
public class EmpController {


	@Autowired
	EmoServiceInt esi;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "Employee Client";
	}
	
	@PostMapping("/saveemp")
	public String saveemp(@RequestBody Employee e)
	{
		esi.saveemp(e);
		return "Data Saved";
	}
	
	@RequestMapping("/getAlldata")
	public Iterable getAlldata()
	{
		Iterable list=esi.getAlldata();
		return list;
	}
}
