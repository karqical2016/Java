package com.imooc;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建对象，对象名为hello
		Demo11 hello = new Demo11();
		
        // 调用方法，传入两门课程的成绩
		hello.calcAvg(94, 81);
	}
	/*
	 * 功能：计算两门课程考试成绩的平均分并输出平均分
	 * 定义一个包含两个参数的方法，用来传入两门课程的成绩
	 */
	
	public void calcAvg(double a,double b)
	{
		double avg=(a+b)/2;
		System.out.print("两门课程考试成绩的平均分:"+avg);
	}
	
}
