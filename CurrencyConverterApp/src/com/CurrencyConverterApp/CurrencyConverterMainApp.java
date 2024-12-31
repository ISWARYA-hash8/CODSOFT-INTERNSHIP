package com.CurrencyConverterApp;

import java.util.Scanner;

public class CurrencyConverterMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConverter converter = new CurrencyConverter();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\nCurrency Converter");
			System.out.println("Enter Source Currency (e.g. USD):");
			String fromCurrency = scanner.next().toUpperCase();
			
			
			System.out.println("Enter Source Currency (e.g. INR):");
			String toCurrency = scanner.next().toUpperCase();
			
			System.out.println("Enter the amount to convert: ");
			double amount  = scanner.nextDouble();
			
			try {
				double convertedAmount = converter.convert(fromCurrency,  toCurrency ,  amount);
				System.out.printf("converted amount: %.2f %s\n",convertedAmount,toCurrency);
				
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("DO you want to peform another conversion? (yes/no)");
			String choice = scanner.next();
			if(!choice.equalsIgnoreCase("yes")) {
				System.out.println("Exiting.....");
				break;
			}
			scanner.close();
		}

	}

}
