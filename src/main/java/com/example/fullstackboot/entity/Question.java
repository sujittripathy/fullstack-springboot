package com.example.fullstackboot.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity
//@Table(name="question")
//@Access(AccessType.FIELD)
public class Question {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String questionBody;
	private String questionHeaderText;
	
	//@OneToMany(mappedBy="question")
	private Collection<Tip> tips;

	//@javax.persistence.Version
	private Integer Version;
	
	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getQuestionBody() {
		return questionBody;
	}

	public void setQuestionBody(String questionBody) {
		this.questionBody = questionBody;
	}

	public String getQuestionHeaderText() {
		return questionHeaderText;
	}

	public void setQuestionHeaderText(String questionHeaderText) {
		this.questionHeaderText = questionHeaderText;
	}

	public Collection<Tip> getTips() {
		return tips;
	}

	public void setTips(Collection<Tip> tips) {
		this.tips = tips;
	}
	
}
