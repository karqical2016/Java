/*
 * 

 *小伙伴们，请根据所学知识，参考注释，在代码编辑器中将代码补充完整。编写一个JAVA程序，创建指定长度的 int 型数组，并生成 100 以内随机数为数组中的每个元素赋值，然后输出数组

 *要求：

 *1、 要求通过定义带参带返回值的方法来实现

 *2、 通过参数传入数组的长度（例如长度为 8），方法执行后返回赋值后的数组

 *3、 通过 (int)(Math.random() * 100) 生成 100 以内的随机数

 *注：Math 类是用于进行算术操作的类，Math.random() 生成 0--1 的浮点数。 关于该类的其他应用在后面章节会有详细介绍，先熟悉随机数方法的使用~~

 *运行效果为： [ 2 , 52 , 8 , 26 , 66 , 32 , 98 , 0 ]

 *注：由于数组元素的值是随机生成的，每次运行生成的值可能都不同，此效果仅供参考

 * 
 * 
 * */

package com.imooc;

import java.util.Arrays;

public class Demo14 {
	public static void main(String[] args) {
		   // 创建对象，对象名为hello
		Demo14 hello = new Demo14();
        
        // 调用方法并将返回值保存在变量中
		int[] nums = hello.getArray(8);
        
        // 将数组转换为字符串并输出
		System.out.println(Arrays.toString(nums)); 
	}
	
	/*
	 * 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值
	 * 定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组
	 */
	public int[] getArray(int length) {
        // 定义指定长度的整型数组
		int[] nums = new int[length];
        
        // 循环遍历数组赋值
		for (int i = 0; i < nums.length; i++) {
			nums[i]=(int)(Math.random()*100);
		}
		return nums; // 返回赋值后的数组
	}
}
