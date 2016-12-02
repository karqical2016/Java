package com.imooc;

public class Demo08 {
	public static void main(String[] args) {
		String[] hobbys = { "sports", "game", "movie" };
		System.out.println("循环输出数组中元素的值：");
		
		// 使用循环遍历数组中的元素
		
		for (int i = 0; i < hobbys.length; i++) {
			System.out.println(hobbys[i]);
		}
	}
}
