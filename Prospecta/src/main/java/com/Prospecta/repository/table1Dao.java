package com.Prospecta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Prospecta.model.table1;

@Repository
public interface table1Dao extends JpaRepository<table1, Integer> {

	public List<table1> findByCategory(String category);

}
