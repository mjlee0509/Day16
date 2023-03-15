package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day15.StudentDTO;

public class BoardRepository {
//	private List<BoradDTO> list = new ArrayList<>();

	private Map<String, BoradDTO> boardMap = new HashMap<>();

	public boolean save(BoradDTO boardDTO) {
		if (boardMap.put(boardDTO.getBno(), boardDTO) == null) {
			return true;
		}
		return false;
	}

	public Map<String, BoradDTO> findAll() {
		return boardMap;
	}

	public BoradDTO findById(String bno) {
//		for (BoradDTO boardDTO : list) {
//			if (boardDTO.getBno().equals(bno)) {
//				return boardDTO;

		for (String map : boardMap.keySet()) {
//			System.out.println();
			if (boardMap.get(map).getBno().equals(bno)) {
				return boardMap.get(map);
			}

		}
		return null;
	}

//	public BoradDTO findById(String bno) {
//	for(String b : bmap.keySet()) {
//		//키값을 가져와서 b에서 반복한다
//	System.out.println(bno);
//	
//	System.out.println(bmap.get(b).equals(bno));
//		//bmap의 키값인 b와 입력받은 bno
//	
//	return bmap.get(b);
//	//zlrkqtdp 벨류값
//	}
//	return null;
//}
//

	public boolean update(BoradDTO boardDTO, String bno) {
		for (String map : boardMap.keySet()) {
			if (boardMap.get(map).getBno().equals(bno)) {
				boardMap.get(map).setTitle(boardDTO.getTitle());
				boardMap.get(map).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}
	
////	public boolean delete(BoardDTO boardDTO) {	
////		return list.remove(boardDTO);	 
////	}	
//
	public boolean delete(String bno) {
		for (String map : boardMap.keySet()) {
			if (boardMap.get(map).getBno().equals(bno)) {
				boardMap.remove(map);
				return true;
			}
		}
		return false;
	}

	}

