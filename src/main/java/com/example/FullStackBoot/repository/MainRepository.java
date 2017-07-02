package com.example.FullStackBoot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MainRepository {

	public String[] fetchContacts(){
		return new String[]{"apple","orange","guava"};
	}
}
