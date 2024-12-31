package com.numberguessing;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Random rand = new Random();
			int randomNumber = rand.nextInt(100)+1;
			//System.out.println("Random Number is :" + randomNumber);
			int trycount = 0;
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				
			
			System.out.println("Enter your guess(1-100)");
	         
	         int playerguess = scanner.nextInt();
	         trycount++;
	         if(playerguess == randomNumber) {
	        	 System.out.println("correct! you win!");
	        	 System.out.println(" It took you " + trycount + " tries to guess the number ");
	        	 break;
	         }
	         else if(randomNumber > playerguess) {
	        	 System.out.println("Nope! the number is higher . guess again .");
	         }
	         else {
	        	 System.out.println("Nope the number is lower . guess again.");
	        	 
	         }}
			scanner.close();
			
 
	}

}
