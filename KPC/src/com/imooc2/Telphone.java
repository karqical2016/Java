package com.imooc2;

public class Telphone {

	//属性
	float screen;
	float cpu;
	float mem;
	int var;
	
	//方法
	void call(){
		int localVar=0;
		System.out.println("localVar:"+localVar);
		System.out.println("var:"+var);
		System.out.println("Telphone有打电话的功能");
	}
	void sendMessage(){	
		System.out.println("var:"+var);
		System.out.println("screen:"+screen+"cpu:"+cpu+"mem:"+mem+"Telphone有发短信的功能");
	}
}
