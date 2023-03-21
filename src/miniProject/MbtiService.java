package miniProject;

import java.util.Scanner;

public class MbtiService {

	private static MbtiService mbtiService = new MbtiService();

	private MbtiService() {
	}

	public static MbtiService getInstance() {
		// TODO Auto-generated method stub
		return mbtiService;
	}

	private Scanner sc = new Scanner(System.in);
	private TestRepository repository = TestRepository.getInstance();

	public void eiTest() {
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q1) 수강 첫 날 ... ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. \'잘 할 수 있을까...?\' 오만가지 걱정이 앞선다. ");
		System.out.println("1. 새로운 친구를 사귈 생각에 설렌다.");
		System.out.print("응답 >>> ");
		int answer1 = sc.nextInt();
		System.out.println("\n");		
		System.out.println("\n");
		
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q2) 첫 수업시간, 옆에 앉은 동기가 벌써부터 헤매고 있다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. \'이건 이렇게 하는거에요\' 마음속으로는 도와주고 싶지만 선뜻 나서지 못한다.");
		System.out.println("1. \"이건 이렇게 하는거에요\" 먼저 발벗고 나서서 알려준다");
		System.out.print("응답 >>> ");
		int answer2 = sc.nextInt();
		System.out.println("\n");

		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q3) 첫 수업이 끝나고 잠깐 바람 쐬러 나갔는데, 같은 수업을 듣는 동기를 마주쳤다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. 혼자 있고 싶다. 못 본 척하며 지나간다.");
		System.out.println("1. \"어?? 과정평가형 백엔드 들으시죠?\" 적극적으로 다가가 말을 건다");
		System.out.print("응답 >>> ");
		int answer3 = sc.nextInt();
		System.out.println("\n");
		
		int resultIe = answer1 + answer2 + answer3;
			
		}

	public void nsTest() {
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q4) 둘째날, 갑자기 수업 내용이 어려워졌다. 수업 내용이 도무지 이해가 안 된다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. 이해가 안 되면 그냥 외운다.");
		System.out.println("1. 이해가 안 되면 어떻게든 머리를 굴려서 이해하려고 한다.");
		System.out.print("응답 >>> ");
		int answer4 = sc.nextInt();
		System.out.println("\n");

		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q5) 옆에 앉은 분도 아직 이해 못 한 것 같다. ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. 어디서 어떤 코드가 어떻게 동작하는지 세밀하게 알려준다");
		System.out.println("1. 이론 위주로 두루뭉슬하게 알려준다.");
		System.out.print("응답 >>> ");
		int answer5 = sc.nextInt();
		System.out.println("\n");

		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q6) 수업이 끝나고 집에 가는 길에 나는 ... ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. \'집에 가서 빨리 밥 먹고 씻고 공부하다 자야지\' 별 생각 없이 가다보니 어느새 집 앞이다.");
		System.out.println("1. \'자고 일어났더니 코딩 천재가 된 나ㅋㅋ\' 별의 별 생각을 다 하며 가다보니 어느새 집 앞이다.");
		System.out.print("응답 >>> ");
		int answer6 = sc.nextInt();
		System.out.println("\n");

		int resultNs = answer4 + answer5 + answer6;

	}

	public void tfTest() {
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q7) 오늘부터 배웠던 내용들을 정리해서 블로그에 올리려고 한다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. 오늘 배웠던 내용들을 사실 위주로 쓴다.");
		System.out.println("1. 오늘 배우면서 느꼈던 느낌 위주로 쓴다.");
		System.out.print("응답 >>> ");
		int answer7 = sc.nextInt();
		System.out.println("\n");

		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q8) 누군가가 내 블로그를 보고 기분 나쁜 댓글을 남겼다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. 말도 안 되는 소리다. 논리적으로 반박한다.");
		System.out.println("1. 태도가 마음에 안 든다. 저런 식으로 댓글 쓰면 상처받는다.");
		System.out.print("응답 >>> ");
		int answer8 = sc.nextInt();
		System.out.println("\n");

		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q9) ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. ");
		System.out.println("1. ");
		System.out.print("응답 >>> ");
		int answer9 = sc.nextInt();
		System.out.println("\n");

		int resultTf = answer7 + answer8 + answer9;

	}

	public void jpTest() {
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q10) 다음 날 아침이 밝았다. 일어나자마자 나는 ... ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. \'아... 피곤하다.\' 슬슬 일어나 느긋하게 준비한다.");
		System.out.println("1. 시계를 보며 준비할 시간이 얼마나 남았는지 계산해본다.");
		System.out.print("응답 >>> ");
		int answer10 = sc.nextInt();
		System.out.println("\n");

		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q11) 준비를 마치고 버스 시간을 봤더니 간당간당하다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. \'택시타고 가지 뭐ㅎㅎ\' 별로 신경쓰지 않는다.");
		System.out.println("1. \'하... 택시 타야되나...\' 택시를 타면 제 시간에 도착할 수 있을지 계산해본다.");
		System.out.print("응답 >>> ");
		int answer11 = sc.nextInt();
		System.out.println("\n");

		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("Q12) 겨우겨우 시간 맞춰서 버스를 타고 가는 나, 버스를 타고 가며 앞으로의 각오를 다진다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("0. 나는 아직 무엇을 해야 할 지 모르겠다. 이것은 그 길을 찾기 위한 과정이다.");
		System.out.println("1. 나는 이제 무엇을 해야 하는지 안다. 이것은 그 길로 향하는 과정이다.");
		System.out.print("응답 >>> ");
		int answer12 = sc.nextInt();

		System.out.println("\n");

		int resultJp = answer10 + answer11 + answer12;

	}

}
