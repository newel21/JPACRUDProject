package com.skilldistillery.nba.entities;

import javax.persistence.*;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	
	private String firstName;
	private String lastName;
}
