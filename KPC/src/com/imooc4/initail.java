package com.imooc4;

public class initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 =new Animal();
		Animal obj2 =new Dog();
		//Dog obj3=new Animal(); �����
		
		obj1.eat();//���ø���ķ���
		obj2.eat();//��������ķ���
		
		
		Animal obj4=new Cat();
		obj4.eat();//��������̳и���ķ���
		
		Dog obj3 =new Dog();
		obj3.watchDoor();//�������ò��ܵ��ý�������еķ���
		
		
		
		Animal animal =obj3; //�Զ�����ת��
		if(animal instanceof Dog){//���animal���ͺ���Dog���ͣ��˴�animal����Ϊdog
		Dog dog=(Dog)animal;//��������ת����ǿ������ת��
		}else
		{
			System.out.println("�޷���������ת��1");
		}
		if(animal instanceof Cat){  //	���animal���ͺ���Cat���ͣ��˴�animal����Ϊdog
		Cat cat=(Cat)animal;//1.����ʱ��Cat���ͣ�2 ��������ʱ��ȴ��Dog���ͣ���ô�ǲ��ܽ���ת����
		}else{
			System.out.println("�޷���������ת��2");
		}
		
	}

}
