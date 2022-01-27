package ���ٽĽǽ�����;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * �̹� ������ ���ٽİ� ��Ʈ���� ���Ե� ����
 * 
 * �ܺ� �ݺ��� : ������ �ڵ�� ���� �÷����� ��Ҹ� �ݺ��ؼ� �������� �ڵ�����. ex) for��, while��
 * ���� �ݺ��� : �÷��� ���ο��� ��ҵ��� �ݺ� ��Ű��, �����ڴ� ��Ҵ� ó���ؾ� �� �ڵ常 �����ϴ� �ڵ� ����
 */

public class LambdaEx01 {
	public static void main(String[] args) {
		/*
		// (1) ���� ������� ���� �ذ�
		List<Integer> list = (List)Arrays.asList(10,20,30,40,50);  // ������ ��üȭ���Ѽ� ������ �ƴ� '��ü'��
		
		// Iterator�� �ܺ� �ݺ����̴�.
		Iterator<Integer> iterator = list.iterator();
		
		while (iterator.hasNext()) {  // ��ü�� �ִ���? ������ true ������ false�� ���ǹ� ��������.(��ȯŸ�� boolean)
			Integer value = iterator.next();
			System.out.println(value);
		}
		*/
		// (2) ���ٽİ� ��Ʈ���� �����Ͽ� ���� �ذ�(���� ��ĺ��� �������� ó���� 100�� �̻� ������)
		List<Integer> list = (List)Arrays.asList(10,20,30,40,50);
		
		//Stream ���� �ݺ��� ����
		// ��Ʈ���� ���� : �ڵ��� ���Ἲ, ���� ó���� �÷��� ���ο��� ó���ǹǷ� �ϼ������� ȿ��
		Stream<Integer> stream = list.stream();
		stream.forEach(value -> System.out.println(value));  // (x -> y) (�Ű��� -> �Һ�)
		/*
		 * forEach(Consumer ���ٽ� ǥ��) �޼ҵ�
		 * Consumer �Һ��� => �Ű����� �ְ�, ���ϰ��� ����. value�� �Ű��� -> �Һ�
		 */
	}
}
