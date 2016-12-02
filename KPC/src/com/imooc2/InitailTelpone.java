package com.imooc2;

public class InitailTelpone {
	public static void main(String[] args) {
		Telphone phone=new Telphone();
		phone.sendMessage();
		
		phone.cpu=1.5f;
		phone.mem=2.0f;
		phone.screen=5.0f;
		
		phone.sendMessage();
		phone.call();
	}
}
