package com.imooc6;

import java.util.Scanner;

public class Initail {
	public static void main(String[] args) {

		// TODO Auto-generated method stub 
		
		int xxxx=0;
		System.out.println("欢迎使用答答租车系统!");
		System.out.println("您是否需要租车：1是 0否");
		Scanner input1 = new Scanner(System.in);
		int is = input1.nextInt();
		//input1.close();
		// 创建一个Car类数组来保存各种车，利用引用多态来创建不同的子类对象
		Car[] cars = { 
					new PassagerCar("奥迪A4", 5, 500.0)
					, new Truck("小货车", 5.0, 150.0)
					, new PassagerCar("奔驰E400", 5, 700)
					, new Pickup("皮卡", 1.5, 4, 200)
					, new Truck("大型货车", 10, 600)
					, new PassagerCar("大客车", 25, 650)
				};
		// 输入1，需要租车
		if (is == 1) {
			int totalMoney = 0;
			double totalcargoCapacity = 0;
			int totalbusLoad = 0;
			int rentCarDays = 0;
			System.out.println("您可租车的类型极其价目表：");
			System.out.println("序号\t" + "汽车名称\t" + "日租金\t" + "容量\t");
			int num = 1;// 定义初始序号			
			// 对所有车进行一次循环遍历，即foreach(),来创建一个汽车一览表
			for (Car currentCar : cars) {
				
				
				if (currentCar instanceof PassagerCar)// 判断正在遍历的car是否是Passenger类的一个实例
				{
					System.out.println("No." + num + '\t' + currentCar.getName() + '\t' + currentCar.getDailyRent()
							+ "元/天\t" + "载人：" + currentCar.getPassagerCapacity() + "人");
					num++;
				}
				if (currentCar instanceof Truck)// 判断正在遍历的car是否是Truck类的一个实例
				{ 
					System.out.println("No." + num + '\t' + currentCar.getName() + '\t' + currentCar.getDailyRent()
							+ "元/天\t"+'\t' + "载货：" + currentCar.getCargoCapacity() + "吨");
					num++;
				}
				if (currentCar instanceof Pickup) // 判断正在遍历的car是否是Pickup类的一个实例
				{
					System.out.println("No." + num + '\t' + currentCar.getName() + '\t' + currentCar.getDailyRent()
							+ "元/天" +'\t'+ '\t' +"载人：" + currentCar.getPassagerCapacity() + "人" + ",载货："
							+ currentCar.getCargoCapacity() + "吨");
					num++;
				}
			}
			int totalDailyMoney = 0;
			// 每日租金的总和
			System.out.println("请输入您的租车数量(最大租车数为6)：");
			Scanner input2 = new Scanner(System.in);
			int carRentAmount = input2.nextInt();
			//input2.close();
			// 租出去的车数
			if (carRentAmount > 0 && carRentAmount <= 6) {
				int[] rentCarsArray = new int[carRentAmount];

				// 创建一个数组，用来保存租出去的车辆,长度为租出去的车数
				for (int i = 1; i <= carRentAmount; i++) {
					System.out.println("请输入第" + i + "辆车的序号：");
					Scanner input3 = new Scanner(System.in);
					int carNum = input3.nextInt();
					// 输入车的序号
					rentCarsArray[i - 1] = carNum - 1;
					// 保存每一辆租出去的车在cars数组中的序号
					totalDailyMoney += cars[carNum - 1].getDailyRent();
					totalcargoCapacity += cars[carNum - 1].getCargoCapacity();
					totalbusLoad += cars[carNum - 1].getPassagerCapacity();
					//input3.close();
				}
				System.out.println("请输入需要租车的天数：");
				Scanner input4 = new Scanner(System.in);
				rentCarDays = input4.nextInt();
				//input4.close();
				totalMoney = totalDailyMoney * rentCarDays;
				System.out.println("您的账单：\n***可载人的车有：");
				System.out.println("总载货量：" + totalcargoCapacity + "\t总载客量：" + totalbusLoad + "\t总价格：" + totalMoney);
				
				// 载人账单
				for (int i = 0; i < rentCarsArray.length; i++) {
					if ((cars[rentCarsArray[i]] instanceof PassagerCar) || (cars[rentCarsArray[i]]) instanceof Pickup) {
						System.out.println(cars[rentCarsArray[i]].getName());
					}
				}
				System.out.println("——————共载人：" + totalbusLoad + "人");
				// 载货账单
				System.out.println("***可载货的车有：");
				for (int i = 0; i < rentCarsArray.length; i++) {
					if ((cars[rentCarsArray[i]] instanceof Truck) || (cars[rentCarsArray[i]]) instanceof Pickup) {
						System.out.println(cars[rentCarsArray[i]].getName());
					}
				}
				System.out.println("——————共载货：" + totalcargoCapacity + "吨");
			} else {
				System.out.println("请修改租车数量！");
			}
		} else {
			System.out.println("感谢您访问答答租车系统");
		}

	}
}