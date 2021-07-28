package sec05.exam02_consumer;

@FunctionalInterface
public interface MyConsumer<T, U> {
	void accept(T t, U u);
}