package com.imooc2;

public class Demo02 {

	
	 // ���徲̬����score1
    static int score1 = 86;
    // ���徲̬����score2
    static int score2 = 92; 

    // ���徲̬����sum������ɼ��ܷ֣��������ܷ�
	public  static  int sum() { 
      
      return score2+score1;
      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���þ�̬����sum�����շ���ֵ
				int allScore =sum(); 
		        
				System.out.println("�ܷ֣�" + allScore);
	}

}
