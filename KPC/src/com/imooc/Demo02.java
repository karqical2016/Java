/**
 * 
 */
package com.imooc;
import java.util.Scanner;


/**
 * @author SDSC
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		int classNum=3;
		int studNum=4;
		double sum=0;
		double avg=0;
		
		Scanner input =new Scanner(System.in);		
		for (int i = 1; i <=classNum; i++) {
			sum=0;	
			avg=0;
			System.out.println("***请输入第"+i+"个班级的成绩***");
			for(int j=1;j<=studNum;j++){				
				System.out.println("请输入第"+j+"个学员的成绩:");				
				int score =input.nextInt();
				sum=sum+score;	
			}
			avg=sum/studNum;					
			System.out.println("第"+i+"个班级学生的平均成绩："+avg);
		}
		input.close();
		
	}
}
