package com.example.demo.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Message> messages;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<PartyUser> partyUsers;

	public User() {
		super();
	}

	public User(int id, String username, String email, String password, List<Message> messages,
			List<PartyUser> partyUsers) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.messages = messages;
		this.partyUsers = partyUsers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", messages=" + messages + ", partyUsers=" + partyUsers + "]";
	}
	
	

}
