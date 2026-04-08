package com.example.appspringdata;
import org.neo4j.driver.Driver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppSpringDataApplicationTests {
	@Autowired
	private Driver driver;
	@Test
	void contextLoads() {
		driver.verifyConnectivity();
	}
}
