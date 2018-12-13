/* 
 * Name: Andrew Nguyen
 * 
 * Assignment: Pattern Assignment 1
 * 
 * */
public class serviceProvider {
	private static serviceProvider singleton;
	
	private serviceProvider() {}
	
	public static serviceProvider getInstance() {
		if (singleton == null) {
			System.out.println("Constructing ServiceProvider.");
			singleton = new serviceProvider();
		}
		
		else {
			System.out.println("ServiceProvider already exists.");
		}
		return singleton;
	}
}