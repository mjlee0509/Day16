package day15;

public class StudentDTO {
	private Long id;
	private String studentNumber;
	private String StudentName;
	private String studentMajor;
	private String studentMobile;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StudentDTO [id=" + id + ", studentNumber=" + studentNumber + ", studentName=" + StudentName + ", studentMajor=" + studentMajor + ", studentMobile=" + studentMobile + "]";  
	}
	

}
