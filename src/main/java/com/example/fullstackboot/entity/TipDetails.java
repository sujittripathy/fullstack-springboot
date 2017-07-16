package com.example.fullstackboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


//@Entity
public class TipDetails {

//	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String footerText;
	

//	@OneToOne
	//@MapsId
	@JoinColumn(name="tip_id")
	private Tip tip;

	
	public String getFooterText() {
		return footerText;
	}

	public void setFooterText(String footerText) {
		this.footerText = footerText;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
}
