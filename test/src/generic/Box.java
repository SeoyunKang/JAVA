package Generic;

public class Box<T> {
	
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	//클래스 설계시 구체적인 타입을 명시하지않고 타입 파라미터로 대체한 뒤
	//실제 클래스가 사용될 때 구체적인 타입을 지정함으로써 타입 변환을 최소화시킨다.
}
