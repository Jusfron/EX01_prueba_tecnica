package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Party;
import com.example.demo.service.GameService;
import com.example.demo.service.PartyService;


@RestController
@RequestMapping("/api")
public class PartyController {
	
	@Autowired
	PartyService partyService;
	
	@Autowired
	GameService gameService;
	
	@GetMapping("/parties")
	public List<Party> listParties(){
		return partyService.listParties();
	}
	
	@PostMapping("/parties/{id}")
	public Party createParty(@PathVariable(name="id")int id,@RequestBody Party party) {
		
		party.setGame(gameService.gameXID(id));
		return partyService.saveParty(party);
	}
	
	@DeleteMapping("/parties/{id}")
	public void deleteParty(@PathVariable(name="id")int id) {
		partyService.deleteParty(id);
	}

}
