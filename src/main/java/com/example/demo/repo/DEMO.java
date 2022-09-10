package com.example.demo.repo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "DEMO")
@Entity
public class DEMO {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID")
	private String id;

	@Column(name = "USERNAME")
	private String userName;

	@Column(name = "SELECTEDSEATS")
	private String selectedSeats;
}
