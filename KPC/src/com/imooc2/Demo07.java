package com.imooc2;

public class Demo07 {

	 private String name = "��Ľ��";
	    
	    // �ⲿ���е�show����
	    public void show() { 
			// ���巽���ڲ���
			class MInner {
				int score = 83;
				public int getScore() {
					return score + 10;
				}
			}
	        
			// ���������ڲ���Ķ���
			MInner in=new MInner();		
	        
	        // �����ڲ���ķ���
			int newScore=in.getScore();			
	        
			System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + newScore);
		}
	    
		// ���Է����ڲ���
		public static void main(String[] args) {
	        
			// �����ⲿ��Ķ���
	        Demo07 mo=new Demo07();
	        
	        // �����ⲿ��ķ���
			mo.show();
		}

}
