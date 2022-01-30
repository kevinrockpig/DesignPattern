package com.huan.principle.singleresponsibility;

public class SingleResponsibility3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Vehicle2 {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上行駛~~");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle + " 在天空中運行~~");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle + " 在水中運行~~");
	}
}
