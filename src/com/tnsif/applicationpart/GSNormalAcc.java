package com.tnsif.applicationpart;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{
	public float deliveryharges=50;
	
	
	/**
	 * @param accNo
	 * @param accName
	 * @param charges
	 * @param deliveryCharges
	 * @param deliveryharges
	 */
	public GSNormalAcc(int accNo, String accName, float charges, float deliveryCharges, float deliverycharges) {
		super(accNo, accName, charges, deliveryCharges);
		this.deliverycharges = deliveryCharges;
	}
	public void  bookProduct(float charges)
	{
		System.out.println("Dear Normal user your product charges are " +charges+  " with deliverycharges " +deliverycharges); 
	}
	@Override
	public String toString() {
		return "GSNormalAcc [deliverycharges=" + deliverycharges + ", deliverycharges=" + deliverycharges + ", accNo="
				+ accNo + ", accName=" + accName + ", charges=" + charges + "]";
	}
	
	

}
