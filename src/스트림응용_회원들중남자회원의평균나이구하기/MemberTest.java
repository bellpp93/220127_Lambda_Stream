package 스트림응용_회원들중남자회원의평균나이구하기;

import java.util.Arrays;
import java.util.List;

public class MemberTest {

	public static void main(String[] args) {
		List<Member> list = (List)Arrays.asList(new Member("손흥민", Member.MALE, 30),
												new Member("이강인", Member.MALE, 26),
												new Member("김연아", Member.FEMALE, 32),
												new Member("김은진", Member.FEMALE, 28),
												new Member("안재홍", Member.MALE, 35));
		
		double ageAvg = list.stream()  // 오리지날 스트림
							.filter(m -> m.getGender() == Member.MALE)  // filter()는 Predicate 조사
							.mapToInt(Member::getAge)  // 중간처리
							.average()  // 최종처리
							.getAsDouble();  //결과 값 불러오기
		
		System.out.format("남자 회원의 평균 나이: " + "%.2f", ageAvg);  // "%.2f", => 소수점 이하 두자리만 출력하겠다.
	}
}
