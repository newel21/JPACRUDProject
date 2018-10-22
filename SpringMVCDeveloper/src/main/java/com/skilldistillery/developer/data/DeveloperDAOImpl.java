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
		String qStr = "SELECT devs from Developer devs";
		List<Developer> devs = em.createQuery(qStr, Developer.class)
				.getResultList();
		return devs;
	}
	

	@Override
	public Developer add(Developer dev) {
		em.persist(dev);
		em.flush();
		return dev;
	}

	
	@Override
	public Developer update(int id, Developer dev) {
		Developer manageDev = em.find(Developer.class, id);
		manageDev.setFirstName(dev.getFirstName());
		manageDev.setLastName(dev.getLastName());
		manageDev.setGender(dev.getGender());
		manageDev.setCategory(dev.getCategory());
		manageDev.setLearnedBy(dev.getLearnedBy());
		manageDev.setSchoolAttended(dev.getSchoolAttended());
		manageDev.setFavoriteLanguage(dev.getFavoriteLanguage());
		return manageDev;
	}

//	@Override
//	public boolean delete(Developer dev) {
//		em.remove(dev);
//		return true;
//	}

	@Override
	public boolean deleteById(int id) {
		Developer deleteDevId = em.find(Developer.class, id);
		em.remove(deleteDevId);
		if(deleteDevId != null) {
			return false;
		}
		return true;
	}


}
