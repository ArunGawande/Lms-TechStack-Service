package com.bridgelabz.lmstechstackservice.repository;
/*
 * Purpose : TechStackRepository Are Used to Store the Data into Database
 * */

import com.bridgelabz.lmstechstackservice.model.TechStackModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechStackRepository extends JpaRepository<TechStackModel, Long> {
}