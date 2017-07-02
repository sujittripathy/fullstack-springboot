package com.example.FullStackBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FullStackBoot.repository.MainRepository;

@Service
public class MainService {

	@Autowired
	private MainRepository mainRepository;
	
	public String[] getAllContacts(){
		return mainRepository.fetchContacts();
	}
}
