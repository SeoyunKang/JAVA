package Method;

public class BoxMethod {
	
	public static void main(String[] args) {
		
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intVal = box1.getT();
		
		Box<String> box2 = Util.boxing("홍길동");
		String strVal = box2.getT();
		
		System.out.println(intVal + strVal);
		
		Pair<Integer, String> p1 = new Pair<Integer, String>(1,"사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1,"사과");
		boolean result1 = Util.compare(p1, p2);
		if(result1){
			System.out.println("동등한 객체입니다.");
		} else {
			System.out.println("동등하지 않은 객체입니다.");
		}
		
	}
	
}
