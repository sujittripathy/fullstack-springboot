package com.example.fullstackboot.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.fullstackboot.entity.Question;
import com.example.fullstackboot.entity.Tip;
import com.example.fullstackboot.repository.MainRepository;

@RestController
public class MainController {

	@Autowired
	private MainRepository mainRepository;
	
	@RequestMapping(method = RequestMethod.GET,
					value = "/sample",
					produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,List<Hotel>> sampleMethod(){
		Map<String, List<Hotel>> map = new LinkedHashMap<>();
		Hotel h1 = new Hotel(100, "hotel-1");
		Hotel h2 = new Hotel(200, "hotel-2");
		Hotel h3 = new Hotel(300, "hotel-3");
		List<Hotel> listHotel = new ArrayList<>();
		listHotel.add(h1);
		listHotel.add(h2);
		listHotel.add(h3);
		
		
		map.put("hotellist", listHotel);
		return map;
	}
	
	@RequestMapping(value = "/questions/{ques_id}", method = RequestMethod.GET)
	public String getAllQuestions(@PathVariable("ques_id") Integer ques_id){
		StringBuffer strBuf = new StringBuffer();
		Question ques = mainRepository.findOne(ques_id);
		strBuf.append(ques.getQuestionBody()).append(ques.getQuestionHeaderText());
		//ques.getTips().forEach(a -> strBuf.append(a.getTipHeader()).append(a.getTipBody()));


		System.out.println("Called getAllQuestions method >>>" + strBuf.toString());
		
		
		
//		Question ques = new Question();
//		ques.setQuestionHeaderText("Question 1 header");
//		ques.setQuestionBody("Question 1 Body ");
//		
//		
//		Tip tip1 = new Tip();
//		tip1.setTipBody("Tip 1 Body");
//		tip1.setTipHeader("Tip 1 Header");
//		
//		Collection<Tip> tipList = new ArrayList<>();
//		tipList.add(tip1);
//
//		tip1.setQuestion(ques);
//		ques.setTips(tipList);
//		
//		Question q = mainRepository.save(ques);
//		System.out.println("SAVED..." + q.getId());
		
		
		return strBuf.toString();
	}
	
	@RequestMapping(method = RequestMethod.POST,
			value = "/hello",
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String helloMethod(){
		return "hello";
	}
	
	private class Hotel {
		private int id;
		private String name;
		
		public Hotel(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}
		
	}
}
