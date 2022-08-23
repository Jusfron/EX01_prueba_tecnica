package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPartyDAO;
import com.example.demo.dto.Game;
import com.example.demo.dto.Party;

@Service
public class PartyService {
	
	@Autowired IPartyDAO iPartyDAO;
	
	public List<Party> listParties() {
		return iPartyDAO.findAll();
	} 
	
	public Party saveParty(Party party) {
		return iPartyDAO.save(party);
	}
	
	public Party partyXID(int id) {
		return iPartyDAO.findById(id).get();
	}
	
	public List<Party> findByGame(Game game) {
		return iPartyDAO.findByGame(game);
	}

	public List<Party> findByGameId(int id) {
		return iPartyDAO.findByGameId(id);
	}
	
	public Party updateParty(Party party) {
		return iPartyDAO.save(party);
	} 
	
	public void deleteParty(int id) {
		iPartyDAO.deleteById(id);;
	} 

}
