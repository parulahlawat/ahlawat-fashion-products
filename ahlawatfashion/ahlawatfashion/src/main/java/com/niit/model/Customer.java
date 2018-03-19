package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Customer implements Serializable {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	private String name;
	private String emailId;
	private Long phone;
	private String password;
	private String username;
	 	@OneToOne
	    @JoinColumn(name = "billingAddressId")
	    private BillingAddress billingAddress;
	 	private boolean enabled;
	    @OneToOne
	    @JoinColumn(name = "shippingAddressId")
	    private ShippingAddress shippingAddress;

	    @OneToOne
	    @JoinColumn(name = "cartId")
	    private Cart cart;
public Customer() {
		
	}
public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	 public BillingAddress getBillingAddress() {
	        return billingAddress;
	    }

	    public void setBillingAddress(BillingAddress billingAddress) {
	        this.billingAddress = billingAddress;
	    }
	    public boolean isEnabled() {
	        return enabled;
	    }

	    public void setEnabled(boolean enabled) {
	        this.enabled = enabled;
	    }

	    public ShippingAddress getShippingAddress() {
	        return shippingAddress;
	    }

	    public void setShippingAddress(ShippingAddress shippingAddress) {
	        this.shippingAddress = shippingAddress;
	    }

	    public Cart getCart() {
	        return cart;
	    }

	    public void setCart(Cart cart) {
	        this.cart = cart;
	    }
}
