package com.igrakki.service;

import java.util.List;

import com.igrakki.entity.Bank;

public interface BankService {

	void addData(Bank bank);

	//List<Bank> addCollection( );

	List<Bank> addCollection(List<Bank> bank);

	List<Bank> getData();

	public Bank getDataById(int studentId);

	public Bank getDataByGrade(String grade);

	void updateData(Bank studentId);

	void deleteData(Bank studentId);


}
