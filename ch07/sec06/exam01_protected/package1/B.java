package sec06.exam01_protected.package1;

import sec06.exam01_protected.package1.A;
class C{ A a = new A(); }
public class B extends A{
	public B() {super();}
	@Override
	public void method() {
		B a = new B();
		a.field = "value";
		a.method();
	}
}
