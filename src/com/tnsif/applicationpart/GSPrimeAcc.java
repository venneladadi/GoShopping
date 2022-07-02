package com.tnsif.applicationpart;

import com.tnsif.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	
	public final float Charges=0;
	public GSPrimeAcc(int accNo,String accName,float charges,boolean isPrime)
	{
		super(accNo,accName,charges,isPrime);
	}




	public void bookProduct(float charges)
	{
		System.out.println("Dear prime user your product charges are " +charges);
	}
	
	
	

	@Override
	public String toString() {
		return "GSPrimeAcc [Charges=" + Charges + ", accNo=" + accNo + ", accName=" + accName + ", charges=" + charges
				+ "]";
	}




	

}
