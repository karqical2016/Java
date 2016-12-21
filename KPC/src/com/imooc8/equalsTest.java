package com.imooc8;

public class equalsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		
		System.out.println("int == int:"+ (a==b));
		System.out.println("int == int:"+ (a==b));
		
		System.out.println("int equals int:"+ (((Object)a).equals(b)));
		System.out.println("int equals int:"+ (((Object)b).equals(a)));
		
		
		
		
	}

}
