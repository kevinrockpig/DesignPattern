package com.huan.principle.singleresponsibility;

public class SingleResponsibility2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("����");
		roadVehicle.run("�T��");
		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("����");
	}

}


// ���2���R
// 1.��u��@¾�d��h
// 2.���O�o�˰�����ʫܤj�A�Y�N�����ѡA�P�ɭק�Ȥ��
// 3.��i: �����ק�vehicle���A��ʪ��N�X�|�����=>���3
class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " �����B�� ");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " �ѪŹB��");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "�����B��");
	}
}
