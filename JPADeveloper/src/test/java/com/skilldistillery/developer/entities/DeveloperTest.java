package com.skilldistillery.developer.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeveloperTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("Developer");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}

	@Test
	void test_developer_mappings() {
		Developer dev = em.find(Developer.class, 1);
		assertEquals("Mark", dev.getFirstName());
		assertEquals("Zuckerberg", dev.getLastName());
		assertEquals("M", dev.getGender());
		assertEquals("Wizard", dev.getCategory());
		assertEquals("self-taught", dev.getLearnedBy());
		assertEquals("Harvard", dev.getSchoolAttended());
		assertEquals("Java", dev.getFavoriteLanguage());
	}

}
