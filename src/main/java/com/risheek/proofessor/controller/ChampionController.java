/**
 * 
 */
package com.risheek.proofessor.controller;

import java.io.IOException;
import java.util.Map;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.risheek.proofessor.model.*;
import com.risheek.proofessor.service.ChampionService;

@RestController
@RequestMapping("/champions")
public class ChampionController {
	
	@Autowired
	ChampionService championService;
	
	@GetMapping("")
	public Map<String, Champion> getAllChampions() throws JSONException, IOException {
		return championService.getAllChampions();
	}
	
	@GetMapping("/id/{id}")
	public Champion getChampionById(@PathVariable String id) throws JSONException, IOException {
		return championService.getChampionById(id);
	}
	
	@GetMapping("/name/{name}")
	public Champion getChampionByName(@PathVariable String name) throws JSONException, IOException {
		return championService.getChampionByName(name);
	}

}
