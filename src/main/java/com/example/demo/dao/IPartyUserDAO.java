package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.PartyUser;

public interface IPartyUserDAO extends JpaRepository<PartyUser, Integer>{

}
