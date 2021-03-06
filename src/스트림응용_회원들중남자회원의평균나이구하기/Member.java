package 스트림응용_회원들중남자회원의평균나이구하기;

public class Member {
	// 상수 선언
	public static final int MALE = 0;  // 남자 회원
	public static final int FEMALE = 1;  // 여자 회원
	
	// 멤버변수 선언
	private String name;	// 회원이름
	private int gender;		// 성별
	private int age;		// 나이
	
	// 생성자(멤버변수 초기화는 생성자를 통해서 가능 => setter 메소드 필요없음)
	public Member(String name, int gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	// getter 메소드(멤버변수에 있는 값을 리턴받기 위해서)
	public String getName() { return name; }
	public int getGender() { return gender; }
	public int getAge() { return age; }
}
