package com.iq.HelloJenkins;

import com.iq.HelloJenkins.controller.Calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloJenkinsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testHello() {
		Assert.assertEquals("Welcome to Jenkins pipeline", new Calculator().hello());
	}

}
