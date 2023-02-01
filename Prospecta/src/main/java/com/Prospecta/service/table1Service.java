package com.Prospecta.service;

import java.util.List;

import com.Prospecta.exception.Table1Exception;
import com.Prospecta.model.table1;

public interface table1Service {
	
	public List<table1> listAsperCategory(String category) throws Table1Exception;

	public table1 save(table1 t) throws Table1Exception;

}
