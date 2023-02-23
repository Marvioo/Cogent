package com.cogent.entity;

import java.util.Objects;

public class Product {
	private int id;
	private String name;
	private int cost;
	private int discount;
	private int available;
	private int sold;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, int cost, int discount, int available, int sold) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.available = available;
		this.sold = sold;
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", discount=" + discount + ", available="
				+ available + ", sold=" + sold + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(available, cost, discount, id, name, sold);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return available == other.available && cost == other.cost && discount == other.discount && id == other.id
				&& Objects.equals(name, other.name) && sold == other.sold;
	}
}
