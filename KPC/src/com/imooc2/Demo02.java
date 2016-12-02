package com.imooc2;

public class Demo02 {

	
	 // 定义静态变量score1
    static int score1 = 86;
    // 定义静态变量score2
    static int score2 = 92; 

    // 定义静态方法sum，计算成绩总分，并返回总分
	public  static  int sum() { 
      
      return score2+score1;
      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 调用静态方法sum并接收返回值
				int allScore =sum(); 
		        
				System.out.println("总分：" + allScore);
	}

}
