package com.univ;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_table")
public class Car {
	@Id
	private int carid;
	private String carname;
	private String carmodel;
	private String carprice;
	
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getCarprice() {
		return carprice;
	}
	public void setCarprice(String carprice) {
		this.carprice = carprice;
	}
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(int carid, String carname, String carmodel, String carprice) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.carmodel = carmodel;
		this.carprice = carprice;
	}
	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + ", carmodel=" + carmodel + ", carprice=" + carprice
				+ "]";
	}
	
	
	
}
