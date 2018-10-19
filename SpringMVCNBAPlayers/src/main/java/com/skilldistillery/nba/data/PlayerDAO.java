package com.skilldistillery.nba.data;

import java.util.List;

import com.skilldistillery.nba.entities.Player;

public interface PlayerDAO {
	Player findById(int id);
	List<Player> findAll();
	Player add(Player p);
	Player update(Player p);
	boolean delete(Player p);
	boolean deleteById(int pid);

}
