package com.example.fullstackboot.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//@Entity
//@Table(name="tip")
public class Tip {

//	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String tipHeader;
	private String tipBody;
	
	//@ManyToOne
	//@JoinColumn(name="question_id")
	private Question question;

	//@OneToOne(mappedBy="tip",fetch=FetchType.LAZY)
	private TipDetails tipDetails;
	
	public Integer getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getTipHeader() {
		return tipHeader;
	}

	public void setTipHeader(String tipHeader) {
		this.tipHeader = tipHeader;
	}

	public String getTipBody() {
		return tipBody;
	}

	public void setTipBody(String tipBody) {
		this.tipBody = tipBody;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public TipDetails getTipDetails() {
		return tipDetails;
	}

	public void setTipDetails(TipDetails tipDetails) {
		this.tipDetails = tipDetails;
	}
	
	
}
