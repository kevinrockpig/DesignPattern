package com.huan.principle.segregation.improve;

public class Segregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ϥ�
		A a = new A();
		a.depend1(new B());	//	A���q�L���f�h�̿�B��
		a.depend2(new B());
		a.depend3(new B());
		
		C c = new C();
		c.depend1(new D());	//	C���q�L���f�h�̿�(�ϥ�)D��
		c.depend4(new D());
		c.depend5(new D());
		
		
	}

}

interface Interface1{
	void operation1();
}


interface Interface2{
	void operation2();
	void operation3();	
}

interface Interface3{
	void operation4();
	void operation5();	
}


class B implements Interface1, Interface2{								
	@Override
	public void operation1() {
		System.out.println("B ��{�Foperation1");
	}
	@Override
	public void operation2() {
		System.out.println("B ��{�Foperation2");
	}
	@Override
	public void operation3() {
		System.out.println("B ��{�Foperation3");	
	}
}

class D implements Interface1, Interface3{
	
	@Override
	public void operation1() {
		System.out.println("D ��{�Foperation1");
	}
	@Override
	public void operation4() {
		System.out.println("D ��{�Foperation4");
	}
	@Override
	public void operation5() {
		System.out.println("D ��{�Foperation5");	
	}
}

class A { //A ���q�L���fInterface1, Interface2 �̿�(�ϥ�) B��,���O�u�|�Ψ�1,2,3��k	
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend2(Interface2 i) {
		i.operation2();
	}
	public void depend3(Interface2 i) {
		i.operation3();
	}
}

class C { //C ���q�L���finterface1, Interface3 �̿�(�ϥ�) B��,���O�u�|�Ψ�1,4,5��k	
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend4(Interface3 i) {
		i.operation4();
	}
	public void depend5(Interface3 i) {
		i.operation5();
	}
}
