package com.imooc2;

public class InitailTelpone {
	public static void main(String[] args) {
		Telphone phone=new Telphone();
		phone.sendMessage();
		
		phone.setCpu(1.5f);
		phone.setMem(2.0f);
		phone.setScreen(5.0f);
		
		phone.sendMessage();
		phone.call();
	}
}
