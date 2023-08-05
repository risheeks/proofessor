package com.risheek.proofessor.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
	long id;
	String name;
	int level;
	String image;
	Rank rank;
	int lp;
	List<Champion> championPool = new ArrayList<Champion>();
	List<String> comments = new ArrayList<String>();
	Role primaryRole;
	
	
	public Player() {
		
	}


	public Player(long id, String name, int level, String image, Rank rank, int lp, List<Champion> championPool,
			List<String> comments, Role primaryRole) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.image = image;
		this.rank = rank;
		this.lp = lp;
		this.championPool = championPool;
		this.comments = comments;
		this.primaryRole = primaryRole;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
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


	public void setRank(Rank rank) {
		this.rank = rank;
	}


	public int getLp() {
		return lp;
	}


	public void setLp(int lp) {
		this.lp = lp;
	}


	public List<Champion> getChampionPool() {
		return championPool;
	}


	public void setChampionPool(List<Champion> championPool) {
		this.championPool = championPool;
	}


	public List<String> getComments() {
		return comments;
	}


	public void setComments(List<String> comments) {
		this.comments = comments;
	}


	public Role getPrimaryRole() {
		return primaryRole;
	}


	public void setPrimaryRole(Role primaryRole) {
		this.primaryRole = primaryRole;
	}
	
	
	
}
 