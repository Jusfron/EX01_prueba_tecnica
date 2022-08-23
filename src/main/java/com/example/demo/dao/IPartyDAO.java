package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Game;
import com.example.demo.dto.Party;

public interface IPartyDAO extends JpaRepository<Party,Integer>{
	
	public List<Party> findByGame(Game game);
	
	public List<Party> findByGameId(int id);
	
}
