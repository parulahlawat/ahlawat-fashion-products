package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Authorities implements Serializable {
	@Id
	private String authorityId;
	private String rolename;
	private String username;
public Authorities() {
		
	}
public String getAuthorityId() {
	return authorityId;
}
public void setAuthorityId(String authorityId) {
	this.authorityId = authorityId;
}
public String getRolename() {
	return rolename;
}
public void setRolename(String rolename) {
	this.rolename = rolename;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

}
