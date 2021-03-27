package org.tekcamp.payments;

import org.tekcamp.payments.CreditCard;

public class PaymentProcessing {


	public static void main(String[] args) {

		//There are several payment methods created in the org.tekcamp.payments package.  All payment methods currently extend the PaymentMethod abstract class.  However, each payment method has a different way of being validated.  Use the Liskov Substitution Principle and Open/Closed Principle to restructure this application so that the subclasses can be substituted for each other without causing any breakage of code or explicit refactoring.

		PaymentProcessing pp = new PaymentProcessing();

		CreditCard visa = new CreditCard("visa","Joy Jones", "1234566322", 123, "1/14/2025");
		visa.validate();

		DebitCard masterCardDebit = new DebitCard("mastercard","Sunny Sylvester","234234234324","1/1/28");
		masterCardDebit.validate();

		RewardsCard visaRewards = new RewardsCard("visa","234234234234","1/2/23");
		visaRewards.validate();

		CryptoWallet bitCoinWallet = new CryptoWallet("bitcoin","234dk324fdask3342fdafeweqr90090");
		bitCoinWallet.validate();

	}


}
