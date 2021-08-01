package com.xworkz.features.stream.dto;

import java.io.Serializable;

public class SoapDTO implements Serializable {
	
	private String brand;
	private double price;
	private double quantity;
	private String type;
	
	public SoapDTO() {
		
	}

	public SoapDTO(String brand, double price, double quantity, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "SoapDTO [brand=" + brand + ", price=" + price + ", quantity=" + quantity + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		SoapDTO other = (SoapDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}

	public String getType() {
		return type;
	}

}
