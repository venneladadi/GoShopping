package com.tnsif.framework;

public class NormalAcc extends ShopAcc 
{
	public  float deliverycharges;
public NormalAcc(int accNo,String accName,float charges, float deliveryCharges) {
	super(accNo, accName, charges);
	this.deliverycharges = deliveryCharges;
}
//public NormalAcc(int accNo,String accName,float charges,float deliveryCharges2) {
	


public void bookProduct(float charges)
	{
		
	}

@Override
public String toString() {
	return "NormalAcc [deliverycharges=" + deliverycharges + ",accNo=" +accNo+",charges=" +charges +"]";
}
		// TODO Auto-generated method stub

	

}
