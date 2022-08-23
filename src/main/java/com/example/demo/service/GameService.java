package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IGameDAO;
import com.example.demo.dto.Game;

@Service
public class GameService {
	
	@Autowired IGameDAO iGameDAO;
	
	public List<Game> listGames() {
		return iGameDAO.findAll();
	} 
	
	public Game listByName(String name) {
		return iGameDAO.findByName(name);
	}
	
	public Game saveGame(Game game) {
		return iGameDAO.save(game);
	}
	
	public Game gameXID(int id) {
		return iGameDAO.findById(id).get();
	}
	
	public Game updateGame(Game game) {
		return iGameDAO.save(game);
	} 
	
	public void deleteGame(int id) {
		iGameDAO.deleteById(id);;
	} 
	
	
}
