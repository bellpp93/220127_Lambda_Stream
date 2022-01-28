package ��Ʈ������_ȸ�����߳���ȸ������ճ��̱��ϱ�;

import java.util.Arrays;
import java.util.List;

public class MemberTest {

	public static void main(String[] args) {
		List<Member> list = (List)Arrays.asList(new Member("�����", Member.MALE, 30),
												new Member("�̰���", Member.MALE, 26),
												new Member("�迬��", Member.FEMALE, 32),
												new Member("������", Member.FEMALE, 28),
												new Member("����ȫ", Member.MALE, 35));
		
		double ageAvg = list.stream()  // �������� ��Ʈ��
							.filter(m -> m.getGender() == Member.MALE)  // filter()�� Predicate ����
							.mapToInt(Member::getAge)  // �߰�ó��
							.average()  // ����ó��
							.getAsDouble();  //��� �� �ҷ�����
		
		System.out.format("���� ȸ���� ��� ����: " + "%.2f", ageAvg);  // "%.2f", => �Ҽ��� ���� ���ڸ��� ����ϰڴ�.
	}
}
