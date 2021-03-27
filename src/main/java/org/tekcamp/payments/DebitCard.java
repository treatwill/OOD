package org.tekcamp.payments;

public class DebitCard extends PaymentMethod {
	private int pin;

	public DebitCard(String cardType, String cardHolderName, String cardNumber, String expiryDate) {
		super(cardType, cardHolderName, cardNumber, null, expiryDate);
	}

	@Override
	boolean validate() {
		// in order to validate a debit card, the pin number must be correct.  no CVC code is required for a valid debit card
		return super.validate();
	}
}
