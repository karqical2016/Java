package com.imooc3;

public class Dog extends Animal{
	public int age =20;
	public void eat(){		
		System.out.println("���䣺"+age+" �����гԶ���������");
	}
	public Dog(){
		//super(); 
		
		System.out.println("Dog��ִ����");
	}
	public void  method() {
		eat();
	}
}
