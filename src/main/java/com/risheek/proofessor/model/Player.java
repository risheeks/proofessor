package com.risheek.proofessor.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
	String id;
	String accountId;
	String puuid;
	String name;
	int level;
	String image;
	Tier tier;
	Rank rank;
	int leaguePoints;
	List<String> comments = new ArrayList<String>();
	
	
	public Player() {
		
	}


	public Player(String id, String accountId, String puuid, String name, int level, String image, Rank rank, int leaguePoints,
			List<String> comments) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.puuid = puuid;
		this.name = name;
		this.level = level;
		this.image = image;
		this.rank = rank;
		this.leaguePoints = leaguePoints;
		this.comments = comments;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	

	public String getAccountId() {
		return accountId;
	}


	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	public String getPuuid() {
		return puuid;
	}


	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Rank getRank() {
		return rank;
	}
	
	

	public Tier getTier() {
		return tier;
	}


	public void setTier(Tier tier) {
		this.tier = tier;
	}


	public int getLeaguePoints() {
		return leaguePoints;
	}


	public void setLeaguePoints(int leaguePoints) {
		this.leaguePoints = leaguePoints;
	}


	public void setRank(Rank rank) {
		this.rank = rank;
	}


	public List<String> getComments() {
		return comments;
	}


	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	
	
}
 