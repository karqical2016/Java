package com.imooc5;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone tel1=new CellPhone();
		tel1.call();
		tel1.mesage();
		
		Telphone tel2=new SmartPhone();
		tel2.call();
		tel2.mesage();
		
		IPlayGame ip1=new SmartPhone();
		ip1.playGame();
		IPlayGame ip2 =new PSP();
		ip2.playGame();
		
		IPlayGame ip3=new IPlayGame(){
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ���ķ�ʽʵ�ֽӿ�");
			}
		};
		
		ip3.playGame();
		
		new IPlayGame(){
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ���ķ�ʽʵ�ֽӿ�2");
			}
		}.playGame();
		
		
		
		
	}

}
