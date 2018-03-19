package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Authorities implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorityId;
	private String authority;
	private String username;
	
public Authorities() {
		
	}
public int getAuthorityId() {
	return authorityId;
}
public void setAuthorityId(int authorityId) {
	this.authorityId = authorityId;
}
public String getAuthority() {
	return authority;
}
public void setAuthority(String authority) {
	this.authority = authority;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

}
