package Method;

public class Util {
	
	//제네릭 메소드는 매개 타입과 리턴 타입으로 파라미터를 갖는 메소드를 말한다.
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
	
	public static<K,V> boolean compare(Pair<K,V> p1 , Pair<K,V> p2){
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
