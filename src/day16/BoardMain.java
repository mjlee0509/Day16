package day16;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		BoardService service = new BoardService();

		while (true) {
			System.out.println("======게시판======");
			System.out.println("1.게시물등록  2.리스트  3.읽기  4.수정  5.삭제  6.테스트데이터  7.검색  0.종료");
			System.out.print("메뉴선택 >>> ");
			int menu = sc.nextInt();

			if (menu == 1) {
//				BoardDTO board = new BoardDTO();
//				System.out.print("제목 >>> ");
//				board.setTitle(sc.next());
//				System.out.print("작성자 >>> ");
//				board.setWriter(sc.next());

				// 위에 있는 기능들은 service에 구현되어있다
				service.save();

			} else if (menu == 2) {
				service.findAll();

			} else if (menu == 3) {
				service.findById(); // <-- 서비스에서 호출

			} else if (menu == 4) {
				service.update();

			} else if (menu == 5) {
				service.delete();

			} else if (menu == 6) {
				service.test();

			} else if (menu == 7) {
				service.search();
				
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
