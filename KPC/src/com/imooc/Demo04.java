package com.imooc;

public class Demo04 {

	public static void main(String[] args) {

		// �����������еĶ�ά���鲢��ֵ
		String[][] names = { { "tom", "jack", "mike" }, { "zhangsan", "lisi", "wangwu" } };

		// ͨ������ѭ�������ά������Ԫ�ص�ֵ
		for (int i = 0; i < names.length; i++) {

			for (int j = 0; j < names[i].length; j++) {

				System.out.println(names[i][j]);
			}

			System.out.println();
		}
	}
}