package lt.jundzilo.pd12;

public class Product extends AbstractProduct implements ShoppingCartItems{

	private static final double PRODUCT_VAT = 1.21;
	
	public Product(String name, double price) {
		super(name, price);

	}

	@Override
	public double getVAT() {

		return PRODUCT_VAT;
	}
	
	

}
