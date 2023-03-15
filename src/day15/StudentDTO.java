package day15;

import java.util.Objects;

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
		return "StudentDTO [id=" + id + ", studentNumber=" + studentNumber + ", StudentName=" + StudentName
				+ ", studentMajor=" + studentMajor + ", studentMobile=" + studentMobile + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(StudentName, id, studentMajor, studentMobile, studentNumber);
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(StudentName, other.StudentName) && Objects.equals(id, other.id)
				&& Objects.equals(studentMajor, other.studentMajor)
				&& Objects.equals(studentMobile, other.studentMobile)
				&& Objects.equals(studentNumber, other.studentNumber);
	}
	
	
	
	
	

}
