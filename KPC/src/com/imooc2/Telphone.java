package com.imooc2;

public class Telphone {

	//属性
	private	float screen;
	private	float cpu;
	private	float mem;
	
	//针对属性进行封装
	public float getScreen(){
		return screen;	
	}	
	public void setScreen(float theScreen){
		screen=theScreen;
	}
	
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float thecpu) {
		this.cpu = thecpu;
	}
	
	public float getMem() {
		return mem;
	}
	
	public void setMem(float themem) {
		this.mem = themem;
	}
	
	//构造函数
	public Telphone()
	{
		System.out.println("无参数的构造方法执行了！");
	}
	
	
	
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
		System.out.println("screen:"+getScreen()+"cpu:"+getCpu()+"mem:"+getMem()+"Telphone有发短信的功能");
	}
	
}
