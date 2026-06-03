package com.hexaware.atm.presentation;

import com.hexaware.atm.service.BankImp2;
import com.hexaware.atm.service.IBank;

public class BankUtil {
	
	
	
			public static IBank    getBankObj(){
				
				
				return new BankImp2();
				
			}
	

}
