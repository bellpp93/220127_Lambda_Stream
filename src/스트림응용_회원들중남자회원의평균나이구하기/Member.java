package ��Ʈ������_ȸ�����߳���ȸ������ճ��̱��ϱ�;

public class Member {
	// ��� ����
	public static final int MALE = 0;  // ���� ȸ��
	public static final int FEMALE = 1;  // ���� ȸ��
	
	// ������� ����
	private String name;	// ȸ���̸�
	private int gender;		// ����
	private int age;		// ����
	
	// ������(������� �ʱ�ȭ�� �����ڸ� ���ؼ� ���� => setter �޼ҵ� �ʿ����)
	public Member(String name, int gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	// getter �޼ҵ�(��������� �ִ� ���� ���Ϲޱ� ���ؼ�)
	public String getName() { return name; }
	public int getGender() { return gender; }
	public int getAge() { return age; }
}
