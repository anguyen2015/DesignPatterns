/* 
 * Name: Andrew Nguyen
 * 
 * Assignment: Pattern Assignment 2
 * 
 * */

public class CondimentFactory{
	
	public Beverage getCondiment(Beverage beverage, int selection) {
	
		if (selection == 1) {
			beverage = new Soy(beverage);
		}
		
		else if (selection == 2) {
			beverage = new Mocha(beverage);
		}
		
		else if (selection == 3) {
			beverage = new Whip(beverage);
		}
		
		else if (selection == 4) {
			beverage = new Sprinkles(beverage);
		}
		
		else {
			return beverage;
		}
		
		return beverage;
	}
	
	public class Soy extends CondimentDecorator {
		Beverage beverage;

		public Soy(Beverage beverage) {
			this.beverage = beverage;
		}

		public String getDescription() {
			return beverage.getDescription() + ", Soy";
		}

		public double cost() {
			return .15 + beverage.cost();
		}
	}
	
	public class Mocha extends CondimentDecorator {
		Beverage beverage;
	 
		public Mocha(Beverage beverage) {
			this.beverage = beverage;
		}
	 
		public String getDescription() {
			return beverage.getDescription() + ", Mocha";
		}
	 
		public double cost() {
			return .20 + beverage.cost();
		}
	}
	
	public class Sprinkles extends CondimentDecorator {
		Beverage beverage;
	 
		public Sprinkles(Beverage beverage) {
			this.beverage = beverage;
		}
	 
		public String getDescription() {
			return beverage.getDescription() + ", Sprinkles";
		}
	 
		public double cost() {
			return .05 + beverage.cost();
		}
	}
	
	public class Whip extends CondimentDecorator {
		Beverage beverage;
	 
		public Whip(Beverage beverage) {
			this.beverage = beverage;
		}
	 
		public String getDescription() {
			return beverage.getDescription() + ", Whip";
		}
	 
		public double cost() {
			return .10 + beverage.cost();
		}
	}
}
