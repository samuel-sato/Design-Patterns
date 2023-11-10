package strategy;

import java.text.SimpleDateFormat;

public class PaymenteByBankingBillet implements Payment
{
	
	private String billetPaymerName;
	private String billetPaymerBeneficiaryName;
	private String billetPaymerNumber;
	private String billetPaymerExpiryDate;
	
	
	public PaymenteByBankingBillet(String billetPaymerName, String billetPaymerBeneficiaryName,
			String billetPaymerNumber, String billetPaymerExpiryDate) {
		this.billetPaymerName = billetPaymerName;
		this.billetPaymerBeneficiaryName = billetPaymerBeneficiaryName;
		this.billetPaymerNumber = billetPaymerNumber;
		this.billetPaymerExpiryDate = billetPaymerExpiryDate;
	}



	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("Payment by Banking Biller");
		System.out.println(this.toString());
		
	}



	@Override
	public String toString() {
		return "PaymenteByBankingBillet [billetPaymerName=" + billetPaymerName + ", billetPaymerBeneficiaryName="
				+ billetPaymerBeneficiaryName + ", billetPaymerNumber=" + billetPaymerNumber
				+ ", billetPaymerExpiryDate=" + billetPaymerExpiryDate + "]";
	}

	
	

}
