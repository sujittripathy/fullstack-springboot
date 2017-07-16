package com.example.fullstackboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ParkingSpace {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int lot;
	private String location;
	@OneToOne(mappedBy="parkingSpace")
	private Employee employee;
}
