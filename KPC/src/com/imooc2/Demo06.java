package com.imooc2;

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	
		 * ��̬�ڲ����� static ���ε��ڲ��࣬�����ڲ�����ص��ǣ�

		1�� ��̬�ڲ��಻��ֱ�ӷ����ⲿ��ķǾ�̬��Ա��������ͨ�� new �ⲿ��().��Ա �ķ�ʽ���� 

		2�� ����ⲿ��ľ�̬��Ա���ڲ���ĳ�Ա������ͬ����ͨ��������.��̬��Ա�������ⲿ��ľ�̬��Ա��
		����ⲿ��ľ�̬��Ա���ڲ���ĳ�Ա���Ʋ���ͬ�����ͨ������Ա����ֱ�ӵ����ⲿ��ľ�̬��Ա

		3�� ������̬�ڲ���Ķ���ʱ������Ҫ�ⲿ��Ķ��󣬿���ֱ�Ӵ��� �ڲ��� ������= new �ڲ���();	
		
		*/
		
		
		// ֱ�Ӵ����ڲ���Ķ���
		
        SInner si=new SInner();
        
        // ����show����
		si.show();
	}
	 // �ⲿ���еľ�̬����score
    private static int score = 84;
    
    // ������̬�ڲ���
	public static class SInner {
        // �ڲ����еı���score
        int score = 91;
        
		public void show() {
			System.out.println("�����ⲿ���е�score��" + Demo06.score);
			System.out.println("�����ڲ����е�score��" + score);
		}
	}
	

}
