package ��Ʈ���������¹������;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {

	public static void main(String[] args) {
		//String[] �迭 ��ü ����
		String[] strArray = {"�ΰ�����","�ӽŷ���","������","��ȭ�н�"};
		
		/*
		 * �迭�κ��� ��Ʈ�� ���	=> Arrays.stream(String[ ] ��������);
		 */
		Stream<String> strStream = Arrays.stream(strArray);  // ���ڿ� ó���Ҷ��� Stream
		strStream.forEach(str -> System.out.print(str + " "));
		
		System.out.println();
		
		int[] intArray = {100,200,300,400,500};
		IntStream intStream = Arrays.stream(intArray);  // ������ ó���Ҷ��� IntStream
		intStream.forEach(number -> System.out.print(number + " "));
	}
}
