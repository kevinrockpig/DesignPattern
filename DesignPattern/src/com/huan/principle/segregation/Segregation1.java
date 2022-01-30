package com.huan.principle.segregation;

public class Segregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Interface1{
	
	void operation1();
	void operation2();
	void operation3();
	void operation4();
	void operation5();
}

class B implements Interface1{

	@Override
	public void operation1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
	}
	@Override
	public void operation3() {
		// TODO Auto-generated method stub
	}

	@Override
	public void operation4() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void operation5() {
		// TODO Auto-generated method stub
	}
	
}

class A { //A 類通過接口interface1 依賴(使用) B類,但是只會用到1,2,3方法	
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend2(Interface1 i) {
		i.operation2();
	}
	public void depend3(Interface1 i) {
		i.operation3();
	}
}

class C { //C 類通過接口interface1 依賴(使用) B類,但是只會用到1,4,5方法	
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend4(Interface1 i) {
		i.operation4();
	}
	public void depend5(Interface1 i) {
		i.operation5();
	}
}
