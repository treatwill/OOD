package org.tekcamp.payments;

public class CreditCard extends PaymentMethod {

	public CreditCard(String cardType, String cardHolderName, String cardNumber, Integer cvc, String expiryDate) {
		super(cardType, cardHolderName, cardNumber, cvc, expiryDate);
	}

	@Override
	boolean validate(){
		return super.validate();
	}

}
