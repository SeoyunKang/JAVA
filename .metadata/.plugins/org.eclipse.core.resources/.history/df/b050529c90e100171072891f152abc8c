package Generic;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Box box = new Box();
		box.set("Tom"); 					//String -> Object (자동 타입변환)
		String name = (String) box.get(); 	//Object -> String (강제 타입변환)
		
		box.set(new Apple());				//Apple -> Object (자동 타입변환)
		Apple apple = (Apple) box.get();	//Object -> Apple (강제 타입변환)
		 */		
		//강제타입변환이 잦음
		
		Box<String> box = new Box<String>();
		box.setT("hello");
		String str = box.getT();
		
		System.out.println(str);
		
		//제네릭을 쓰면 타입변환이 필요없다.
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(6);
		int val = box2.getT();
		System.out.println(val);
	}

}
