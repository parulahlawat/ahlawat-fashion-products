package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User implements Serializable {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int userId;
	 private String username;
	 private String password;
	 private Boolean enabled;
	 private int customerId;
	 
	 public User() {
			
		}
	 public int getUserId() {
	 return userId;
	  }
	 public void setUsersId(int usersId) {
	 this.userId = usersId;
	  }
	 public String getUsername() {
	 return username;
	  }
	 public void setUsername(String username) {
	 this.username = username;
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
	 public int getCustomerId() {
	 return customerId;
	  }
	 public void setCustomerId(int customerId) {
	 this.customerId = customerId;
	  }
	 } 