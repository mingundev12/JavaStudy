package exam04;

public class Student {
//	기본 생성자 : 매개변수가 없는 생성자
//	클래스에 생성자가 하나도 없으면 기본 생성자가 자동으로 만들어진다.
//	클래스에 매개변수를 사용하는 생성자가 있을 때 기본 생성자를 사용하고 싶으면, 기본 생성자를 만들어 주어야 한다.
	
//	데이터 클래스의 목적 : 메서드는 부가적인 것
//	필드 변수로 이루어진 객체를 생성하여, 그 안에 데이터를 집어넣는 것이 목적
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "(" + score + ")";
	}

}
