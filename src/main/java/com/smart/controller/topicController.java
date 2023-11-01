package com.smart.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.smart.entities.Topic;
import com.smart.service.TopicService;

@RestController
public class topicController {
 
	@Autowired
	private TopicService service;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics(){
          return service.getAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopicById( @PathVariable int id) {
		return service.getTopicById(id);
	}
	//get that post body and convert into topic instant and that into topic list
	@PostMapping("/topics")
	public void addTopic( @RequestBody  Topic topic ) {
		service.addTopic(topic);
	}
	@PutMapping("/topics/{id}")
	public void updateTopic(@PathVariable int id,@RequestBody Topic topic) {
		service.updateTopic(id,topic);
	}
	@DeleteMapping("topics/{id}")
	public void deleteTopic(@PathVariable int id) {
		service.deleteTopic(id);
	}
	
	
	
	
	
}
