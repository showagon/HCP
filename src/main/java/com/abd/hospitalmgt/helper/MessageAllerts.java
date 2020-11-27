package com.abd.hospitalmgt.helper;

public class MessageAllerts {

	private String content;
	private int type;
	
	

	
	public MessageAllerts(String content, int type) {
		super();
		this.content = content;
		this.type = type;
	}
	


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}
	
	
	
}
