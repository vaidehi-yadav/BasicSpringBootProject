package com.smart.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Service;

import com.smart.entities.Topic;

@Service
public class TopicService {

	public List<Topic> topics= new ArrayList<>(Arrays.asList(
			 new Topic(1,"spring","spring framework course"),
			 new Topic(2,"js","js framework course"),
			 new Topic(3,"java","core java framework course") 
	));
	
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopicById(int id) {
		// TODO Auto-generated method stub
		Topic ans = null;
		for(Topic t: topics) {
			if(t.getId()==id) {
				return t;
			}
		}
		return ans;
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(int id, Topic topic) {
		// TODO Auto-generated method stub
		for(Topic t:topics) {
			if(t.getId()==id) {
				topics.set(id-1,topic);
			}
		}
		return;
	}

	public void deleteTopic(int id) {
		// TODO Auto-generated method stub
		for(Topic t: topics) {
			if(t.getId()==id) {
				topics.remove(id-1);
			}
		}
	}
	
	
	
}
