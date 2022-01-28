package com.program.strings;

public class StringComparison {
    public static void main(String[] args) {
        String s1=new String("sandeep");
        StringBuffer s2=new StringBuffer("sandeep");
        StringBuffer s3= new StringBuffer("sandeep");
        String s4 = new String("sandeep");
        String s5 = "sandeep";
        String s6 = "sandeep";

        System.out.println("s1.equals(s2) : "+s1.equals(s2));
        System.out.println("s1.equals(s3) : "+s1.equals(s3));
        System.out.println("s1.equals(s4) : "+s1.equals(s4));

        System.out.println("s1.hashCode() : "+s1.hashCode());


        System.out.println("s2.hashCode() : "+s2.hashCode());
        System.out.println("s3.hashCode() : "+s3.hashCode());
        System.out.println("s4.hashCode() : "+s4.hashCode());
        System.out.println("s5.hashCode() : "+s5.hashCode());
        System.out.println("s6.hashCode() : "+s6.hashCode());

        System.out.println("s2 : "+s2);
        System.out.println("s3 : "+s3);
        System.out.println("s1=s4 : "+s1==s4);
        System.out.println("s1=s5 : "+s1==s5);
        System.out.println("s1=s6 : "+s1==s6);


    }

}
