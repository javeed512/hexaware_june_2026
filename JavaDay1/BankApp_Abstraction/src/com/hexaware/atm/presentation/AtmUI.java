package com.hexaware.atm.presentation;
/*
 * @Author: Surya , UI Web Developer
 * Date: 05-june-2026
 * Desp: UI for ATM app
 * 
 */

import java.util.Scanner;

import com.hexaware.atm.service.IBank;

public class AtmUI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("******WELCOME TO ATM*******");
			System.out.println("1. DEPOSIT");
			System.out.println("2. WITHDRAW");
			System.out.println("3. EXIT");

			int choice = sc.nextInt();

			IBank bank = BankUtil.getBankObj();

			switch (choice) {
			case 1:

				// deposit()

				bank.deposit();

				break;
			case 2:
				// withdraw()

				bank.withdraw();
				break;
			case 3:

				flag = false;

				System.out.println("Thank you visit again..");

				break;

			default:
				System.err.println("Invalid option");

				break;
			}

		}

	}

}
