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
		Developer managedDev = em.find(Developer.class, id);
		managedDev.setFirstName(dev.getFirstName());
		managedDev.setLastName(dev.getLastName());
		managedDev.setGender(dev.getGender());
		managedDev.setCategory(dev.getCategory());
		managedDev.setLearnedBy(dev.getLearnedBy());
		managedDev.setSchoolAttended(dev.getSchoolAttended());
		managedDev.setFavoriteLanguage(dev.getFavoriteLanguage());
		return managedDev;
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
