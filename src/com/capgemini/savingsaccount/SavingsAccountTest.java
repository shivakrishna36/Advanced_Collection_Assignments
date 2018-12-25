package com.capgemini.savingsaccount;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest 
{
	Logger log = Logger.getLogger(SavingsAccountTest.class.getName());
	private SavingsAccount account1,account2,account3,account4,account5;
	private BankAccountList list1,list2,list3;
	
	@Before
	public void setUp()
	{
		list1 = new BankAccountList("Balor", 101, 10000, 123456);
		list2 = new BankAccountList("Michales", 102, 10000, 123458);
		list3 = new BankAccountList("Randy",103,7500,123459);
		account1 = new  SavingsAccount(1000,"Krishna",111,true);
		account2 = new  SavingsAccount(5000,"Shiva",112,true);
		account3 = new  SavingsAccount(15000,"Ramu",113,true);
		account4 = new  SavingsAccount(10300,"sai",114,true);
		account5 = new  SavingsAccount(10200,"Ganesh",115,true);
		
	}

	@Test
	public void testForDisplay() 
	{
		ArrayList<SavingsAccount> list = new ArrayList<SavingsAccount>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		Iterator values = list.iterator();
		while(values.hasNext())
		{
			System.out.println(values.next().toString());
		}
	}
	
	@Test
	public void testForWriteObject() throws IOException, ClassNotFoundException
	{
		ArrayList<SavingsAccount> list = new ArrayList<SavingsAccount>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		account1.display(list);
	}
	
	@Test
	public void testForReadObject() throws IOException, ClassNotFoundException
	{
		ArrayList<SavingsAccount> list = new ArrayList<SavingsAccount>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		assertEquals(list.toString(),account1.displayObject().toString());
	}
	
	@Test
	public void testForBankAccountIdInAscendingOrderList()
	{
		Set<BankAccountList> set = new TreeSet<BankAccountList>(new accountID());
		set.add(list1);
		set.add(list2);
		set.add(list3);
		String answer ="BankAccountList [accountHolderName=Balor, accountId=101, salary=10000.0, accountnumber=123456] BankAccountList [accountHolderName=Michales, accountId=102, salary=10000.0, accountnumber=123458] "
				+ "BankAccountList [accountHolderName=Randy, accountId=103, salary=7500.0, accountnumber=123459] ";
		assertEquals(answer,list1.show(set));

	}

}
