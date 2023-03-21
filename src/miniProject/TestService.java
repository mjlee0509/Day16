package miniProject;

import java.util.Scanner;

import day17.ClientRepository;
import day17.ClientService;

public class TestService {

	private static TestService service = new TestService();

	private TestService() {
	}

	public static TestService getInstance() {
		// TODO Auto-generated method stub
		return service;
	}

	private Scanner sc = new Scanner(System.in);
	private TestRepository repository = TestRepository.getInstance();
	private String loginId = null;
	private String loginPassword = null;


	public void save() {
		TestDTO testDTO = new TestDTO();
		while (true) {
			System.out.print("사용하실 ID를 입력하세요 >>> ");
			testDTO.setId(sc.next());
			if (repository.dupCheck(testDTO.getId())) {
				System.out.println("이미 사용중인 아이디입니다. 다시 입력해주세요");
			} else {
				break;
			}
		}
		System.out.print("사용하실 비밀번호를 입력하세요 >>> ");
		testDTO.setPassword(sc.next());
		while (true) {
			System.out.print("사용하실 닉네임을 입력하세요 >>> ");
			testDTO.setNick(sc.next());
			if (repository.dupCheck(testDTO.getNick())) {
				System.out.println("이미 사용중인 닉네임입니다. 다시 입력해주세요");
			} else {
				break;
			}
		}
		if (repository.save(testDTO)) {
			System.out.println(testDTO.getNick() + "님 환영합니다.");
		} else {
			System.out.println("회원가입 실패");
		}

	}
	
	public boolean loginCheck() { 
		TestDTO testDTO = new TestDTO();
		System.out.print("ID >>> ");
		String id = sc.next();
		System.out.print("비밀번호 >>> ");
		String password = sc.next();
		if (repository.loginCheck(id, password)) {
			System.out.println("로그인되었습니다.");
			loginId = id;
			loginPassword = password;
			return true;
		} else {
			System.out.println("ID 또는 비밀번호를 확인하세요");
			return false;
		}

	}

	


		
		

	}

