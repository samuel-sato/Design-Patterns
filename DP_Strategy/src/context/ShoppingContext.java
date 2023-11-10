package context;

import java.util.ArrayList;
import java.util.List;

import strategy.Payment;

public class ShoppingContext {

	List<Item> itens;
	Payment payment;
	
	public ShoppingContext() {
		this.itens = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.itens.add(item);
	}
	
	public void removeItem(Item item) {
		this.itens.remove(item);
	}
	
	public double calculateTotalPrice() {
		double total = 0;
		for(Item item: itens) {
			total += item.getPrice();
		}
		return total;
	}
	
	public void pay(Payment payment) {
		this.payment = payment;
		double totalPrice = this.calculateTotalPrice();
		this.payment.pay(totalPrice);
	}
	
}
