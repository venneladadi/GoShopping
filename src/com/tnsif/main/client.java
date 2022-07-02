package com.tnsif.main;

import com.tnsif.applicationpart.GSNormalAcc;
import com.tnsif.applicationpart.GSPrimeAcc;
import com.tnsif.applicationpart.GSShopFactory;

public class client {

	public static void main(String[] args) {
		//step a
		GSShopFactory gssfactory=new GSShopFactory();
		gssfactory.getNewPrimeAcc(101,"xyz",10000, true);
		gssfactory.getNormalAccount(102,"abc", 879837, 50);
		
		//step b 
		GSPrimeAcc gsprime=new GSPrimeAcc(101,"xy",10000,true);
		
		//step c 
		GSNormalAcc gsnormal=new GSNormalAcc(102,"abc", 879837, 50, 0);
		
		//step d
		gsprime.bookProduct(10000);
		gsnormal.bookProduct(879837);
		
		//step e
		gsprime.toString();
		gsnormal.toString();

	}

}
