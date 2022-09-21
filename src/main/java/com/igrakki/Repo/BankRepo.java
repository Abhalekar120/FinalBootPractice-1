package com.igrakki.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igrakki.entity.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {

	Optional<Bank> findByGrade(String grade);

}
