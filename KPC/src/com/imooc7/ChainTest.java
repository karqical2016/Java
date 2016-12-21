package com.imooc7;

public class ChainTest {

	class MyException1 extends Exception{
	    
	} 


	class MyException2 extends Exception{
	    MyException2(Throwable throwable){
	        super(throwable);
	    }
	    MyException2(){
	        super();
	    }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest ct = new ChainTest();
	
        try {
        	ct.f();
        } catch (MyException2 e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	
	public void f() throws MyException2{
        try {
            g();
        } catch (MyException1 e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new MyException2(e);
        }
    }
    public void g() throws MyException1{
        throw new MyException1();
    }

	

}
