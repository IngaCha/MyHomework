package lt.jundzilo.pd12;

public class Medicine extends AbstractProduct implements ShoppingCartItems{

	private static final double MEDICINE_VAT = 1.05;
	
	public Medicine(String name, double price) {
		super(name, price);

	}

	@Override
	public double getVAT() {

		return MEDICINE_VAT;
	}

}

