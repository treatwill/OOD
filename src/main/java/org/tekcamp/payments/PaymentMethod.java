package org.tekcamp.payments;

public abstract class PaymentMethod {
	String cardHolderName;
	String cardType;
	String cardNumber;
	Integer cvc;
	String expiryDate;

	protected PaymentMethod(String cardType, String cardHolderName, String cardNumber, Integer cvc, String expiryDate) {
		this.cardType = cardType;
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cvc = cvc;
		this.expiryDate = expiryDate;
	}

	boolean validate() {
		// basic validation on name, expiryDate etc.
		if (cardHolderName == null || cardHolderName.isEmpty()) {
			System.out.println("Invalid Cardholder name");
			return false;
		}

		if (cardNumber == null || cardNumber.isEmpty()) {
			System.out.println("Invalid Card #");
			return false;
		}

		if (cvc == null) {
			System.out.println("Invalid CVC code");
			return false;
		}

		//add a validation check for checking if the expiryDate has passed already.
		if (expiryDate == null) {
			System.out.println("Expiration Date reached");
			return false;
		}

		System.out.println(this.cardType + " validated");
		return true;
	}

}
