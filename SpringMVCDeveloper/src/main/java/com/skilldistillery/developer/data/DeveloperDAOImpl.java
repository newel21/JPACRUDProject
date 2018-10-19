package com.skilldistillery.developer.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.skilldistillery.developer.entities.Developer;

@Transactional
@Repository
public class DeveloperDAOImpl implements DeveloperDAO {
	
	@PersistenceContext
	private EntityManager em;


	@Override
	public Developer findById(int id) {
		Developer dev = em.find(Developer.class, id);
		return dev;
	}

	@Override
	public List<Developer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Developer add(Developer dev) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Developer update(Developer dev) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Developer dev) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int devId) {
		// TODO Auto-generated method stub
		return false;
	}

}
