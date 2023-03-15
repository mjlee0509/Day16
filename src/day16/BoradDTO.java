package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class BoradDTO {
	
	private static int number = 100;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss"); 
	
	
	private String bno;
	private String title;
	private String writer;
	private int cnt;
	private String postDate;
	
	public BoradDTO() {
		this.bno = "B" + number++;
		this.postDate = DTF.format(LocalDateTime.now());
	}
	
	public String getBno() {
		return bno;
	}

//	public void setBno(String bno) {
//		this.bno = bno;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getCnt() {
		return cnt;
	}

	public void increaseCnt() {
		this.cnt++;
	}	// <-- setCnt를 이렇게 바꿨다. 실행하면 1씩 추가되는 메소드. 

	public String getPostDate() {
		return postDate;
	}

	@Override
	public String toString() {
		return bno + "\t" + title + "\t\t\t" + writer + "\t" + cnt + "\t" + postDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bno, cnt, postDate, title, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoradDTO other = (BoradDTO) obj;
		return Objects.equals(bno, other.bno) && Objects.equals(cnt, other.cnt)
				&& Objects.equals(postDate, other.postDate) && Objects.equals(title, other.title)
				&& Objects.equals(writer, other.writer);
	}

//	public void setPostDate(String postDate) {
//		this.postDate = postDate;
//	}
	
//	public void print() {
//		System.out.printf("%s\t%s\t\t%s\t%d\t%s\n", bno,title,writer,cnt,postDate);
//	}
	
	
	
	
	
}




