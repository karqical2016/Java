package com.imooc2;

public class Telphone {

	//����
	private	float screen;
	private	float cpu;
	private	float mem;
	
	//������Խ��з�װ
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
	
	//���캯��
	public Telphone()
	{
		System.out.println("�޲����Ĺ��췽��ִ���ˣ�");
	}
	
	
	
	int var;
	
	//����
	void call(){
		int localVar=0;
		System.out.println("localVar:"+localVar);
		System.out.println("var:"+var);
		System.out.println("Telphone�д�绰�Ĺ���");
	}
	void sendMessage(){	
		System.out.println("var:"+var);
		System.out.println("screen:"+getScreen()+"cpu:"+getCpu()+"mem:"+getMem()+"Telphone�з����ŵĹ���");
	}
	
}
