package com.xworkz.features.stream.dto;

import java.io.Serializable;
import java.util.Date;

import com.xworkz.features.stream.dto.constants.GroceryType;

public class GroceryDTO implements Serializable {

	private String name;
	private double price;
	private GroceryType type;
	private double quantity;
	private boolean quality;
	private String brand;
	private boolean organic;
	private boolean veg;
	private long barCodeNumber;
	private Date manufacturedDate;
	private Date expiredDate;

	public GroceryDTO() {

	}

	public GroceryDTO(String name, double price, GroceryType type, double quantity, boolean quality, String brand,
			boolean organic, boolean veg, long barCodeNumber, Date manufacturedDate, Date expiredDate) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.quality = quality;
		this.brand = brand;
		this.organic = organic;
		this.veg = veg;
		this.barCodeNumber = barCodeNumber;
		this.manufacturedDate = manufacturedDate;
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "GroceryDTO [name=" + name + ", price=" + price + ", type=" + type + ", quantity=" + quantity
				+ ", quality=" + quality + ", brand=" + brand + ", organic=" + organic + ", veg=" + veg
				+ ", barCodeNumber=" + barCodeNumber + ", manufacturedDate=" + manufacturedDate + ", expiredDate="
				+ expiredDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (barCodeNumber ^ (barCodeNumber >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (organic ? 1231 : 1237);
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
		GroceryDTO other = (GroceryDTO) obj;
		if (barCodeNumber != other.barCodeNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (organic != other.organic)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public GroceryType getType() {
		return type;
	}

	public double getQuantity() {
		return quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public String getBrand() {
		return brand;
	}

	public boolean isOrganic() {
		return organic;
	}

	public boolean isVeg() {
		return veg;
	}

	public long getBarCodeNumber() {
		return barCodeNumber;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}
}
