package com.imooc2;

public class Demo03 {

	String name; // ��������name
	String sex; // ��������sex
	static int age;// ������̬����age
    
    // ���췽��
	public  Demo03 () { 
		System.out.println("ͨ�����췽����ʼ��name");
		name = "tom";
	}
    
    // ��ʼ����
	{ 
		System.out.println("ͨ����ʼ�����ʼ��sex");
		sex = "��";
	}

    // ��̬��ʼ����
	static{ 
		System.out.println("ͨ����̬��ʼ�����ʼ��age");
		age = 20;
	}
    
	public void show() {
		System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age);
	}
    
	public static void main(String[] args) {
        
        // ��������
		Demo03 hello = new Demo03();
		// ���ö����show����
        hello.show();
        
	}

}
