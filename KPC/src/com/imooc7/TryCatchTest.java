package com.imooc7;

public class TryCatchTest {
	public static void main(String[] args) {
		TryCatchTest tct=new TryCatchTest();
		int result=tct.test();
		System.out.println("Result:"+result);
		
		int result2=tct.test2();
		System.out.println("Result2:"+result2);
		
		
		int result3=tct.test3();
		System.out.println("result3:"+result3);
	}
	/*
	 * 
	 * 
	 * */
	public int test()
	{
		int divider=10;
		int result=100;
		
		try {
			while(divider>-1)
			{
				divider--;
				result=result+100/divider;						
			}
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣");
			return -1;
		}
	}
	
	
	public int test2()
	{
		int divider=10;
		int result=100;
		
		try {
			while(divider>-1)
			{
				divider--;
				result=result+100/divider;						
			}
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣");
			return result=999;
		}
		finally
		{
			System.out.println("����finally");
			System.out.println("����Result��"+result);
		}
	}
	
	
	public int test3()
	{
		int divider=10;
		int result=100;
		
		try {
			while(divider>-1)
			{
				divider--;
				result=result+100/divider;						
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("ѭ���׳��쳣");			
		}
		finally
		{
			System.out.println("����finally");
			System.out.println("����Result��"+result);
		}
		System.out.println("����test3");
		
		return 11111;
	}
}


