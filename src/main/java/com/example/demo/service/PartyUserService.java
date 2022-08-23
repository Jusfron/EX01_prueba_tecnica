package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPartyUserDAO;
import com.example.demo.dto.PartyUser;

@Service
public class PartyUserService {
	
	@Autowired IPartyUserDAO iPartyUserDAO;
	
	public List<PartyUser> listPartyUsers() {
		return iPartyUserDAO.findAll();
	} 
	
	public PartyUser savePartyUser(PartyUser partyUser) {
		return iPartyUserDAO.save(partyUser);
	}
	
	public PartyUser partyUserXID(int id) {
		return iPartyUserDAO.findById(id).get();
	}
	
	public PartyUser updatePartyUser(PartyUser partyUser) {
		return iPartyUserDAO.save(partyUser);
	} 
	
	public void deletePartyUser(int id) {
		iPartyUserDAO.deleteById(id);;
	} 
	
}
