package com.fis.app.model;

import java.util.ArrayList;
import java.util.List;

public class Seat {

	List<Integer> se = new ArrayList<>();

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seat(List<Integer> se) {
		super();
		this.se = se;
	}

	public List<Integer> getSe(){
		return se ;
	}
	public void setSe(List<Integer> se) {
		this.se = se;
	}

	@Override
	public String toString() {
		return "Seat [se=" + se + "]";
	}
	
	
}
