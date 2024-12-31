package com.atm;

import java.util.Scanner;

public class ATMmachine {

		    private void getBalanceamount(int balance){
		            System.out.println("your current balance is Rs." + balance);

		    }
		    public static void  doWithdraw(int balance, int withdraw){
		        if(balance>=withdraw){
		            balance = balance - withdraw;
		            System.out.println("please collect your money and collect the card");
		            System.out.println("current balance :" + balance);

		        }
		        else {
		            System.out.println("INSUFFICIENT BANK BALANCE ");

		        }

		    }
		    public static void doDeposit(int balance,int deposit){
		        balance = balance + deposit;
		        System.out.println("your deposit transaction has been successful with Rs."+balance);
		    }
		    
		    public static void main(String[] args){
		        Scanner input = new Scanner(System.in);
		        System.out.println("Enter the Balance Amount:");
		  
		        int balance = input.nextInt();
		        /*int withdraw = input.nextInt();
		        int deposit = input.nextInt();*/
		        ATMmachine obj = new ATMmachine();

		        obj.getBalanceamount(balance);
		        System.out.println("Enter 1 for withdrawal or 2 for deposit: ");
		        int operation = input.nextInt();
		        if(operation == 1){
		        	System.out.println("Enter the Amount to be Withdrawn: ");
		            int withdraw = input.nextInt();
		        doWithdraw(balance,withdraw);}
		        else if(operation==2){
		        	System.out.println("Enter the Amount to be Deposited:");
		            int deposit = input.nextInt();
		        doDeposit(balance,deposit);
		        }
		        else{
		            System.out.println("INVALID OPERATION");
		        }



		    }}
		


	
