package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table(name ="party_users")
public class PartyUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "administrator")
	private boolean administrator;
	
	@ManyToOne
	@JoinColumn(name = "party")
	private Party party;
	
	@ManyToOne
	@JoinColumn(name = "user")
	private User user;

	public PartyUser() {
		super();
	}

	public PartyUser(int id, boolean administrator, Party party, User user) {
		super();
		this.id = id;
		this.administrator = administrator;
		this.party = party;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "PartyUser [id=" + id + ", administrator=" + administrator + ", party=" + party + ", user=" + user + "]";
	}
	
	
}
