package com.adapterpattern.demo;

import java.io.*;
public class BankCustomer extends BankDetails implements CreditCard{

	@Override
	public void giveBankDetails() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the account holder name:");
			String customerName = br.readLine();
			
			System.out.println("Enter the account number:");
			long accountNumber = Long.parseLong(br.readLine());
			
			System.out.println("Enter the bank name:");
			String bankName = br.readLine();
			
			setAccHolderName(customerName);
			setAccNumber(accountNumber);
			setBankName(bankName);
			
		}catch(Exception exp) {
			exp.getStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
		long accountNum = getAccNumber();
		String accHolderName = getAccHolderName();
		String bName = getBankName();
		return ("The Account number " + accountNum + " of " + accHolderName + " in " + bName + " bank is valid and authenticated for issuing the credit card. "); 
	}
	
}
