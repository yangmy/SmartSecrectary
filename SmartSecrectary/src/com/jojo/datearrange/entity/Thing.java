package com.jojo.datearrange.entity;

import java.io.Serializable;

public class Thing  implements Serializable{
	
	String title;
	String description;
	int id;
	String voicePath;
	boolean isVoice;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVoicePath() {
		return voicePath;
	}
	public void setVoicePath(String voicePath) {
		this.voicePath = voicePath;
	}
	public boolean isVoice() {
		return isVoice;
	}
	public void setVoice(boolean isVoice) {
		this.isVoice = isVoice;
	}
	
	
}
