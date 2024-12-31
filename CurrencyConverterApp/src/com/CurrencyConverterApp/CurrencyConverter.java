package com.CurrencyConverterApp;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
	private Map<String,Double> exchangeRates;
	public CurrencyConverter() {
		exchangeRates = new HashMap<>();
		exchangeRates.put("USD", 1.0);   //US DOLLAR
		exchangeRates.put("EUR", 0.90);  //EURO
		exchangeRates.put("GBP", 0.76);   //BRITISH POUND
		exchangeRates.put("INR", 83.95);  //INDIAN RUPEE
		exchangeRates.put("JPY", 143.06);  //JAPANESE YEN
		exchangeRates.put("AUD", 1.49);    //AUSTRALIAN DOLLAR
		
	}
	public double convert(String fromCurrency , String toCurrency , double amount) {
		if(!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)){
			throw new IllegalArgumentException("Invalid currecy code: ");
			
		}
		double fromRate = exchangeRates.get(fromCurrency);
		double toRate = exchangeRates.get(toCurrency);
		//convert amount to USD first , then to the target currency 
		double amountInUSD = amount / fromRate;
		return amountInUSD * toRate;
		
	}

}
