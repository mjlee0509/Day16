package miniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDTO {
	private static int indEI = 0;
	private static int indNS = 0;
	private static int indFT = 0;
	private static int indJP = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss");
	
	private String id;
	private String password;
	private String nick;
	private String myType;
	private String testDate;
	private String ei;
	private String ns;
	private String ft;
	private String jp;
	private long myPoint;
	
	public TestDTO() {
		this.testDate = DTF.format(LocalDateTime.now());
		String ei = (indEI >= 2)? "E" : "I";
		String ns = (indNS >= 2)? "N" : "S";
		String ft = (indFT >= 2)? "F" : "T";
		String jp = (indJP >= 2)? "J" : "P";
		this.myType = ei+ns+ft+jp;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public long getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(long myPoint) {
		this.myPoint = myPoint;
	}
}
