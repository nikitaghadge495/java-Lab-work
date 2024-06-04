package com.java;

public class test1 implements interfacedemo
{
     public void accept()
     {
    	 System.out.println("this is a accept method ");
     }
     
     public void dispaly()
     {
    	 System.out.println("this is a display method");
     }
     public static void main(String args[])
     {
    	 test1 t1 = new test1();
    	 t1.accept();
    	 t1.dispaly();
     }
}
