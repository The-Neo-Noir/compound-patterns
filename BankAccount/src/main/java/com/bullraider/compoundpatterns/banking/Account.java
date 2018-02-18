package com.bullraider.compoundpatterns.banking;
import java.util.Currency;
import java.util.Locale;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public abstract class Account {

	private AccountHolder accountHolder;
	private AccountType accountType;
	private CurrencyUnit unit;
	private Money currentBalance;
	public Account(AccountHolder accountHolder, AccountType accountType) {
		this.accountHolder=accountHolder;
		this.accountType=accountType;
		unit=CurrencyUnit.USD;
		currentBalance=Money.zero(unit);
	}
	public Account(AccountHolder accountHolder, AccountType accountType,Money openeningBalance) {
		this(accountHolder,accountType);
		currentBalance=openeningBalance;
	}
	public abstract void withdraw();
	public  void deposit(Money money) {
	currentBalance=currentBalance.plus(money);
	}
	
	public  Money showBalance() {
		return currentBalance;
	}
	
	
}
