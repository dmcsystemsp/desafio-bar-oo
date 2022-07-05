package entities;

public class Bill {
	public static double COUVERT = 4.0;
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
		
	public double cover() {
		return COUVERT;
	}
	
	public double ticket() {
		if (this.gender=='M') {
			return 10.0;
		}else {
			return 8.0;
		}
	}
	
	public double feeding() {
		double beer = this.beer * 5.0;
		double softDrink = this.softDrink * 3.0;
		double barbecue = this.barbecue * 7.0;
		return beer + barbecue + softDrink;	
	}
	
	public double total() {
		if(feeding() > 30.0) {
			return feeding() + ticket();
			
		}else {
			return feeding() + cover() + ticket();
		}
	}
	
}
