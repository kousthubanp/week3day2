package week3day2;

public class Amazon extends CanaraBank{

	public void cashOnDelivery() {
		System.out.println("available");
		
	}

	 public void upiPayment() {
		 System.out.println("available");
	}
	 
	 public void cardPayment() {
		 System.out.println("available");
	}
	 
	 public void internetBanking() {
		 System.out.println("available");
	}
	 public void recordPaymentDetails() {
	System.out.println("recorded");
	 }

	 public static void main(String[] args) {
		Amazon a= new Amazon();
	  a.cashOnDelivery();
	  a.upiPayment();
	  a.cashOnDelivery();
	  a.cardPayment();
	  a.recordPaymentDetails();
	}
	
}
