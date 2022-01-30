package com.huan.principle.singleresponsibility;

public class SingleResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.run("機車");
		vehicle.run("汽車");
		vehicle.run("飛機");

	}

}

// 交通工具類
// 方案1分析
// 1.在方式一 的run方法中，違反單一職責原則
// 2.解決方案，根據不同交通工具運行方法不同，分解成不同類即可
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上行駛~~");
	}
}