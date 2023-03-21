package miniProject;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		TestService testService = TestService.getInstance();
		MbtiService mbtiService = MbtiService.getInstance();
		boolean login = false;

		while (true) {
			System.out.println("=================||반응형 웹기반 Back-end 개발자를 위한 심리테스트||=================");
			if (!login) {
				System.out.println(" |(1.회원가입)|                 |(2.로그인)|                 |(0.종료)| ");
			} else {
				System.out.println(" |(1.테스트하러가기)|  |(2.테스트내역)|  |(3.포인트충전)|  |(4.유료서비스)|  |(0.종료)| ");
			}
			System.out.println("============================================================================");

			System.out.print("메뉴를 선택하세요 >>> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 일단 문항 다 만들고 바꾸자
				if (!login) {
					testService.save();
				} else {
					mbtiService.eiTest();
					mbtiService.nsTest();
					mbtiService.tfTest();
					mbtiService.jpTest();
					boolean testEnd = false;
										
				}
			} else if (menu == 2) {
				if (!login) {
					login = testService.loginCheck();
				} else {
//					service.findAll();
					
				}

			} else if (menu == 3) {

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
			System.out.println();

		}
		System.out.println("프로그램을 종료합니다.");

	}

}
