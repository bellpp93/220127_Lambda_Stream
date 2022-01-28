package ��Ʈ������_�л�����������ϱ�;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentList = (List)Arrays.asList(new Student("������",90),
														new Student("����ȣ", 100),
														new Student("������", 80),
														new Student("����ö", 70),
														new Student("����ȫ", 80));
		
		// [�߿�] ������ ���� ����
//		double avg = studentList.stream().mapToInt(Student::getScore).average().getAsDouble();
//					 �������� ��Ʈ��			/	�߰�ó�� (���͸� ó��, ���� ó��)	/	����ó�� (���� ó�� �����) => ���
		// ::�� 'Student Ŭ������ ���ԵǾ� �ִ�' �̶�� ��.
		double avg = studentList.stream()  // �������� ��Ʈ��
								.mapToInt(Student::getScore)  // �߰�ó��
								.average()  // ����ó��
								.getAsDouble();  // ��� �ҷ�����
		
		System.out.println("�������: " + avg);
	}
}
