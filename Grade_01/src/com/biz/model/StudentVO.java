package com.biz.model;

/*
 * 객체지향의 특징(1)중 추상화의 개념
 * 
 * 사물, 어떤정보들을 하나의 묶음으로 취급하기 위하여
 * 구체적이고 특징적인 데이터들을 추출하여
 * 하나의 묶음으로 만는 것
 */
public class StudentVO {

	// 학생을 나타내는 데이터들을 나열
	// member 변수, 필드
	// 객체지향 특징2 정보의 은닉
	//	  클래스의 필드들을 외부에서 직접 접근하지 못하도록
	//	  private으로 선언하는 것
	private String number; // 학번
	private String name; // 학생이름
	private int grade; // 학년
	private String addr; // 주소
	private String tel; // 전화번호

	/*
	 * 기본생성자, super
	 * 아무런 매개변수가 없는 생성자
	 * 기본적으로 method의 형태만 갖추어진 상태
	 */
	public StudentVO() {
	}
	
	/*
	 * 필드생성자
	 * 필드들(맴버변수)을 매개변수로 갖고 있는 생성자
	 */
	public StudentVO(String number, 
			String name, int grade, 
			String addr, String tel) {
		super();
		this.number = number;
		this.name = name;
		this.grade = grade;
		this.addr = addr;
		this.tel = tel;
	}





	// 은닉된 필드들을 접근(저장, 읽기)하기 위해서
	// 각필드에 해당하는 getter와 setter를 설정
	// getter와 setter 를 속성이라고 부르는 곳도 있다.
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// 디버깅용
	// 디버깅 : 코딩을 하면 중간중간 변수들의 흐름을 추적하고
	// 	  코딩 흐름이 예측한대로 잘 진행되는지 알아보는 것
	@Override
	public String toString() {
		return "StudentVO [number=" + number + ", name=" + name + ", grade=" + grade + ", addr=" + addr + ", tel=" + tel
				+ "]";
	}
	

	
	
	
}






