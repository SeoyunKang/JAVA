package test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//자바7 이전까지 사용한 List<String>컬렉션의 요소를 순차적으로 처리하기위한 Iterator반복자 사용
		List<String> list = Arrays.asList("홍길동","신용권","김자바");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			String name = iter.next();
			System.out.println(name);
		}
		
		List<String> list2 = Arrays.asList("홍길동","강서윤","이자바");
		Stream<String> stream = list2.stream();
		stream.forEach(name2 ->System.out.println(name2));
	}

}
