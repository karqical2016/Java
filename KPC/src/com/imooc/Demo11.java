package com.imooc;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������󣬶�����Ϊhello
		Demo11 hello = new Demo11();
		
        // ���÷������������ſγ̵ĳɼ�
		hello.calcAvg(94, 81);
	}
	/*
	 * ���ܣ��������ſγ̿��Գɼ���ƽ���ֲ����ƽ����
	 * ����һ���������������ķ����������������ſγ̵ĳɼ�
	 */
	
	public void calcAvg(double a,double b)
	{
		double avg=(a+b)/2;
		System.out.print("���ſγ̿��Գɼ���ƽ����:"+avg);
	}
	
}
