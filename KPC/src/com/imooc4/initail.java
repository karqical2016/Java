package com.imooc4;

public class initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 =new Animal();
		Animal obj2 =new Dog();
		//Dog obj3=new Animal(); 错误的
		
		obj1.eat();//调用父类的方法
		obj2.eat();//调用子类的方法
		
		
		Animal obj4=new Cat();
		obj4.eat();//调用子类继承父类的方法
		
		Dog obj3 =new Dog();
		obj3.watchDoor();//父类引用不能调用仅子类具有的方法
		
		
		
		Animal animal =obj3; //自动类型转换
		if(animal instanceof Dog){//如果animal类型含有Dog类型，此处animal类型为dog
		Dog dog=(Dog)animal;//向下类型转换，强制类型转换
		}else
		{
			System.out.println("无法进行类型转化1");
		}
		if(animal instanceof Cat){  //	如果animal类型含有Cat类型，此处animal类型为dog
		Cat cat=(Cat)animal;//1.编译时是Cat类型，2 但是运行时，却是Dog类型，那么是不能进行转化的
		}else{
			System.out.println("无法进行类型转化2");
		}
		
	}

}
