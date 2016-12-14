package com.imooc5;

public class SmartPhone extends Telphone implements IPlayGame {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过语音打电话");
	}

	@Override
	public void mesage() {
		// TODO Auto-generated method stub
		System.out.println("通过语音发短信");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone具有玩游戏的功能");
	}

}
