package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Message;
import com.example.demo.dto.Message;
import com.example.demo.dto.Party;
import com.example.demo.service.MessageService;

@RestController
@RequestMapping("/api")
public class MessageController {
	
	@Autowired MessageService messageService;
	
	@GetMapping("/messages")
	public List<Message> listMessages(){
		return messageService.listMessages();
	}
	
	@GetMapping("/messagesbyparty")
	public List<Message> listMessagesByParty(@RequestBody Party party) {
		return messageService.listMessagesByParty(party.getId());
	}
	
	@PostMapping("/messages")
	public Message createMessage(@PathVariable(name="id")int id,@RequestBody Message message) {
		return messageService.saveMessage(message);
	}
	
public Message actualizarMessage(@PathVariable(name="id")int id,@RequestBody Message message) {
		
		Message message_selected= new Message();
		Message message_updated= new Message();
		
		message_selected= messageService.messageXID(id);
		
		message_selected.setParty(message.getParty());
		message_selected.setText(message.getText());
		message_selected.setUser(message.getUser());
		message_selected.setTimestamp(message.getTimestamp());
		
		message_updated = messageService.updateMessage(message_selected);
		
		System.out.println("El message actualizado es: "+ message_updated);
		
		return message_updated;
	}

}
