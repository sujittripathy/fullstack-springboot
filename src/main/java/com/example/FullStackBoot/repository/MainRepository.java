package com.example.fullstackboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstackboot.entity.Question;

public interface MainRepository {//extends JpaRepository<Question, Integer>{

	
	default public String[] fetchContacts(){
		return new String[]{"apple","orange","guava"};
	}
}
