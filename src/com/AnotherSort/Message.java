package com.AnotherSort;

import java.util.Date;
//public class Message implements Comparable<Message>
public class Message  {
	public String name;
	public Date date;
	public String message;

	public Message(String name, Date date, String message) {
		this.name = name;
		this.date = date;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [name=" + name + ", date=" + date + ", message="
				+ message + "]";
	}

	public Message() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
/*
	@Override
	public int compareTo(Message o) {
		
		return this.getDate().compareTo(o.getDate());
	}*/
}
