package miniProject;

import java.util.HashMap;
import java.util.Map;

import day17.ClientDTO;
import day17.ClientRepository;

public class TestRepository {
	
	private static TestRepository repository = new TestRepository();
	private TestRepository() {
	}
	public static TestRepository getInstance() {
		return repository;
	}
	Map<String, TestDTO> testMap = new HashMap<>();
	TestDTO testDTO = new TestDTO();

	public boolean save(TestDTO testDTO) {
		TestDTO result = testMap.put(testDTO.getId(), testDTO);
		if (result == null) {
			return true;
		}
		return false;
	}

	public boolean dupCheck(String id) {
		while (true) {
			for (String key : testMap.keySet()) {
				if (testMap.get(key).getId().equals(id)) {
					return true;
				}
			}
			return false;
		}
	}
	
	public boolean loginCheck(String id, String password) {
		for (String key : testMap.keySet()) {
			if (id.equals(testMap.get(key).getId()) && password.equals(testMap.get(key).getPassword())) {
				return true;
			}
		}
		return false;
	}



}
