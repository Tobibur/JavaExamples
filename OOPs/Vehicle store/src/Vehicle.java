package src;

abstract public class Vehicle {
	
	private String vehicleType;
	private String company;
	private String color;
	private int year;
	private static int count;
	
	public Vehicle(String vehicleType, String company, String color, int year){
		this.vehicleType = vehicleType;
		this.company = company;
		this.color = color;
		this.year = year;
		count++;
	}
	
	public abstract String servicing();
	
	public void setVehicleType(String vehicleType){
		this.vehicleType = vehicleType;
	}
	
	public void setCompany(String company){
		this.company = company;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public String getVehicleType(){
		return this.vehicleType;
	}
	
	public String getCompany(){
		return this.company;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public static int getCount(){
		return count;
	}
}
