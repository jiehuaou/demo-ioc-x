package com.example.demoioc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {"new.config.use=true"})
public class TestRepoNew {

	@Autowired
	@Qualifier("my-repository")
	private MyRepository repo;

	@Test
	void testNewRepo() {
		String text = repo.hello();
		Assertions.assertEquals("New", text);
	}


}
