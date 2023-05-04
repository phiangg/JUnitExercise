package com.orangeandbronze.junit;

import java.math.BigDecimal;

class BankAccount {
	
	private BigDecimal balance = BigDecimal.ZERO;
	
	BankAccount(BigDecimal balance) {
		this.balance = balance;
	}
	
	void withdraw(BigDecimal amount) {
		notNullNorNegative(amount);
		if (amount.compareTo(balance) > 0) {
			throw new InsufficientFundsException("The amount " + amount + " was greater than the balance " + balance + '.');
		}
		balance = balance.subtract(amount);
	}
	
	void deposit(BigDecimal amount) {
		notNullNorNegative(amount);
		balance = balance.add(amount);
	}
	
	private static void notNullNorNegative(BigDecimal amount) {
		if (amount == null) {
			throw new IllegalArgumentException("Amount parameter was null.");
		} 
		if (amount.signum() < 0) {
			throw new IllegalArgumentException("Amount parameter was negative: " + amount);
		}
	}
}

class InsufficientFundsException extends RuntimeException {

	InsufficientFundsException(String message) {
		super(message);
	}
	
}
