package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BoardService {

	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);

	public void save() {
		BoardDTO boardDTO = new BoardDTO();
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

//	public void findAll() {
//		Map<String, BoardDTO> boardMap = br.findAll();
//		System.out.println("글번호\t제목\t\t\t작성자\t조회수\t게시일");
//		System.out.println("-------------------------------------------------------------------------");
//		for (String bno : boardMap.keySet()) {
//			System.out.println(boardMap.get(bno));
//		}
//	}
	
	public void findAll() {
		Map<String, BoardDTO> boardMap = br.findAll();
		System.out.println("글번호\t제목\t\t\t작성자\t조회수\t게시일");
		System.out.println("-------------------------------------------------------------------------");
		List<String> keySet = new ArrayList<>(boardMap.keySet()); // <-- key값으로만 이루어진 리스트를 만들었다. 나중에 정렬 메뉴 만들때 쓰일 것 같다.
		Collections.sort(keySet);
		for (String key : keySet) {		// <-- ???
			boardMap.get(key).print();
		}
	}
	
	

	public void findById() {
		/*
		- map 반복문 돌리고
		- bno와 일치하는 객체를 착고
		- 찾으면 리턴
		*/
		System.out.print("읽을 글 번호 >>> ");
		String bno = sc.next();
		BoardDTO map = br.findById(bno);
		if (map == null) {
			System.out.println("게시물을 찾을 수 없습니다");
		} else {
			System.out.println("글번호\t제목\t\t\t작성자\t조회수\t게시일");
			System.out.println("-------------------------------------------------------------------------");
			map.increaseCnt();
			System.out.println(map);
		}
	}
	
	


	public void update() {
		System.out.print("수정할 글번호 >>> ");
		String bno = sc.next();
		sc.nextLine();
		BoardDTO map = br.findById(bno);
		if (map == null) {
			System.out.println("게시물을 찾을 수 없습니다.");
		} else {
			BoardDTO boardDTO = new BoardDTO();
			System.out.print("수정할 제목 >>> ");
			String updateTilte = sc.nextLine();
//			boardDTO.setTitle(sc.nextLine());
			System.out.print("수정할 작성자 >>> ");
			String updateWriter = sc.nextLine();
//			boardDTO.setWriter(sc.next());
			sc.nextLine();
			if (br.update(bno, updateTilte, updateWriter)) {
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
		String bno = sc.next();
		sc.nextLine();
		if (br.delete(bno)) {
			System.out.println("게시물이 삭제되었습니다.");
		} else {
			System.out.println("게시물을 찾을 수 없습니다.");
		}

	}

	public BoardDTO test() {
//		Map<String, BoradDTO> boardMap = new HashMap<>();
		for (int i = 1; i < 6; i++) {
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setTitle("title" + i);
			boardDTO.setWriter("writer" + i);
			br.save(boardDTO);	// repository 따로 만들 필요 없이 save 가져다 쓰시오
		}
		return null;

	}

	public void search() {
		System.out.print("작성자 >>> ");
		String writer = sc.next();
		sc.nextLine();
		List<BoardDTO> list = br.search(writer);
		System.out.println("글번호\t제목\t\t\t작성자\t조회수\t게시일");
		System.out.println("-------------------------------------------------------------------------");
		if (list == null) {
			System.out.println("게시물을 찾을 수 없습니다");
		} else {
			for (BoardDTO b : list) {
				System.out.println(b);
			}
		}

	}

}
