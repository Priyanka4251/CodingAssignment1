package com.Prospecta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Prospecta.exception.Table1Exception;
import com.Prospecta.model.table1;
import com.Prospecta.repository.table1Dao;

@Service
public class table1ServiceImpl implements table1Service {

	@Autowired
	private table1Dao tdao;
	
	
	
	@Override
	public List<table1> listAsperCategory(String category) throws Table1Exception {
		
		table1 table = null;
		
		if(category=="x") {
			 table=new table1(88,"title1","description1", category);
		}
		
		List<table1> list= tdao.findByCategory(category);
		list.add(table);
		
		tdao.save(table);
		return list;
	}

	@Override
	public table1 save(table1 t) throws Table1Exception {
		
		table1 table=tdao.save(t);
		
		return table;
	}

}
