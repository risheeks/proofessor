package com.risheek.proofessor.service;

import java.util.Iterator;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.risheek.proofessor.model.Player;
import com.risheek.proofessor.model.Rank;
import com.risheek.proofessor.model.Tier;

@Service
public class PlayerService {
	
	public Player getPlayerByName(String name) {
		Player player = new Player();
		
		String uri1 = "https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + name + "?api_key=" + System.getenv("api_key");
		RestTemplate restTemplate = new RestTemplate();
		String result1 = restTemplate.getForObject(uri1, String.class);
		JSONObject summoner = new JSONObject(result1);
		if(summoner.isEmpty()) return null;
		String id = summoner.getString("id");
		
		String uri2 = "https://euw1.api.riotgames.com/lol/league/v4/entries/by-summoner/" + id + "?api_key=" + System.getenv("api_key");
		restTemplate = new RestTemplate();
		String result2 = restTemplate.getForObject(uri2, String.class);
		JSONObject jsonObject = new JSONObject(result2.substring(1,result2.length()-1).trim());
		Iterator<String> keys = jsonObject.keys();		
		while(keys.hasNext()) {
		    String key = keys.next();
		    summoner.append(key, jsonObject.get(key));
		}
		
//		System.out.println(summoner);
		player.setAccountId(summoner.getString("id"));
		player.setAccountId(summoner.getString("accountId"));
		player.setPuuid(summoner.getString("puuid"));
		player.setName(summoner.getString("name"));
		player.setLevel(summoner.getInt("summonerLevel"));
//		player.setImage(summoner.getString("image"));
		player.setLeaguePoints(Integer.parseInt(summoner.get("leaguePoints").toString().substring(1,summoner.get("leaguePoints").toString().length()-1)));
		String tier = summoner.get("tier").toString().substring(2,summoner.get("tier").toString().length()-2);
//		System.out.println("tier: " + tier);
		Tier.assignTier(player, tier);
		
		String rank = summoner.get("rank").toString().substring(2,summoner.get("rank").toString().length()-2);
//		System.out.println("rank: " + rank);
		Rank.assignRank(player, rank);
		
		return player;
	}
	
	

}
