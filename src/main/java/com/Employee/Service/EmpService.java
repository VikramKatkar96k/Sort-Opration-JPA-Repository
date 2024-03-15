package com.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Employee.Entity.Employee;
import com.Employee.respo.IEmployee;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@Service
public class EmpService {
	private IEmployee ieEmployee;

	@Autowired
	public EmpService(IEmployee ieEmployee) {
		System.out.println("perform Autowiring");
		this.ieEmployee = ieEmployee;
	}

	public void findAllRecord() {
		System.out.println("All Record Display :");
		List<Employee> list = ieEmployee.findAll();
		list.forEach(System.out::println);
	}

	public void SortRecord(String column) {
		System.out.println("sort data base on " + column);
		Sort sort = Sort.by(column);
		Iterable<Employee> findAll = ieEmployee.findAll(sort.descending());
		findAll.forEach(System.out::println);
	}

	public void ExampleOfPageNation(Integer pagenumber, Integer pagesize) {
		System.out.print("page nation PageNumber: ");
		System.out.println(pagenumber - 1 + " pagesize: " + pagesize);
		PageRequest request = PageRequest.of(pagenumber - 1, pagesize);
		Page<Employee> page = ieEmployee.findAll(request);
		page.forEach(System.out::println);
	}

	public void ExampleOfQBE() {
		System.out.println("Example of Query by example");
		Employee emp = new Employee();
		emp.setENAME("KING");
		emp.setJOB("PRESIDENT");
		Example<Employee> of = Example.of(emp);
		List<Employee> findAll = ieEmployee.findAll(of);
		findAll.forEach(System.out::println);

	}
}
