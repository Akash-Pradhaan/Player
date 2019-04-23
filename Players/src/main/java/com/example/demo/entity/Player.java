package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="/player")
public class Player {
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	
	//@Column(name="PLAYER_ID")
	@Id
	private int PLAYER_ID;
	
	public int getPLAYER_ID() {
		return PLAYER_ID;
	}
	public void setPLAYER_ID(int pLAYER_ID) {
		PLAYER_ID = pLAYER_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public int getMATCHES() {
		return MATCHES;
	}
	public void setMATCHES(int mATCHES) {
		MATCHES = mATCHES;
	}
	private String NAME;
	private int AGE;
	private int MATCHES;
	
		

}
