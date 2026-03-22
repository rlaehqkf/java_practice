package com.kh.chap02.encapsulation.model.vo;


// 필드부 , 생성자부, 메소드부
public class AutoSellingMachine { // 단 한개의 제품을 파는 자판기
	// 필드(field)부
	/*
	 * 값을 담는 부분 (변수, 값을담을 공간이 필요)
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 객체들이 가져야할 공통적인 속성을 기술해 놓는 것 
	 * 
	 * 접근제한 자료형 필드식별자;
	 */
	
	//자판기 == 제품이름, 제품가격, 수량 
	private String name;
	private int price;
	private int amount;
	
	// 캡슐화 하기 1. 공공제한자변경 public - > private
	//			2. 
	
	
	
	
	/*
	public void hi() {
		System.out.println("하이");
	} 
	*/
	
	// Dependency(의존) 관계 정말정말중요 ★
	
	
	
	
	private void checkAmount() {
		System.out.println("재고는 총" + amount + "개 입니다.");
	}
	
	private void sellingProduct() {
		amount -= 1;
	}
	
	private void insertAmount() {
		amount += 3;
	}
	
	private void openMachine() { // 이렇게 해놓으면 클래스외부 run이아니라 클래스내부에서 찾고 고칠수있어 이과정을 결합도를 낮춘다라고 표현
		checkAmount();
		insertAmount();
		sellingProduct();
		checkAmount();
	}
	
	
	// 객체의 속성 값을 기록 및 수정하는 기능의 메소드 : setter()    , 원래vo클래스 안에 setter()를안하는게 원칙
	
	/*
	 * VO -> setter메소드를 구현하지 않음
	 * DTO -> setter를 구현해서 많이 사용
	 * 
	 * DTO 배울때 까지만 VO에 setter를 구현해서 사용하겠음
	 * 
	 * setter만들기 규칙 
	 * 
	 * 1. setter메소느는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public을 이용
	 * 2. set필드명으로(setName) 식별자를 작성하며 낙타봉표기법(camelCase)를 꼭 지키도록한다!!
	 */
	
	
	// ☆ 하나의 메소드는 하나의 기능을 수행해야한다. ★
	
	
	// price필드 값을 set할 수 있는 메소드 구현
	public void setPrice(int price) { // void는 리턴타입 반환형이라고 읽음
							// (이안을뭐라하냐면) parameter, 매개변수
							// 매개변수는 메소드 호출 시 초기화가 강제됨 ★ 암기
		
							// 파란색은 필드 황토색은 지연변수 
		
		this.price = price; // setter의 생김새
		
		// 지역변수 특 메소드 안에서만 살아있음, 반드시 초기화를해야만 사용가능
		System.out.println(price);
		// price = price;
		// Scope 안에서는 해당 영역안에 있는 지역변수가 식별자 우선권을 가진다.
		System.out.println("내 주소가 뭐지 : " + this);
		// this 해당 객체의 주소값을 가리키는 역할  
		
		
		
		
		
		
	} // 메모리 구조의 대한 이해!!! 그냥 뭐 한번 매개변수를 입력하면 스택에서 사라져 
	
	// name필드를 기록 및 수정할 수 있는 메소드
	public void setName(String name) {      // name변수식별자는 보통set와 같은 이름을씀
		this.name = name;
		
	}
	
	// amount 필드를 기록 및 수정할 수 있는 메소드
	public void setAmount(int amount)	{  // amount라른 필드에 값을 대입하기위해 이 메소드가 필요
		// 필드에 대입할 값이 필요 뭐가들어올지 몰라 자료형은 유출가능 int 그래서 자료형을 적고 식별자는 동일하게
		this.amount = amount;// 필드의 값을대입해야해 heap에 존재하는 객체의 어마운트필드를가고싶어 주소가필요 
								//매게변수 어마운트에 저장되있는값을 대입하고 싶어
	}
	
	/*
	 * 관례 위반 : 두개 이상의 필드값을 변경하는 메소드 이름에 set이 붙으면 안됨!!
	 * public void setPriceAndAmount(int price, int amount) {
	 * 		setPrice(price);
	 * 		setAmount(amount);
	 * }
	 */
	
	// 데이터를 반환해주는 기능의 메소드 : getter() -> 꼭 있어야함!!!!!!! 내놔란뜻 
	
	/*
	 * 규칙!
	 * 
	 * 1. getter()는 접근제한다 public을 사용한다.
	 * 2. get필드명으로 짓되, 낙타봉표기법(camelCase)를 사용한다.
	 * 3. VO패키지안에 존재하는 클래스라면 getter는 무조건 꼭 절대로 다 만드세요!!!
	 * 
	 */
	
	// 메소드를 호출한 곳으로 name필드값을 돌려주고 싶음
	public String getName() {
		return name; // getter에는 this 잘 안붙임 name = 네임필드값
	}
	
	// 개수를 반환해주는 메소드
	public int getAmount() {
		return amount;
	}
	
	public int getPrice() {
		return price;
	}
	
	// 필드들의 접근제한자를 private으로 변경한 뒤
	// 각각의 필드들에 대한 getter() / setter()를 구현하면
	// 캡슐화가 끝났다!
	/*
	 * 1. 값을 숨긴다 => 필드의 접근제한자를 private으로 선언
	 * 
	 * 2. 메소드를 통해 필드에 접근할 수 있게 만든다 => getter() / setter() 구현
	 * 
	 * 데이터를 숨김 => 객체간의 결합도가 낮아짐 => 책임을 분리시킴
	 */
	
	
	
	
	
	/*
	public void a()	{
		System.out.println("나는 a당");
		b();
		System.out.println("b를 불렀땅");
		System.out.println("b의 값은? " + b);
	}
	
	public void b() {
		System.out.println("나는 b당");
		c();
		System.out.println("c를 불렀땅");
	}
	
	public int c() {
		System.out.println("나는 c당");
		int c = c();
		System.out.println("c를 불렀땅");
		return c;
	}
	*/
	
	
	public String info() {
		String info = "자판기 = [제품명 : " + name + ", 가격 : " + price + ", 재고 : " + amount + "]";
		// return name, price, amount; 안되는 문법 return할땐 값의 개수가 무조건1개
		return info;
		
		//return name + price + amount;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
