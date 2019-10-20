/**
 * 
 */
package lt.jundzilo.pd12;

/**
 * Java OP. PD12
 *
 */
public class Runner {

	public static void main(String[] args) {
		ShoppingCart myCart = new ShoppingCart();
		Product toy = new Product("car", 12.0);
		Paper book = new Paper("comics", 3.0);
		Medicine drugs = new Medicine("aspirin", 4.0);

		myCart.add(toy);
		myCart.add(book);
		myCart.add(drugs);

		System.out.println("Without VAT: " + myCart.getTotalPrice());
		System.out.println("With VAT: " + myCart.getTotalPriceWithVat());

	}

}
