package com.app.onetomany;

import java.util.List;

import org.hibernate.Session;

import com.Sf.util.SingleTonSessionFactory;

public class loadOneToMany {
	public static void main(String[] args) {

		// load team from the db
		Session session = SingleTonSessionFactory.getSF().openSession();
		TeamDTO team = session.load(TeamDTO.class,"Kalinga strikers");
		System.out.println(team.getCaptainName());
		// using team obtain players

		List<PlayerDTO> players = (List<PlayerDTO>) team.getPlayers();
		for (PlayerDTO playerDTO : players) {
			System.out.println(playerDTO.getName());
		}

	}
}
