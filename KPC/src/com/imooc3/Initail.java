package com.imooc3;

public class Initail {
	public static void main(String[] args) {
//		Animal animal=new Animal();
//		System.out.println("Animal age:"+animal.age);
//		
		
		Dog dog=new Dog();
		dog.age=15;
		
		Dog dog2=new Dog();
		dog2.age=15;
		
		if(dog.equals(dog2)){
			
			System.out.println("����������ͬ��");
		}else
		{
			System.out.println("����������ͬ");
			
		}
//		dog.age=10;
//		dog.name="xiao";
//		dog.eat();
		
		//dog.method();
	}	
}
