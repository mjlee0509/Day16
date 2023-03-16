package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day15.StudentDTO;

public class BoardRepository {
//	private List<BoradDTO> list = new ArrayList<>();

	private Map<String, BoardDTO> boardMap = new HashMap<>();

//	public boolean save(BoradDTO boardDTO) {
//		if (boardMap.put(boardDTO.getBno(), boardDTO) == null) {
//			return true;
//		}
//		return false;
//	}

	public boolean save(BoardDTO boardDTO) {
		BoardDTO result = boardMap.put(boardDTO.getBno(), boardDTO);	//put(key, value)
		if (result == null) {
		return true;
		} else {
			return false;
		}
	}
		
	public Map<String, BoardDTO> findAll() {	// <-- 여길 잘 봐야...; Map<key, value>???; value 타입이 BoardDTO인 이유는? 
		return boardMap;
	}
	

//	public BoardDTO findById(String bno) {
////		for (BoradDTO boardDTO : list) {
////			if (boardDTO.getBno().equals(bno)) {
////				return boardDTO;
//
//		for (String map : boardMap.keySet()) {
////			System.out.println();
//			if (boardMap.get(map).getBno().equals(bno)) {
//				return boardMap.get(map);
//			}
//
//		}
//		return null;
//	}
	
	public BoardDTO findById(String bno) {
		/*
		- map 반복문 돌리고
		- bno와 일치하는 객체를 착고
		- 찾으면 리턴
		*/
		for (String key : boardMap.keySet()) {
			if(bno.equals(boardMap.get(key).getBno())) {	//boardMap.get(key)까지가 객체; bno와 비교 불가; 따라서 .getBno()까지 써줘야 입력받은 bno와 비교가 가능해짐
			return boardMap.get(key);	
			}
		}
		return null;

	}


//	public boolean update(String updateTitle, String updateWriter, String bno) {
//		for (String map : boardMap.keySet()) {
//			if (boardMap.get(map).getBno().equals(bno)) {
//				boardMap.get(map).setTitle(updateTitle);
//				boardMap.get(map).setWriter(updateWriter);
//				return true;
//			}
//		}
//		return false;
//	}
	
	public boolean update(String updateTitle, String updateWriter, String bno) {
		for (String key : boardMap.keySet()) {
			if (bno.equals(boardMap.get(key).getBno())) {
				boardMap.get(key).setTitle(updateTitle);
				boardMap.get(key).setWriter(updateWriter);
				return true;
			}
		}
		return false;
	}


////	public boolean delete(BoardDTO boardDTO) {	
////		return list.remove(boardDTO);	 
////	}	
//
//	public boolean delete(String bno) {
//		for (String map : boardMap.keySet()) {
//			if (boardMap.get(map).getBno().equals(bno)) {
//				boardMap.remove(map);
//				return true;
//			}
//		}
//		return false;
//	}
	
	public boolean delete(String bno) {
		for(String key: boardMap.keySet()) {
			if(bno.equals(boardMap.get(key).getBno())) {
				boardMap.remove(key);
				return true;
			}
		}
		return false;
	}


	public List<BoardDTO> search(String writer) {
		List<BoardDTO> list = new ArrayList<>();	// <-- 검색결과를 담을 리스트 선언
		for (String key : boardMap.keySet()) {		// <-- 찾아야하니까 반복문을 돌려야지
			if (boardMap.get(key).getWriter().equals(writer)) {
				list.add(boardMap.get(key));
				
//				BoardDTO result = boardMap.get(key);
//				list.add(result);		--> 이렇게 쓸 수도 있다
				
//				return list;			--> for문이 끝나야 검색 결과가 만들어지기 떄문에 for문 안에서 리턴을 받지 않는다
			}
		}
		return list;

	}
}
