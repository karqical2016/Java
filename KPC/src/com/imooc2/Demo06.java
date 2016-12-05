package com.imooc2;

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	
		 * 静态内部类是 static 修饰的内部类，这种内部类的特点是：

		1、 静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问 

		2、 如果外部类的静态成员与内部类的成员名称相同，可通过“类名.静态成员”访问外部类的静态成员；
		如果外部类的静态成员与内部类的成员名称不相同，则可通过“成员名”直接调用外部类的静态成员

		3、 创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名= new 内部类();	
		
		*/
		
		
		// 直接创建内部类的对象
		
        SInner si=new SInner();
        
        // 调用show方法
		si.show();
	}
	 // 外部类中的静态变量score
    private static int score = 84;
    
    // 创建静态内部类
	public static class SInner {
        // 内部类中的变量score
        int score = 91;
        
		public void show() {
			System.out.println("访问外部类中的score：" + Demo06.score);
			System.out.println("访问内部类中的score：" + score);
		}
	}
	

}
