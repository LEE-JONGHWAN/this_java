package sec07.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() { /*실행문*/ }
	
	public void method3();
}

