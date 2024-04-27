package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.dto.User;

@Service
public class MyService {
	
	Logger log=LoggerFactory.getLogger(MyService.class);
	@KafkaListener(topics="javatechie-demo",groupId="groupId-2")
	public void consumer1(String message) {
		log.info("Consumer 1"+message);
	}
	
	@KafkaListener(topics="javatechie-demo",groupId="groupId-2")
	public void consumer2(String message) {
		log.info("Consumer 2"+message);
	}
	
	@KafkaListener(topics="javatechie-demo",groupId="groupId-2")
	public void consumer3(String message) {
		log.info("Consumer 3"+message);
	}
	
	@KafkaListener(topics="karuna",groupId="groupId-2")
	public void printObjects(User user) {
		System.out.println(user.toString());
		log.info(user.toString());
	}

}
