package com.imooc2;
//正在访问内部类
public class Demo04 {

	public class inner{
		
		public void show()
		{
			System.out.println("正在访问内部类！");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo04 hello =new Demo04();		
		inner inr=hello.new inner();
		inr.show();

	}

}
