package Program;

import context.Item;
import context.ShoppingContext;
import strategy.Payment;
import strategy.PaymenteByBankingBillet;
import strategy.PaymenteByCreditCard;

public class Main {
	
	public static void main(String args[]) {
		System.out.println("Hello");

		// Strategy: Classes implementam ou herdam de uma classe abstrata e implementam um método utilizando diferentes estratégias
		// ,assim não é necessários expecificar qual o método de pagamento, apenas chama a o metodo pagar da classe que implementa pagamento
		
		Payment payment;
		
		Item i1 = new Item("Bola", 200.12);
		Item i2 = new Item("Carrinho", 15.42);
		Item i3 = new Item("Avião", 123.32);
		
		//Cartão
		ShoppingContext shoppingContext = new ShoppingContext();
		shoppingContext.addItem(i1);
		shoppingContext.addItem(i2);
		shoppingContext.addItem(i3);
		payment = new PaymenteByCreditCard("Pessoa1", "123456789", "321", "12/04/24");
		shoppingContext.pay(payment);
		
		//Boleto
		payment = new PaymenteByBankingBillet("Pessoa2", "Loja 1", "9876543210", "12/04/2023");
		shoppingContext.pay(payment);
		
	}

}

