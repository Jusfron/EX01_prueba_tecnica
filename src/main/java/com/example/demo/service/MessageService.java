package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMessageDAO;
import com.example.demo.dto.Message;

@Service
public class MessageService {

	@Autowired IMessageDAO iMessageDAO;
	
	public List<Message> listMessages() {
		return iMessageDAO.findAll();
	} 
	
	public List<Message> listMessagesByParty(int id) {
		return iMessageDAO.findByParty(id);
	}
	
	public Message saveMessage(Message message) {
		return iMessageDAO.save(message);
	}
	
	public Message messageXID(int id) {
		return iMessageDAO.findById(id).get();
	}
	
	public Message updateMessage(Message message) {
		return iMessageDAO.save(message);
	} 
	
	public void deleteMessage(int id) {
		iMessageDAO.deleteById(id);;
	} 
	
}
