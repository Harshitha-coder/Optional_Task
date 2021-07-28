package com.xworkz.features.optional.dto;

import java.io.Serializable;

public class RogiDTO implements Serializable, Comparable<RogiDTO> {

	private int id;
	private String name;
	private double age;
	private String kayile;
	private boolean badukuGurantee;

	public RogiDTO() {
		// TODO Auto-generated constructor stub
	}

	public RogiDTO(int id, String name, double age, String kayile, boolean badukuGurantee) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.kayile = kayile;
		this.badukuGurantee = badukuGurantee;
	}

	@Override
	public String toString() {
		return "RogiDTO [id=" + id + ", name=" + name + ", age=" + age + ", kayile=" + kayile + ", badukuGurantee="
				+ badukuGurantee + "]";
	}

	@Override
	public int compareTo(RogiDTO o) {
		double age = o.getAge();
		if (this.age == age)
			return 0;
		if (this.age > age)
			return 1;
		if (this.age < age)
			return -1;
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		RogiDTO other = (RogiDTO) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getKayile() {
		return kayile;
	}

	public void setKayile(String kayile) {
		this.kayile = kayile;
	}

	public boolean isBadukuGurantee() {
		return badukuGurantee;
	}

	public void setBadukuGurantee(boolean badukuGurantee) {
		this.badukuGurantee = badukuGurantee;
	}

}
