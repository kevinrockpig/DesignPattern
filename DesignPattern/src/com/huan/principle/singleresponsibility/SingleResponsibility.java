package com.huan.principle.singleresponsibility;

public class SingleResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.run("����");
		vehicle.run("�T��");
		vehicle.run("����");

	}

}

// ��q�u����
// ���1���R
// 1.�b�覡�@ ��run��k���A�H�ϳ�@¾�d��h
// 2.�ѨM��סA�ھڤ��P��q�u��B���k���P�A���Ѧ����P���Y�i
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " �b�����W��p~~");
	}
}