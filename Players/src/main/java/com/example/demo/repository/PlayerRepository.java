package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Player;
@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer>{

}
