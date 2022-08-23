package com.example.demo.dto;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name ="messages")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "text")
	private String text;
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;
	
	@ManyToOne
	@JoinColumn(name = "user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "party")
	private Party party;

	public Message() {
		super();
	}

	public Message(int id, String text, Date timestamp, User user, Party party) {
		super();
		this.id = id;
		this.text = text;
		this.timestamp = timestamp;
		this.user = user;
		this.party = party;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", text=" + text + ", timestamp=" + timestamp + ", user=" + user + ", party="
				+ party + "]";
	}
	
	
	
}
