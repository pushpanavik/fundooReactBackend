package com.bridgeit.fundooNote.userservice.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.bridgeit.fundooNote.noteservice.model.Note;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class User {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private Boolean enabled;
	private String profilepicImage;
	
	public String getProfilepicImage() {
		return profilepicImage;
	}
	public void setProfilepicImage(String profilepicImage) {
		this.profilepicImage = profilepicImage;
	}
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="user",cascade=CascadeType.PERSIST)
	@JsonIgnore
	private List<Note> note = new ArrayList<Note>();
	
	public List<Note> getNote() {
		return note;
	}
	public void setNote(List<Note> note) {
		this.note = note;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	
	

}
