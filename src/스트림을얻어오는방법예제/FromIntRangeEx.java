package ��Ʈ���������¹������;

import java.util.stream.IntStream;

public class FromIntRangeEx {
	public static int sum; // Ŭ���� ����, 0���� �ڵ� �ʱ�ȭ

	public static void main(String[] args) {
		// ���ڹ����κ��� ��Ʈ�� ���
		IntStream intStream = IntStream.rangeClosed(1, 100); // 1 ~ 100���� ����

		intStream.forEach(num -> sum += num);
		System.out.println("�հ�: " + sum);
	}
}
