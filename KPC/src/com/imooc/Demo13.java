package com.imooc;

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������
		Demo13 hello = new Demo13();

		// �����޲εķ���
		hello.print();

		// ���ô���һ���ַ��������ķ���
	
		hello.print("gg");
		// ���ô���һ�����Ͳ����ķ���
		hello.print(5);
	}
	
	public void print() {
		System.out.println("�޲ε�print����");
	}

	public void print(String name) {
		System.out.println("����һ���ַ���������print����������ֵΪ��" + name);
	}

	public void print(int age) {
		System.out.println("����һ�����Ͳ�����print����������ֵΪ��" + age);
	}

}
