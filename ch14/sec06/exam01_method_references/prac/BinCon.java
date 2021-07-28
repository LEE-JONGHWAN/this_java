package sec06.exam01_method_references.prac;

@FunctionalInterface
public interface BinCon<T> {
	T generate(String str, int num);
}
