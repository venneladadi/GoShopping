package com.tnsif.framework;

public interface ShopFactory {
	public abstract PrimeAcc getNewPrimeAcc( int accNo,String accNm,float charges,boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int AccNo,String accNm,float charges,float deliveryCharges);
	
	

}
