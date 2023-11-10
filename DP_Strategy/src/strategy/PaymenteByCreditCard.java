package strategy;

import java.text.SimpleDateFormat;

public class PaymenteByCreditCard implements Payment
{
	
	private String credtCardOwnerName;
	private String credtCardNumber;
	private String credtCardCheckerCode;
	private String credtCardExpiryDate;
	
	SimpleDateFormat sipleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	

	public PaymenteByCreditCard(String credtCardOwnerName, String credtCardNumber, String credtCardCheckerCode,
			String credtCardExpiryDate) {
		this.credtCardOwnerName = credtCardOwnerName;
		this.credtCardNumber = credtCardNumber;
		this.credtCardCheckerCode = credtCardCheckerCode;
		this.credtCardExpiryDate = credtCardExpiryDate;
	}



	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("Payment by credit card");
		System.out.println(this.toString());
		
	}



	@Override
	public String toString() {
		return "PaymenteByCreditCard [credtCardOwnerName=" + credtCardOwnerName + ", credtCardNumber=" + credtCardNumber
				+ ", credtCardCheckerCode=" + credtCardCheckerCode + ", credtCardExpiryDate=" + credtCardExpiryDate
				+ "]";
	}
	
	

}
