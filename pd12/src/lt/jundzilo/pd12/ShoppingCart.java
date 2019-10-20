package lt.jundzilo.pd12;

public class ShoppingCart {
	
	private ShoppingCartItems[] items =  new ShoppingCartItems[3];
	private int countItems = 0;
	
	
	public void add(ShoppingCartItems item) {
		if (countItems == 0) {
			items[0] = item;
			countItems++;
		} else if (countItems == 1) {
			items[1] = item;
			countItems++;
		} else {
			items[2] = item;
		}
	}

	
	public double getTotalPrice() {
		double totalPrice = 0.0;
		for (ShoppingCartItems item : items) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}

	public double getTotalPriceWithVat() {
		double totalPriceWithVat = 0.0;
		for (ShoppingCartItems item : items) {
			totalPriceWithVat += item.getPriceWithVAT();
		}

		return totalPriceWithVat;
	}

}
