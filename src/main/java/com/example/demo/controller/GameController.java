package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Game;
import com.example.demo.service.GameService;

@RestController
@RequestMapping("/api")
public class GameController {
	
	@Autowired GameService gameService;
	
	@GetMapping("/games")
	public List<Game> listGames(){
		return gameService.listGames();
	}

}
