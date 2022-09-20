package com.igrakki.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.igrakki.entity.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {

	Bank findByStudentId(int studentId);

	Bank findByGradeId(String grade);

}
