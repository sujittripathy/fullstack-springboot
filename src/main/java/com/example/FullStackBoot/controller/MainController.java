package com.example.fullstackboot.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

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
