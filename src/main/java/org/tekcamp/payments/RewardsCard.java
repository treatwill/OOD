package org.tekcamp.payments;

public class RewardsCard extends PaymentMethod {

	public RewardsCard(String cardType, String cardNumber, String expiryDate) {
		super(cardType, null, cardNumber, null, expiryDate);
	}

	//there is no name validation required for the rewards card
}
