package com.example.demo.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="parties")
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "game")
	private Game game;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Message> messages;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<PartyUser> partyUsers;

	public Party() {
		super();
	}

	public Party(int id, String name, Game game, List<Message> messages, List<PartyUser> partyUsers) {
		super();
		this.id = id;
		this.name = name;
		this.game = game;
		this.messages = messages;
		this.partyUsers = partyUsers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Message")
	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "PartyUser")
	public List<PartyUser> getPartyUsers() {
		return partyUsers;
	}

	public void setPartyUsers(List<PartyUser> partyUsers) {
		this.partyUsers = partyUsers;
	}

	@Override
	public String toString() {
		return "Party [id=" + id + ", name=" + name + ", game=" + game + ", messages=" + messages + ", partyUsers="
				+ partyUsers + "]";
	}
	
	
	
}
