package com.imooc8;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "imooc";
		String s2 = "imooc";
        String s3 = "I love"+s1;
        //�����ַ���s3�����桰I love����s1ƴ�Ӻ������
		 
		
        // �Ƚ��ַ���s1��s2
		// imoocΪ�����ַ�������γ���ʱ�ᱻ�������Ż���ֻ����һ������
		System.out.println("s1��s2�ڴ��ַ��ͬ��" + (s1 == s2));
        
        //�Ƚ��ַ���s1��s3
		System.out.println("s1��s3�ڴ��ַ��ͬ��" +  (s1==s3));

		String s4 = "I love " + s1;
         //�Ƚ��ַ���s4��s3
		// s1�Ǳ�����s4������ʱ��֪������ֵ������s3��s4�ǲ�ͬ�Ķ���
		System.out.println("s3��s4�ڴ��ַ��ͬ��" + (s4 == s3));
		
	}

}
