package com.risheek.proofessor.service;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.risheek.proofessor.model.Champion;

@Service
public class ChampionService {
	
	static Map<String, Champion> champions = new HashMap<String, Champion>();
	
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	}
	
	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);
	      return json;
	    } finally {
	      is.close();
	    }
	}
	
	public static void loadChampions() throws JSONException, IOException {
		JSONObject json = readJsonFromUrl("https://ddragon.leagueoflegends.com/cdn/13.15.1/data/en_US/champion.json");
	    JSONObject championsJSON = json.getJSONObject("data");
	    Iterator<String> keys = championsJSON.keys();
	    while(keys.hasNext()) {
	        String key = keys.next();
	        if (championsJSON.get(key) instanceof JSONObject) {
	        	champions.put(championsJSON.getJSONObject(key).getString("id"), new Champion(championsJSON.getJSONObject(key)));
	        	
	        }
	    }
	}
	
	public Map<String, Champion> getAllChampions() throws JSONException, IOException {
		if(champions.size() == 0) ChampionService.loadChampions();
		return champions;
	}

	public Champion getChampionById(String id) throws JSONException, IOException {
		if(champions.size() == 0) ChampionService.loadChampions();
		return champions.get(id);
	}

	public Champion getChampionByName(String name) throws JSONException, IOException {
		if(champions.size() == 0) ChampionService.loadChampions();
		name = name.replace(" ", "");
		return champions.get(name);
	}

}
