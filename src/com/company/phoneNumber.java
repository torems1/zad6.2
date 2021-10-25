package com.company;

public class phoneNumber {
    private final short areaCode;
    private final short exChange;
    private final short exTension;
    private static String [] zeros={"","0","00","000","0000","00000","000000","0000000","00000000","000000000"};

    public phoneNumber(int areaCode,int exChange,int exTension){
        rangeCheck(areaCode,999,"area code");
        rangeCheck(exChange,999,"exchange");
        rangeCheck(exTension,999,"exTension");
        this.areaCode=(short) areaCode;
        this.exChange=(short) exChange;
        this.exTension=(short) exTension;
    }
    private static void rangeCheck(int arg,int max,String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
        }

        public boolean equals(Object o){
            if(o==this){
                return true;
            }
            if(!(o instanceof phoneNumber))
                return false;
            phoneNumber pm=(phoneNumber) o;
            return pm.exTension == exTension &&
            pm.exChange== exChange&&
            pm.areaCode== areaCode;
        }
        public int hashCode(){
            int result=17;
            result=37*result+areaCode;
            result=37*result+exChange;
            result=37*result+exTension;
            return result;
        }
        public String toString(){
            return "{"+toPaddedString(areaCode,3)+"} "+toPaddedString(exChange,3)+"-"+toPaddedString(exTension,4);
        }
        private static String toPaddedString(int i,int lenght){
        String s=Integer.toString(i);
        return zeros[lenght-s.length()]+s;
    }
}
