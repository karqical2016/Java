package com.imooc5;

public class SmartPhone extends Telphone implements IPlayGame {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("ͨ��������绰");
	}

	@Override
	public void mesage() {
		// TODO Auto-generated method stub
		System.out.println("ͨ������������");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone��������Ϸ�Ĺ���");
	}

}
