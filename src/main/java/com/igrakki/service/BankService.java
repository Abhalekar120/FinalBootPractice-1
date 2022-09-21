package com.igrakki.service;

import java.util.List;
import java.util.Optional;

import com.igrakki.entity.Bank;

public interface BankService {

	void addData(Bank bank);

	//List<Bank> addCollection( );

	List<Bank> addCollection(List<Bank> bank);

	List<Bank> getData();

	Optional<Bank> getDataById(int studentId);

	Optional<Bank> getDataByGrade(String grade);

	void updateData(Bank studentId);

	void deleteData(Bank studentId);


}
