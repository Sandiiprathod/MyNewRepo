package com.index.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_info")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int prodId;
	private String prodName;
	private String description;
	private double prodPrice;
	private String image;
	@Override
	public String toString() {
		return "ProductBean [prodId=" + prodId + ", prodName=" + prodName
				+ ", description=" + description + ", prodPrice=" + prodPrice
				+ ", image=" + image + "]";
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public ProductEntity(int prodId, String prodName, String description,
			double prodPrice, String image) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.description = description;
		this.prodPrice = prodPrice;
		this.image = image;
	}
	public ProductEntity() {
		super();
		
	}
	
	
}
