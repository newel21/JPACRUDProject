package com.skilldistillery.developer.data;

import java.util.List;

import com.skilldistillery.developer.entities.Developer;

public interface DeveloperDAO {
	Developer findById(int id);
	List<Developer> findAll();
	Developer add(Developer dev);
	Developer update(Developer dev);
	boolean delete(Developer dev);
	boolean deleteById(int devId);

}
