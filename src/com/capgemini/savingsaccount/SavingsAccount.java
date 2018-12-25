package com.capgemini.savingsaccount;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
public class SavingsAccount implements Serializable
{
	private String name ="";
	private double accountBalance;
	private String accountHolderName;
	private int accountid;
	private boolean isSalary;
	
	public SavingsAccount(double accountBalance,String accountHolderName,int accountid,boolean isSalary)
	{
		this.accountBalance =accountBalance;
		this.accountHolderName = accountHolderName;
		this.accountid = accountid;
		this.isSalary =isSalary;
	}

	/**
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @return the accountHolderName
	 */
	public String getAccountHolderName() {
		return accountHolderName;
	}

	/**
	 * @return the accountid
	 */
	public int getAccountid() {
		return accountid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SavingsAccount [accountBalance=" + accountBalance
				+ ", accountHolderName=" + accountHolderName + ", accountid="
				+ accountid + ", isSalary=" + isSalary + "]";
	}

	/**
	 * @return the isSalary
	 */
	public boolean isSalary() {
		return isSalary;
	}
	
	public String showValues(ArrayList list)
	{
		Iterator values = list.iterator();
		while(values.hasNext())
		{
			name = name + " " + values.next();
		}
		return name.toString();
	}

	public void display(ArrayList<SavingsAccount> list) throws IOException 
	{
		File name = new File("C:/ShivaKrishna/JAVA_PROGRAMS/savingsaccount.txt");
		if(!name.exists())
		{
			name.createNewFile();
		}
		FileOutputStream file = new FileOutputStream(name);
		ObjectOutputStream object = new ObjectOutputStream(file);
		object.writeObject(list);
		object.close();
	}
	
	public ArrayList<SavingsAccount> displayObject() throws IOException, ClassNotFoundException
	{
		FileInputStream input = new FileInputStream("C:/ShivaKrishna/JAVA_PROGRAMS/savingsaccount.txt");
		ObjectInputStream values = new ObjectInputStream(input);
		ArrayList<SavingsAccount> account = (ArrayList<SavingsAccount>)values.readObject();
		return account;
	}
	
}
