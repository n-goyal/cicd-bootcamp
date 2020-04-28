package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;



@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {
	
	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		Assertions.assertEquals("Hello Engineers!", ms.sayHello());
	}
	
}
