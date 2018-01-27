package com.app.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.Sf.util.SingleTonSessionFactory;

public class OneTomanyDAO {
public static void main(String[] args) {
	
	
	//obj of team
	TeamDTO team=new TeamDTO();
	team.setName("Kalinga strikers");
	team.setCaptainName("Manpreet");
	team.setCoachName("madhu");
	team.setNoOfPlayers(11);
	
	//multiple obs of players
	PlayerDTO player=new PlayerDTO();
	player.setName("dharamveer");
	player.setJerseyNo(12);
	player.setAge(25);
	player.setNoOfMatches(113);
	
	PlayerDTO player2=new PlayerDTO();
	player2.setName("Uthappa");
	player2.setJerseyNo(10);
	player2.setAge(22);
	player2.setNoOfMatches(74);
	
	
	// create collection of players
	
	List<PlayerDTO> l1=new ArrayList<>();
	l1.add(player);
	l1.add(player2);
	
	//relate collection of players with the team
	
	
	team.setPlayers(l1);
	
	Session session=SingleTonSessionFactory.getSF().openSession();
	
	
	session.save(team);
	
	session.beginTransaction().commit();
	
	
	
	
}
}
