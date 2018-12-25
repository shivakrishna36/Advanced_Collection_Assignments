package com.capgemini.savingsaccount;

import java.util.Comparator;
import java.util.Set;

public class BankAccountList
{
	private String accountHolderName;
	private int accountId;
	private double salary;
	private int accountnumber;
	String name = "";

	public BankAccountList() {

	}

	public BankAccountList(String accountHolderName, int accountId,
			double salary, int accountnumber) {
		this.accountHolderName = accountHolderName;
		this.accountId = accountId;
		this.salary = salary;
		this.accountnumber = accountnumber;
	}

	/**
	 * @return the accountHolderName
	 */
	public String getAccountHolderName() {
		return accountHolderName;
	}

	/**
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountId;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccountList other = (BankAccountList) obj;
		if (accountId != other.accountId)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAccountList [accountHolderName=" + accountHolderName
				+ ", accountId=" + accountId + ", salary=" + salary
				+ ", accountnumber=" + accountnumber + "]";
	}

	/**
	 * @return the accountnumber
	 */
	public int getAccountnumber() {
		return accountnumber;
	}
	
	public String show(Set<BankAccountList> set)
	{
		
		for(Object names: set)
		{
			name = name +names+" ";
		}
		return name.toString();
	}
}
class accountID implements Comparator<BankAccountList>
{
	@Override
	public int compare(BankAccountList list1, BankAccountList list2)
	{
		if(list1.getAccountId()==list2.getAccountId())
			return 0;
		else if(list1.getAccountId() < list2.getAccountId())
			return -1;
		else
			return 1;
	}
}
