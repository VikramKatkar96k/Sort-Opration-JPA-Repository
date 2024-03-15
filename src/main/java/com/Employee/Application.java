package com.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Employee.Service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpService bean = context.getBean(EmpService.class);
		// bean.findAllRecord();
		bean.SortRecord("ENAME");
		// bean.ExampleOfPageNation(2,5);
		// bean.ExampleOfQBE();
	}

}
