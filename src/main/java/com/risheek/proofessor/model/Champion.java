package com.risheek.proofessor.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class Champion {
	String id;
	String name;
	String image;
	String json;
	
	
	List<String> comments = new ArrayList<String>();
	
	
	public Champion() {}
	
	public Champion(JSONObject championJSON) {
		this.id = championJSON.getString("id");
		this.name = championJSON.getString("name");
		this.image = championJSON.get("image").toString();
		this.json = championJSON.toString();
	}


	public Champion(String id, String name, String image, List<String> comments, String json) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.comments = comments;
		this.json = json;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public List<String> getComments() {
		return comments;
	}


	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}
	
	
	
}
