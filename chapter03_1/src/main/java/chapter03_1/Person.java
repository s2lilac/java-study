package chapter03_1;

public class Person {
	public Person() {
//		자식 생성자에서 부모 생성자를 명시적으로 호출하지 않으면,
//		자동으로 부모의 기본 생성자를 자식 생성자 코드 **맨 앞에** 호출
//		super(); // 자동으로 들어가있음
		System.out.println("Person() called");
		
	}
}
