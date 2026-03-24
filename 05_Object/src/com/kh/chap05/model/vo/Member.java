package com.kh.chap05.model.vo; // Value Object(값 객체)

public class Member {
	
	// 웹사이트를 만들건데 회원의 정보를 어딘가에 저장해두어야한다. 
	// [ 필드부 ]
	// 아이디, 비밀번호, 닉네임
	private String userId;
	private String userPwd;
	private String nickName;
	
	// [ 생성자부 ]
	// 생성자(Constructor) : 객체 생성 시 초기화를 담당하는 특수한 구성 요소
	/*
	 * 생성자의 두 가지의 역할
	 * -- 기술적인 관점 : 객체가 생성될 때 어떤 상태로 시작을 해야하는가??
	 * -- 개념적인 관점 : 객체가 생성이 될거면 처음부터 유효한 상태여야 하지 않아??
	 * 
	 * [ 표현법 ]
	 * 접근제한자 클래스식별자() {
	 * 		해당 생성자를 통해서 객체를 생성 시 실행하고자하는 코드;
	 * }
	 * 
	 
	 */
	/*public Member(String userId, String userPwd, String nickName)	{
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	*/
	// 기본생성자(매개변수가 존재하지 않는 생성자)
	// 클래스 내부에 생성자가 하나도 없을시 기본생성자를 자동으로 만들어줌!
	// 객체를 생성할 목적으로(메모기 값 초기화) 호출해서 사용
	public Member()	{
		System.out.println("생성자 호출");
	}
	public Member(String userId) {
		System.out.println("유저아이디~");
		this.userId = userId;
	}
	public Member(String usreId, String userPwd) {
		this.userId = usreId;
		this.userPwd = userPwd;
		
	}
	
	public Member(String userId, String userPwd, String nickName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	/*
	 * 1. 반드시 생성자의 이름을 클래스의 이름과 동일하게 작성해야함(대/소문자)
	 * 2. 반환형이 존재해서는 안됨!!
	 * 3. 매개변수 생성자를 명시적으로 작성하면 기본생성자를 만들어주지 않음!!!
	 * => Legacy 기술들을 기본생성자가 필요한 상황이 있음!
	 * 4. 생성자는 동일한 이름으로 여러 개 만들 수 있지만 매개변수는 중복되면 안됨!
	 * => 생성자 오버로딩 
	 */
	
		
	
	
	
	
	
	
	
	
	// [ 메소드부 ]
	// getter() / setter() / info() 만들기 시작!
	
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getNickName() {
		return nickName;
	}
	
 	// setter
	public void setUserId(String userId) {
		this.userId = userId; 
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String info() {
		return "아이디 : " + userId + ", 비밀번호 : " + userPwd + ", 닉네임 : " + nickName;
	}
	

}
