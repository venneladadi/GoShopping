package com.tnsif.applicationpart;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopFactory;

public class GSShopFactory implements ShopFactory
{
	

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		PrimeAcc gsprime=new GSPrimeAcc(accNo,accName,charges,isPrime);
		return gsprime;
	}


	@Override
	public NormalAcc getNewNormalAcc(int AccNo, String accName, float charges, float deliveryCharges) {
		NormalAcc gsnormal=new NormalAcc(AccNo,accName,charges,deliveryCharges);
		return gsnormal;
	}


	public void getNormalAccount(int i, String string, int j, int k) {
		// TODO Auto-generated method stub
		
	}

}
