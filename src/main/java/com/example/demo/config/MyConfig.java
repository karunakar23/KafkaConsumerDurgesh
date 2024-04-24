package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.example.demo.utils.AppConstants;

@Configuration
public class MyConfig {
	
	@KafkaListener(topics=AppConstants.TOPICNAME,groupId=AppConstants.GROUPID)
	public void receiveMessage(String value) {
		System.out.println(value);
		
	}

}
