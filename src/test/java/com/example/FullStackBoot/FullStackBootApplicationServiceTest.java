package com.example.FullStackBoot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.fullstackboot.repository.MainRepository;
import com.example.fullstackboot.service.MainService;

import static org.mockito.BDDMockito.*;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FullStackBootApplicationServiceTest {

	@Autowired
	private MainService mainService;
	
	@MockBean
	private MainRepository mainRepository;
	
	
}
