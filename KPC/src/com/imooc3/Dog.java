package com.imooc3;

public class Dog extends Animal{
	//Source  - >  generate equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
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
