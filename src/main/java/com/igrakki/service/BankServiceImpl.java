package com.igrakki.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igrakki.Repo.BankRepo;
import com.igrakki.entity.Bank;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankRepo repo;

	@Override
	public void addData(Bank bank) {
		repo.save(bank);
	}

	@Override
	public List<Bank> addCollection(List<Bank> bank) {
		return repo.saveAll(bank);
	}

	@Override
	public List<Bank> getData() {
		return repo.findAll();
	}

	@Override
	public Optional<Bank> getDataById(int studentId) {
		return repo.findById(studentId);
	}

	@Override
	public Optional<Bank> getDataByGrade(String grade) {
		return repo.findByGrade(grade);
	}

	@Override
	public void updateData(Bank studentId) {
		repo.save(studentId);
	}


	@Override
	public void deleteData(Bank studentId) {
		repo.delete(studentId);
		
	}


}

