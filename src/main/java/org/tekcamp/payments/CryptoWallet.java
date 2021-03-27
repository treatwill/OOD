package org.tekcamp.payments;

public class CryptoWallet extends PaymentMethod {
	private String cryptoCurrency;
	private String walletAddress;

	public CryptoWallet(String cryptoCurrency, String walletAddress) {
		super(null,null, null, null, null);
		this.cryptoCurrency = cryptoCurrency;
		this.walletAddress = walletAddress;
	}

}
