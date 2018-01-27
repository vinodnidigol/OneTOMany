package com.app.onetomany;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "team_table")
public class TeamDTO implements Serializable {
	@Id
	@Column(name = "team_name")
	private String name;
	@Column(name = "coach_Name")
	private String coachName;
	@Column(name = "noOf_Players")
	private int noOfPlayers;
	@Column(name = "captain_Name")
	private String captainName;
	@JoinColumn(name="team_col")
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<PlayerDTO> players;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public Collection<PlayerDTO> getPlayers() {
		return players;
	}

	public void setPlayers(Collection<PlayerDTO> players) {
		this.players = players;
	}

}
