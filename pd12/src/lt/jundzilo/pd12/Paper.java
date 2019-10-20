package lt.jundzilo.pd12;

public class Paper extends AbstractProduct implements ShoppingCartItems{

	private static final double PAPER_VAT = 1.09;

	
	public Paper(String name, double price) {
		super(name, price);
	
	}

	@Override
	public double getVAT() {
		
		return PAPER_VAT;
	}
	
	

}
