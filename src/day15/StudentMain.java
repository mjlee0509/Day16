package day15;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Long, StudentDTO> studentMap = new HashMap<>();
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(1L);
		studentDTO.setStudentNumber("1111");
		studentDTO.setStudentName("김자바");
		studentDTO.setStudentMajor("컴퓨터공학");
		studentDTO.setStudentMobile("010-1111-1111");
		
		studentMap.put(studentDTO.getId(), studentDTO);
		
		
		StudentDTO studentDTO1 = new StudentDTO();
		studentDTO1.setId(2L);
		studentDTO1.setStudentNumber("2222");
		studentDTO1.setStudentName("이자바");
		studentDTO1.setStudentMajor("경영");
		studentDTO1.setStudentMobile("010-2222-2222");
		
		studentMap.put(studentDTO1.getId(), studentDTO1);
		
		
		StudentDTO studentDTO2 = new StudentDTO();
		studentDTO2.setId(3L);
		studentDTO2.setStudentNumber("2222");
		studentDTO2.setStudentName("이자바");
		studentDTO2.setStudentMajor("경영");
		studentDTO2.setStudentMobile("010-2222-2222");
		
		studentMap.put(studentDTO2.getId(), studentDTO2);

		
		// 반복문으로 출력해보자
		for (Long id : studentMap.keySet()) {
			System.out.println(id);
			System.out.println(studentMap.get(id));
			
			// 학생 이름만 출력하고싶어요
//			System.out.println(studentMap.get(id).getStudentName());	//<-- 코드를 빼는게 아니라, 하나 더 들어가야된다는 방식으로 접근하자
		}

		

		
		

	}

}
