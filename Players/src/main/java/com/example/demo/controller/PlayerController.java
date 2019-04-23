package com.example.demo.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;

@RestController
@RequestMapping(value="/players")
public class PlayerController {
	
	@Autowired
	PlayerRepository playerrepository;
	
	 Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	    @RequestMapping("/")
	    public String index() {
	        logger.trace("A TRACE Message");
	        logger.debug("A DEBUG Message");
	        logger.info("An INFO Message");
	        logger.warn("A WARN Message");
	        logger.error("An ERROR Message");
	 
	        return "Hiii";
	    }
	
	
	@GetMapping("/player")
	public Iterable<Player> allPlayer() {
		logger.error("An ERROR Message");	
		return  playerrepository.findAll();
	}
	@PostMapping("/player")
	public Player addplayer(@RequestBody Player player) {
		return playerrepository.save(player);
		
	}
	@PutMapping("/player")
	public com.example.demo.entity.Player PLAYER_ID(@PathVariable("PLAYER_ID") long PLAYER_ID, @RequestBody Player  player)
           {
       return playerrepository.save(player);
	}
	@DeleteMapping("/player/{PLAYER_ID}")
	public void deleteplayer(@PathVariable("PLAYER_ID") int PLAYER_ID) {

		playerrepository.deleteById(PLAYER_ID);
	}
	@GetMapping("/player/{PLAYER_ID}")
	public Optional<Player> Player (@PathVariable("PLAYER_ID") int PLAYER_ID){
		return playerrepository.findById(PLAYER_ID);
		
	}

}
