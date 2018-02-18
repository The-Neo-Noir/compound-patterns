package com.bullraider.compoundpatterns.banking;

import static org.junit.Assert.*;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.Test;

public class AccountTest {
		
		@Test
		public	void initialBalanceShouldBeZero() {
			Account ca= new DummyAccount(null, AccountType.CURRENT);
			Money balance=ca.showBalance();
			assertEquals(balance, Money.zero(CurrencyUnit.USD));
		
		}
		
		@Test
		public void initialBalanceShouldBeNonZero() {
			Account ca= new DummyAccount(null, AccountType.CURRENT,Money.of(CurrencyUnit.USD, 1.0));
			Money balance=ca.showBalance();
			assertEquals(balance, Money.of(CurrencyUnit.USD, 1.0));
		
		}
		@Test
		public void initialBalanceShould() {
			Account ca= new DummyAccount(null, AccountType.CURRENT,Money.of(CurrencyUnit.USD, 1.0));
			Money balance=ca.showBalance();
			assertEquals(balance, Money.of(CurrencyUnit.USD, 1.0));
		
		}
		@Test
		public void addAmountShouldResultInitialWithDeposit() {
			Account ca= new DummyAccount(null, AccountType.CURRENT,Money.of(CurrencyUnit.USD, 1.0));
			ca.deposit(Money.of(CurrencyUnit.USD,2.00));
			Money balance=ca.showBalance();
			assertEquals(balance, Money.of(CurrencyUnit.USD, 3.0));
			
		}

	}
	class DummyAccount extends Account{

		public DummyAccount(AccountHolder accountHolder, AccountType accountType) {
			super(accountHolder, accountType);
			// TODO Auto-generated constructor stub
		}
		

		public DummyAccount(AccountHolder accountHolder, AccountType accountType,Money money) {
			super(accountHolder, accountType,money);
			// TODO Auto-generated constructor stub
		}
		@Override
		public void withdraw() {
			// TODO Auto-generated method stub
			
		}

		

}
