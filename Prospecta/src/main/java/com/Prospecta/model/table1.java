package com.Prospecta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class table1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String title;
	private String description;
	private String category;
	
	
	public table1(String title, String description, String category) {
		super();
		this.title = title;
		this.description = description;
		this.category = category;
	}
	
	
	
}
