package ��Ʈ������_�л�����������ϱ�;

public class Student {
	// ������� ����
	private String name;	// �̸�
	private int score;		// ����
	
	// ������
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	// ������� �ϳ��� getter �޼ҵ� (�����ڰ� ������� setter �޼ҵ嵵 �Բ� ȣ��)
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}
