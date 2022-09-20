package com.igrakki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.igrakki.entity.Bank;
import com.igrakki.service.BankService;

@RestController
public class BankController {
	@Autowired
	private BankService service;

	@PostMapping("/bank")
	public String addData(@RequestBody Bank bank) {
		service.addData(bank);
		return "Data Added Sucesfully";
	}

	@PostMapping("/banks")
	public List<Bank> addCollection(@RequestBody List<Bank> bank) {
		return service.addCollection(bank);
	}

	@GetMapping("/bank")
	public List<Bank> getData() {
		return service.getData();
	}

	@GetMapping("/bank/{studentId}")
	public Bank getDataById(@PathVariable int studentId) {
		return service.getDataById(studentId);
	}

	@GetMapping("/banks/{grade}")
	public Bank getDataByGrade(@PathVariable String grade) {
		return service.getDataByGrade(grade);
	}

	@PutMapping("/bank/{studentId}")
	public String updateData(@RequestBody Bank studentId) {
		service.updateData(studentId);
		return "Update Sucessfully";
	}

	@DeleteMapping("/bank/{studentId}")
	public String deleteData(@PathVariable Bank studentId) {
		service.deleteData(studentId);
		return "Deleted Sucessfully";
	}
}