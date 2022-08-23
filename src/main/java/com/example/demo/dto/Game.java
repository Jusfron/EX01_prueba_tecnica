package com.example.demo.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="games")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Party> parties;

	public Game() {
		super();
	}

	public Game(int id, String name, List<Party> parties) {
		super();
		this.id = id;
		this.name = name;
		this.parties = parties;
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

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Party")
	public List<Party> getParties() {
		return parties;
	}

	public void setParties(List<Party> parties) {
		this.parties = parties;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", parties=" + parties + "]";
	}
	
	
	
}
