package day16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BoardService {
	
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);

	public void save() {
		BoradDTO boardDTO = new BoradDTO();
		System.out.print("제목 >>> ");
		boardDTO.setTitle(sc.nextLine());
		System.out.print("작성자 >>> ");
		boardDTO.setWriter(sc.next());
		sc.nextLine(); // 
		boolean success = br.save(boardDTO); 
		if (success) {
			System.out.println("게시물 등록 완료!");
		} else {
			System.out.println("게시물 등록 실패...");
		}

	}

	public void findAll() {
		Map<String, BoradDTO> boardMap = br.findAll();
		System.out.println("글번호\t제목\t\t\t작성자\t조회수\t게시일");
		System.out.println("-------------------------------------------------------------------------");
		for (String bno : boardMap.keySet()) {
			System.out.println(boardMap.get(bno));
		}
	} 

	public void findById() {
		System.out.print("읽을 글 번호 >>> ");
		String bno = sc.next();
		BoradDTO map = br.findById(bno);
		if (map == null) {
			System.out.println("게시물을 찾을 수 없습니다");
		} else {
			System.out.println("글번호\t제목\t\t\t작성자\t조회수\t게시일");
			System.out.println("-------------------------------------------------------------------------");
			map.increaseCnt();
			System.out.println(map);
		}
	}
	
//	public void findById() {
//	System.out.print("읽을 글번호> ");
//	String bno = sc.next();
//	BoardDTO b = br.findById(bno);
//	if (b == null) {
//		System.out.println("찾을 수 없는 글입니다");
//	} else {
//		b.increaseCnt();
//		System.out.println(b);
//	}
//}


	public void update() {
		System.out.print("수정할 글번호 >>> ");
		String bno = sc.next();
		sc.nextLine();
		BoradDTO map = br.findById(bno);
		if (map == null) {
			System.out.println("게시물을 찾을 수 없습니다.");
		} else {
			BoradDTO boardDTO = new BoradDTO();
			System.out.print("수정할 제목 >>> ");
			boardDTO.setTitle(sc.nextLine());
			System.out.print("수정할 작성자 >>> ");
			boardDTO.setWriter(sc.next());
			sc.nextLine();
			if (br.update(boardDTO, bno)) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("업데이트 실패");
			}
		}
	}

	public void delete() {
//		System.out.print("삭제할 글번호 >>> ");
//		String bno = sc.next();
//		BoardDTO b = br.findById(bno);
//		boolean success = br.delete(b);
//		
//		if (b == null) {
//			System.out.println("게시물이 삭제되었습니다.");
//		} else {
//			System.out.println("게시물을 찾을 수 없습니다.");
//		}
		System.out.print("삭제할 글번호 >>> ");
		String bno = sc.next();sc.nextLine();
		if (br.delete(bno)) {
			System.out.println("게시물이 삭제되었습니다.");
		} else {
			System.out.println("게시물을 찾을 수 없습니다.");
		}

	}
	
	public void test() {
		Map<String, BoradDTO> boardMap = new HashMap<>();
		System.out.println("글번호\t제목\t\t\t작성자\t조회수\t게시일");
		System.out.println("-------------------------------------------------------------------------");
		for (String bno : boardMap.keySet()) {
			System.out.println(boardMap.get(bno));
		}

	}



}
