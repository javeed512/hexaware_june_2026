package com.hexaware.atm.service;

/*
 * @Author: Rahul
 * Date: 03-JUne-2026
 * Description: BankImp1 implemented
 */


public abstract class BankImp1  extends Object implements IBank{

	public BankImp1() {
		super();  // Object();
		
	}
	
	
	@Override
	public void deposit() {

		System.out.println("Deposit successful..");
		
	}

	
	public abstract void withdraw();
	
	

}
