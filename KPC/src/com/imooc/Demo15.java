package com.imooc;

import java.util.Arrays;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] = { 89, -23, 64, 91, 119, 52, 73 };
		Demo15 hello=new Demo15();
		hello.oupt(scores);
	}
	// ���巽����ɳɼ��������ǰ�����Ĺ���

	public void oupt(int[] score) {

		Arrays.sort(score);
		int count=0;
		
		for (int i = score.length-1; i >= 0; i--,count++) {
		
			if (score[i] >= 0 && score[i] <= 100&&count<4) {
				System.out.println(score[i]);				
			}
			
		}

	}
}
