package Method;

public class BoxMethod {
	
	public static void main(String[] args) {
		
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intVal = box1.getT();
		
		Box<String> box2 = Util.boxing("ȫ�浿");
		String strVal = box2.getT();
		
		System.out.println(intVal + strVal);
		
		Pair<Integer, String> p1 = new Pair<Integer, String>(1,"���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1,"���");
		boolean result1 = Util.compare(p1, p2);
		if(result1){
			System.out.println("������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� ���� ��ü�Դϴ�.");
		}
		
	}
	
}
