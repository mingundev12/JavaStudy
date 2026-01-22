package exam23;

// 특정 클래스의 자식들만 받도록 제한
public class Calculator<T extends Number> {
	public double doubleValue(T number) {
		return number.doubleValue();
	}
}
