package com.imooc6;

import java.util.Scanner;

public class Initail {
	public static void main(String[] args) {

		// TODO Auto-generated method stub 
		
		int xxxx=0;
		System.out.println("��ӭʹ�ô���⳵ϵͳ!");
		System.out.println("���Ƿ���Ҫ�⳵��1�� 0��");
		Scanner input1 = new Scanner(System.in);
		int is = input1.nextInt();
		//input1.close();
		// ����һ��Car��������������ֳ����������ö�̬��������ͬ���������
		Car[] cars = { 
					new PassagerCar("�µ�A4", 5, 500.0)
					, new Truck("С����", 5.0, 150.0)
					, new PassagerCar("����E400", 5, 700)
					, new Pickup("Ƥ��", 1.5, 4, 200)
					, new Truck("���ͻ���", 10, 600)
					, new PassagerCar("��ͳ�", 25, 650)
				};
		// ����1����Ҫ�⳵
		if (is == 1) {
			int totalMoney = 0;
			double totalcargoCapacity = 0;
			int totalbusLoad = 0;
			int rentCarDays = 0;
			System.out.println("�����⳵�����ͼ����Ŀ��");
			System.out.println("���\t" + "��������\t" + "�����\t" + "����\t");
			int num = 1;// �����ʼ���			
			// �����г�����һ��ѭ����������foreach(),������һ������һ����
			for (Car currentCar : cars) {
				
				
				if (currentCar instanceof PassagerCar)// �ж����ڱ�����car�Ƿ���Passenger���һ��ʵ��
				{
					System.out.println("No." + num + '\t' + currentCar.getName() + '\t' + currentCar.getDailyRent()
							+ "Ԫ/��\t" + "���ˣ�" + currentCar.getPassagerCapacity() + "��");
					num++;
				}
				if (currentCar instanceof Truck)// �ж����ڱ�����car�Ƿ���Truck���һ��ʵ��
				{ 
					System.out.println("No." + num + '\t' + currentCar.getName() + '\t' + currentCar.getDailyRent()
							+ "Ԫ/��\t"+'\t' + "�ػ���" + currentCar.getCargoCapacity() + "��");
					num++;
				}
				if (currentCar instanceof Pickup) // �ж����ڱ�����car�Ƿ���Pickup���һ��ʵ��
				{
					System.out.println("No." + num + '\t' + currentCar.getName() + '\t' + currentCar.getDailyRent()
							+ "Ԫ/��" +'\t'+ '\t' +"���ˣ�" + currentCar.getPassagerCapacity() + "��" + ",�ػ���"
							+ currentCar.getCargoCapacity() + "��");
					num++;
				}
			}
			int totalDailyMoney = 0;
			// ÿ�������ܺ�
			System.out.println("�����������⳵����(����⳵��Ϊ6)��");
			Scanner input2 = new Scanner(System.in);
			int carRentAmount = input2.nextInt();
			//input2.close();
			// ���ȥ�ĳ���
			if (carRentAmount > 0 && carRentAmount <= 6) {
				int[] rentCarsArray = new int[carRentAmount];

				// ����һ�����飬�����������ȥ�ĳ���,����Ϊ���ȥ�ĳ���
				for (int i = 1; i <= carRentAmount; i++) {
					System.out.println("�������" + i + "��������ţ�");
					Scanner input3 = new Scanner(System.in);
					int carNum = input3.nextInt();
					// ���복�����
					rentCarsArray[i - 1] = carNum - 1;
					// ����ÿһ�����ȥ�ĳ���cars�����е����
					totalDailyMoney += cars[carNum - 1].getDailyRent();
					totalcargoCapacity += cars[carNum - 1].getCargoCapacity();
					totalbusLoad += cars[carNum - 1].getPassagerCapacity();
					//input3.close();
				}
				System.out.println("��������Ҫ�⳵��������");
				Scanner input4 = new Scanner(System.in);
				rentCarDays = input4.nextInt();
				//input4.close();
				totalMoney = totalDailyMoney * rentCarDays;
				System.out.println("�����˵���\n***�����˵ĳ��У�");
				System.out.println("���ػ�����" + totalcargoCapacity + "\t���ؿ�����" + totalbusLoad + "\t�ܼ۸�" + totalMoney);
				
				// �����˵�
				for (int i = 0; i < rentCarsArray.length; i++) {
					if ((cars[rentCarsArray[i]] instanceof PassagerCar) || (cars[rentCarsArray[i]]) instanceof Pickup) {
						System.out.println(cars[rentCarsArray[i]].getName());
					}
				}
				System.out.println("�����������������ˣ�" + totalbusLoad + "��");
				// �ػ��˵�
				System.out.println("***���ػ��ĳ��У�");
				for (int i = 0; i < rentCarsArray.length; i++) {
					if ((cars[rentCarsArray[i]] instanceof Truck) || (cars[rentCarsArray[i]]) instanceof Pickup) {
						System.out.println(cars[rentCarsArray[i]].getName());
					}
				}
				System.out.println("���������������ػ���" + totalcargoCapacity + "��");
			} else {
				System.out.println("���޸��⳵������");
			}
		} else {
			System.out.println("��л�����ʴ���⳵ϵͳ");
		}

	}
}