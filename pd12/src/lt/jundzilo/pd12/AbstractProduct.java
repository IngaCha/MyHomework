package lt.jundzilo.pd12;

public abstract class AbstractProduct implements ShoppingCartItems {
		
		private String name;
		private double price;
		
		public AbstractProduct(String name, double price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public double getPrice() {
			return price;
		}
		
		public double getPriceWithVAT() {
			return this.price*this.getVAT();
		}
		
		public abstract double getVAT();

	}

