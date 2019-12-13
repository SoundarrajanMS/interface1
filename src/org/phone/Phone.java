package org.phone;

public class Phone {
	public void phoneInfo(String brand,String model,int mfg,float weight,long simno) {
	System.out.println("brand name is "+brand +model+"\n"+"year of manufacturing-"+mfg+"\n"+"solid weight in ounces is "+weight+"\n"+"sim number used in phone-"+simno);

}
	public static void main(String[] args) {
		Phone j = new Phone();
		j.phoneInfo("Apple","6s", 2016, 5.14f, 9965105007l);
		
	}

}
