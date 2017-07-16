package com.example.fullstackboot.entity;

import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne
	@JoinColumn(name="PSPACE_ID")
	private ParkingSpace parkingSpace;
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	private Department department;
	@ManyToMany
	private Collection<Project> projects;
	@OneToMany
	private Collection<Phone> phones;
	@Embedded 
	@AttributeOverrides({
			@AttributeOverride(name="state", column=@Column(name="PROVINCE")),
			@AttributeOverride(name="zip", column=@Column(name="POSTAL_CODE"))
	})
	private Address address;
	
}
