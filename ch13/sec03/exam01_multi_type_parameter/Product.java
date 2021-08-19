package sec03.exam01_multi_type_parameter;

public class Product<T, V> {
	private T kind;
	private V model;
	
	public T getKind() { return this.kind; }
	public V getModel() { return this.model; }
	
	public void setKind(T kind) { this.kind = kind; }
	public void setModel(V model) { this.model = model; }
}

