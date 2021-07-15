//package com.fis.app.model;
//
//import java.io.Serializable;
//import java.util.List;
//import java.util.Objects;
//
//public class Car implements Serializable,Comparable<Car> {
//
//	private String carName;
//	private int carNumber;
//	private Engine e;
//	private MusicSystem ms;
//	private Seat se;
//	
//	
//	public Car() {
//		
//		super();
//		System.out.println(" Constructor called");
//	}
//	public Car(String carName, int carNumber,Engine e,MusicSystem ms, Seat se) {
//		super();
//		this.carName = carName;
//		this.carNumber = carNumber;
//		this.e=e;
//		this.ms=ms;
//		this.se=se;
//	}
//	
//	
//	public MusicSystem getMs() {
//		return ms;
//	}
//	public void setMs(MusicSystem ms) {
//		this.ms = ms;
//	}
//	public Engine getE() {
//		return e;
//	}
//	public void setE(Engine e) {
//		this.e = e;
//	}
//	public int getCarNumber() {
//		return carNumber;
//	}
//	public void setCarNumber(int carNumber) {
//		this.carNumber = carNumber;
//	}
//	public String getCarName() {
//		return carName;
//	}
//	public void setCarName(String carName) {
//		this.carName = carName;
//	}
//	
////	public Seat getSe(){
////		return se ;
////	}
////	public void setSe(Seat se) {
////		this.se = se;
////	}
//	
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(carName, carNumber, e, ms, se);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Car other = (Car) obj;
//		return Objects.equals(carName, other.carName) && carNumber == other.carNumber && Objects.equals(e, other.e)
//				&& Objects.equals(ms, other.ms) && Objects.equals(se, other.se);
//	}
//	
//	
//	
//	public int compareTo(Car car) {
//		return this.carName.compareTo(car.carName);
//	}
//	
//	
//	
//	@Override
//	public String toString() {
//		return "Car [carNumber=" + carNumber + ", carName=" + carName + ", e=" + e + ", ms=" + ms + ", se=" + se + "]";
//	}
//	
//	
//	
//	
//	// -----------  Spring life cycle methods -------
//	
//	public void doInIt()
//	{
//		System.out.println(" do init called ");
//	}
//	
//	public void doDestroy()
//	{
//		System.out.println(" do destroy  called ");
//	}
//	
//	
//}//end class
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//


package com.fis.app.model;

import java.io.File;
import java.io.Serializable;

public class Car implements Serializable,Comparable<Car> {

	private int carNumber;
	private String carName;
	private Engine e;
	private MusicSystem ms;
	private Seat se;
	public Car() {
		
		super();
		System.out.println(" Constructor called");
	}
	public Car(int carNumber, String carName) {
		super();
		this.carNumber = carNumber;
		this.carName = carName;
	}
	
	public Seat getSe() {
		return se;
	}
	public void setSe(Seat se) {
		this.se=se;
	}
	
	public MusicSystem getMs() {
		return ms;
	}
	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + carNumber;
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
		Car other = (Car) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (carNumber != other.carNumber)
			return false;
		return true;
	}
	
	
	
	@Override
	public int compareTo(Car car) {
		return this.carName.compareTo(car.carName);
	}
//	@Override
//	public String toString() {
//		if(e == null)
//		{
//			return carName+"- Engine Not Yet Set  - "+carNumber+" - "+ms;
//		}
//		return carName+" - "+e.getEngineName()+" - "+carNumber+" - "+ms;
//	}
	
	
	
	// -----------  Spring life cycle methods -------
	
	public void doInIt()
	{
		
		System.out.println(" do init called ");
		File f = new File("C:\\demo\\car.txt");
	}
	
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carName=" + carName + ", e=" + e + ", ms=" + ms + ", se=" + se + "]";
	}
	public void doDestroy()
	{
		System.out.println(" do destroy  called ");
	}
	
	
}//end class





















