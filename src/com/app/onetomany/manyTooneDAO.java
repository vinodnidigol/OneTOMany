package com.app.onetomany;

import org.hibernate.Session;

import com.Sf.util.SingleTonSessionFactory;

public class manyTooneDAO {
public static void main(String[] args) {
	
	
	//step 1 create multiple objects of owning entity
	PlayerDTO player3=new PlayerDTO();
	player3.setAge(28);
	player3.setJerseyNo(04);
	player3.setName("ADAM");
	player3.setNoOfMatches(162);
	
	PlayerDTO player4=new PlayerDTO();
	player4.setAge(28);
	player4.setJerseyNo(06);
	player4.setName("barker");
	player4.setNoOfMatches(145);
	
	
	//step 2 load an object of assocaited entity 
	//from the db
	
	
	Session session=SingleTonSessionFactory.getSF().openSession();
	
	TeamDTO  team=session.load(TeamDTO.class, "Kalinga strikers");
	
	//relate each player with the team
	
	player3.setTeam(team);
	player4.setTeam(team);
	
	session.save(player3);
	session.save(player4);

	
	session.beginTransaction().commit();
	
	
	
	
	
	
}
}
