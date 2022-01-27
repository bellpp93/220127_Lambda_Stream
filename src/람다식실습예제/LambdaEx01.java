package 람다식실습예제;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * 이번 예제는 람다식과 스트림이 포함된 예제
 * 
 * 외부 반복자 : 개발자 코드로 직접 컬렉션의 요소를 반복해서 가져오는 코드패턴. ex) for문, while문
 * 내부 반복자 : 컬렉션 내부에서 요소들은 반복 시키고, 개발자는 요소당 처리해야 할 코드만 제공하는 코드 패턴
 */

public class LambdaEx01 {
	public static void main(String[] args) {
		/*
		// (1) 기존 방식으로 문제 해결
		List<Integer> list = (List)Arrays.asList(10,20,30,40,50);  // 정수를 객체화시켜서 정수가 아닌 '객체'임
		
		// Iterator는 외부 반복자이다.
		Iterator<Integer> iterator = list.iterator();
		
		while (iterator.hasNext()) {  // 객체가 있느냐? 있으면 true 없으면 false로 조건문 빠져나옴.(반환타입 boolean)
			Integer value = iterator.next();
			System.out.println(value);
		}
		*/
		// (2) 람다식과 스트림을 적용하여 문제 해결(기존 방식보다 빅테이터 처리가 100배 이상 빠르다)
		List<Integer> list = (List)Arrays.asList(10,20,30,40,50);
		
		//Stream 내부 반복자 적용
		// 스트림의 장점 : 코드의 간결성, 병렬 처리가 컬렉션 내부에서 처리되므로 일석이조의 효과
		Stream<Integer> stream = list.stream();
		stream.forEach(value -> System.out.println(value));  // (x -> y) (매개값 -> 소비)
		/*
		 * forEach(Consumer 람다식 표현) 메소드
		 * Consumer 소비자 => 매개값은 있고, 리턴값은 없다. value는 매개값 -> 소비
		 */
	}
}
