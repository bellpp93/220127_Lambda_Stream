package ���ٽĽǽ�����;

import java.util.function.Consumer;

public class ConsumerEx {
	
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.print(t + "8");  // Java8 ���
		consumer.accept("Java");
	}
}
