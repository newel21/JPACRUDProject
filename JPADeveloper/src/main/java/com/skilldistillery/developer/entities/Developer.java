package com.skilldistillery.developer.entities;

import javax.persistence.*;

@Entity
public class Developer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private String gender;

	private String category;
	
	@Column(name="learned_by")
	private String learnedBy;
	
	@Column(name="school_attended")
	private String schoolAttended;
	
	@Column(name="favorite_language")
	private String favoriteLanguage;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLearnedBy() {
		return learnedBy;
	}

	public void setLearnedBy(String learnedBy) {
		this.learnedBy = learnedBy;
	}

	public String getSchoolAttended() {
		return schoolAttended;
	}

	public void setSchoolAttended(String schoolAttended) {
		this.schoolAttended = schoolAttended;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((favoriteLanguage == null) ? 0 : favoriteLanguage.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((learnedBy == null) ? 0 : learnedBy.hashCode());
		result = prime * result + ((schoolAttended == null) ? 0 : schoolAttended.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (favoriteLanguage == null) {
			if (other.favoriteLanguage != null)
				return false;
		} else if (!favoriteLanguage.equals(other.favoriteLanguage))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (learnedBy == null) {
			if (other.learnedBy != null)
				return false;
		} else if (!learnedBy.equals(other.learnedBy))
			return false;
		if (schoolAttended == null) {
			if (other.schoolAttended != null)
				return false;
		} else if (!schoolAttended.equals(other.schoolAttended))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", category=" + category + ", learnedBy=" + learnedBy + ", schoolAttended=" + schoolAttended
				+ ", favoriteLanguage=" + favoriteLanguage + "]";
	}
	
	public Developer() {
		
	}

	public Developer(String firstName, String lastName, String gender, String category, String learnedBy,
			String schoolAttended, String favoriteLanguage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.category = category;
		this.learnedBy = learnedBy;
		this.schoolAttended = schoolAttended;
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
}
