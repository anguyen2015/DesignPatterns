/* 
 * Name: Andrew Nguyen
 * 
 * Assignment: Pattern Assignment 2
 * 
 * */
public abstract class Beverage {
	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description; 
		}
		
	public String reciept()
	{
		return "--"+ description + "--";
	}
		public abstract double cost();

}
