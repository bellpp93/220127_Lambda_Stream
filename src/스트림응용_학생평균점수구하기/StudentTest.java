package 스트림응용_학생평균점수구하기;

import java.util.Arrays;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentList = (List)Arrays.asList(new Student("김은진",90),
														new Student("박태호", 100),
														new Student("손유일", 80),
														new Student("오수철", 70),
														new Student("안재홍", 80));
		
		// [중요] 파이프 라인 구조
//		double avg = studentList.stream().mapToInt(Student::getScore).average().getAsDouble();
//					 오리지날 스트림			/	중간처리 (필터링 처리, 매핑 처리)	/	최종처리 (집계 처리 결과물) => 결과
		// ::는 'Student 클래스에 포함되어 있는' 이라는 뜻.
		double avg = studentList.stream()  // 오리지날 스트림
								.mapToInt(Student::getScore)  // 중간처리
								.average()  // 최종처리
								.getAsDouble();  // 결과 불러내기
		
		System.out.println("평균점수: " + avg);
	}
}
