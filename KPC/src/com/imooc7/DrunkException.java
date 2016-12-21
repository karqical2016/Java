package com.imooc7;

public class DrunkException extends Exception{
	/**
	 * 
	 */
	

	public DrunkException(){
		super();
	}
	
	public DrunkException(Throwable throwable){
        super(throwable);
    }
	
	public DrunkException(String message){
		super(message);		
	}
}
