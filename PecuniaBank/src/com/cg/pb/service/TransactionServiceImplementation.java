package com.cg.pb.service;

import com.cg.pb.bean.Account;

public class TransactionServiceImplementation implements TransactionService{
	Account account=new Account();
	private int balance;

	
	@Override
	public void creditUsingSlip(int amount) {
		// TODO Auto-generated method stub
		
		if(amount<0) {
			System.out.println("invalid");
		}
		else {
			this.balance=this.balance+amount;
			System.out.println("Credited Successfully");
		}
			
		}
	


	@Override
	public void debitUsingSlip(int amount) {
		
		// TODO Auto-generated method stub
		if(amount<=account.getBalance()) {
			this.balance=this.balance-amount;
			System.out.println("Debited Successfully");
		}
		else
			System.out.println("Invalid");
		
		}
		
	

	@Override
	public void creditUsingCheque() {
		// TODO Auto-generated method stub
		
		
	}

	//@Override
  public void debitUsingCheque() {
		// TODO Auto-generated method stub
		
		
      }
}
