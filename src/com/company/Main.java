package com.company;

public class Main {

    public static void main(String[] args) {
	    phoneNumber phoneNumber1=new phoneNumber(121,111,1324);
	    phoneNumber phoneNumber2=new phoneNumber(121,111,1324);
	    phoneNumber phoneNumber3=new phoneNumber(000,000,0000);
	    boolean result=phoneNumber1.equals(phoneNumber2);
        System.out.println("first = second = "+result);
        result=phoneNumber2.equals(phoneNumber3);
        System.out.println("second = third = "+result);
        String strPhoneNum=phoneNumber2.toString();
        System.out.println(strPhoneNum);
        int hashcd=phoneNumber1.hashCode();
        System.out.println("Hash code= "+hashcd);
    }
}
