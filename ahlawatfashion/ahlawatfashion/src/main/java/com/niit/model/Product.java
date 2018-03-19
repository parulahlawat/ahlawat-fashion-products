package com.niit.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.persistence.*;
import org.springframework.web.multipart.MultipartFile;
@Entity
public class Product implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	private String name;
	private Long price;
	private int quantity;
	private String description;
	
	@Transient
	private MultipartFile  imageURL;
	
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CartItem> cartItemList;

	private int supplierId;
	
	public Product() {
		
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getSupplierId() {
		return supplierId;
	}
	public MultipartFile getImageURL() {
		return imageURL;
	}
	public void setImageURL(MultipartFile imageURL) {
		this.imageURL = imageURL;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }
	
}
