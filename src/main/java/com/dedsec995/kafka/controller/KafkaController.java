package com.dedsec995.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dedsec995.kafka.service.Producer;

@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {

	@Autowired 
	Producer producer;
	
	@PostMapping(value="/post")
	public void sendMessage(@RequestParam("msg") String msg) {
		for(int i =0; i < 101; i++){
			producer.publishToTopic(msg + i);
		}
	}
}