package com.imooc2;
//���ڷ����ڲ���
public class Demo04 {

	public class inner{
		
		public void show()
		{
			System.out.println("���ڷ����ڲ��࣡");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo04 hello =new Demo04();		
		inner inr=hello.new inner();
		inr.show();

	}

}
