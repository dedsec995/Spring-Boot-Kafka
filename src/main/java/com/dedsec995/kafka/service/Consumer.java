package com.dedsec995.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
  
	@KafkaListener(topics="test-my", groupId="mygroup")
	public void consumeFromTopic(String message) {
		System.out.println("Consummed message "+message);
	}
}