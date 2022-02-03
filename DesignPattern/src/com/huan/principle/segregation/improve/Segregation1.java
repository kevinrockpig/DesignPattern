package com.huan.principle.segregation.improve;

public class Segregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用
		A a = new A();
		a.depend1(new B());	//	A類通過接口去依賴B類
		a.depend2(new B());
		a.depend3(new B());
		
		C c = new C();
		c.depend1(new D());	//	C類通過接口去依賴(使用)D類
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
		System.out.println("B 實現了operation1");
	}
	@Override
	public void operation2() {
		System.out.println("B 實現了operation2");
	}
	@Override
	public void operation3() {
		System.out.println("B 實現了operation3");	
	}
}

class D implements Interface1, Interface3{
	
	@Override
	public void operation1() {
		System.out.println("D 實現了operation1");
	}
	@Override
	public void operation4() {
		System.out.println("D 實現了operation4");
	}
	@Override
	public void operation5() {
		System.out.println("D 實現了operation5");	
	}
}

class A { //A 類通過接口Interface1, Interface2 依賴(使用) B類,但是只會用到1,2,3方法	
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

class C { //C 類通過接口interface1, Interface3 依賴(使用) B類,但是只會用到1,4,5方法	
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
