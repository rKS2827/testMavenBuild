package com.example.testMaven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMavenApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("TEST success");
		assertTrue(true);
		System.out.println("TEST success");
	}

}

