package com.imooc2;

public class Demo05 {

	 //�ⲿ���˽������name
    private String name = "imooc";
    
    //�ⲿ��ĳ�Ա����
    int age = 20;
    
	//��Ա�ڲ���Inner
	public class Inner {
		String name = "��Ľ��";
        //�ڲ����еķ���
		public void show() { 
			System.out.println("�ⲿ���е�name��" + Demo05.this.name );
			System.out.println("�ڲ����е�name��" +	name);
			System.out.println("�ⲿ���е�age��" + age);
		}
	}
    
	//���Գ�Ա�ڲ���
	public static void main(String[] args) {
        
        //�����ⲿ��Ķ���
		Demo05 o = new Demo05 (); 
        
        //�����ڲ���Ķ���
		Inner inn = o.new Inner();
        
        //�����ڲ�������show����
		inn.show();
	}

}
