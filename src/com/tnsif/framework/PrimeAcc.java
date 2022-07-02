package com.tnsif.framework;

public class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	//private static float deliveryCharges; 
	
	/**
	 * @param accNo
	 * @param accName
	 * @param charges
	 * @param isPrime
	 */
	public PrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges);
		this.isPrime = isPrime;
	}
	//public PrimeAcc(int accNo,String accName,float charges,boolean isPrime2) {
	
	

	public void  bookProduct(float charges) 
	{
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", accName=" + accName + ", charges=" + charges
				+ "]";
	}
	
	
	//public static void main(String[] args) {
		

	

}
