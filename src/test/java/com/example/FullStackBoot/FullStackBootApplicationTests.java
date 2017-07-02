package com.example.FullStackBoot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
//@WebMvcTest(MainController.class)
@SpringBootTest
public class FullStackBootApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void saySampleTest() throws Exception {
		this.mockMvc.perform(get("/sample").contentType(MediaType.TEXT_PLAIN_VALUE))
						.andExpect(content().string("sample"));
	}
	
	@Test
	public void sayHelloTest() throws Exception {
		this.mockMvc.perform(post("/hello").contentType(MediaType.APPLICATION_JSON_VALUE))
						.andExpect(content().string("hello"));
	}

}
