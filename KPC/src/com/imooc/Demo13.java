package com.imooc;

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建对象
		Demo13 hello = new Demo13();

		// 调用无参的方法
		hello.print();

		// 调用带有一个字符串参数的方法
	
		hello.print("gg");
		// 调用带有一个整型参数的方法
		hello.print(5);
	}
	
	public void print() {
		System.out.println("无参的print方法");
	}

	public void print(String name) {
		System.out.println("带有一个字符串参数的print方法，参数值为：" + name);
	}

	public void print(int age) {
		System.out.println("带有一个整型参数的print方法，参数值为：" + age);
	}

}
