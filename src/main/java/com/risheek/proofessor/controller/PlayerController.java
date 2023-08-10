package com.risheek.proofessor.controller;

import java.util.Iterator;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.risheek.proofessor.model.Player;
import com.risheek.proofessor.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	@GetMapping("/{name}")
	public Player getPlayerByName(@PathVariable String name) throws HttpClientErrorException{
		
		return playerService.getPlayerByName(name);
	}

}
