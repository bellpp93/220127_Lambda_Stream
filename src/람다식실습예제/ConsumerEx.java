package 람다식실습예제;

import java.util.function.Consumer;

public class ConsumerEx {
	
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.print(t + "8");  // Java8 출력
		consumer.accept("Java");
		// Consumer 소비자 => 매개값은 있고, 리턴값은 없다.
	}
}
