/* 
 * Name: Andrew Nguyen
 * 
 * Assignment: Pattern Assignment 2
 * 
 * */

import java.util.Scanner;

public class StarbuzzCoffee {
 
	static CondimentFactory defaultCondimentFactory = new CondimentFactory();
	static Beverage beverage = null;
	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		
		String coffeeType;
		String condimentType;
		
		System.out.println("Enter a valid coffee type(Espresso, DarkRoast, Decaf, HouseBlend) : ");
		coffeeType = myScanner.nextLine();
		
		if (coffeeType.equals("Espresso")) {
			System.out.println("Espresso \n");
			beverage = new Espresso();
		}
		
		else if (coffeeType.equals("DarkRoast")) {
			System.out.println("Dark Roast \n");
			beverage = new DarkRoast();
		}
		
		else if (coffeeType.equals("Decaf")) {
			System.out.println("Decaf \n");
			beverage = new Decaf();
		}
		
		else { // House Blend
			System.out.println("House Blend \n");
			beverage = new HouseBlend();
		}
		
		System.out.println("Enter your Condiments (Soy, Mocha, Whip, Sprinkles, End sale) : ");
		while(true) {
		condimentType = myScanner.nextLine();
		if (condimentType.equals("Soy")) {
			beverage = defaultCondimentFactory.getCondiment(beverage, 1);
		}
		
		else if (condimentType.equals("Mocha")) {
			beverage = defaultCondimentFactory.getCondiment(beverage, 2);
		}
		
		else if (condimentType.equals("Whip")) {
			beverage = defaultCondimentFactory.getCondiment(beverage, 3);
		}
		
		else if (condimentType.equals("Sprinkles")) {
			beverage = defaultCondimentFactory.getCondiment(beverage, 4);
		}
		
		else if (condimentType.equals("End sale")) {
			break;
		}
		
		else {
			System.out.println("Invalid Condiment... ");
		}
	}
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}