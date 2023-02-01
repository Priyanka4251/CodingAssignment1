package com.Prospecta.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Prospecta.exception.Table1Exception;
import com.Prospecta.model.table1;
import com.Prospecta.service.table1Service;

@RestController
public class table1Controller {
	
	@Autowired
	private table1Service tService;
	
	
	@GetMapping("/Listed")
	public ResponseEntity<List<table1>> Listed(@Valid @RequestParam String category) throws Table1Exception {
		List<table1> table= tService.listAsperCategory(category);
		
		return new ResponseEntity<List<table1>>(table,HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<table1> saveTable1(@Valid @RequestBody table1 t) throws Table1Exception {
		table1 table=tService.save(t);
		
		return new ResponseEntity<table1>(table,HttpStatus.CREATED);
	}
}
