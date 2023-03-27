package Lv10_clone;

import java.util.HashMap;
import java.util.Map;

public class Day66_ex01_Map_Hashmap {
	private static final HashMap String = null;

	public static void main(String[] args) {
		// 자바 자료구조
		// 1. Collection 선형 자료구조(List 안에 Arraylist, vector 사용해봤음)
		// 2. Map (key, value)
		// ㄴ Key - Value로 이루어진 한 쌍의 단위로 데이터를 처리

		// Map<K, V>
		// 선언 및 초기화
		// Map(키 타입, 값 타입> 변수명;
		// = new HashMap<>();
		Map<String, String> map = new HashMap<String, String>();// 자바 자료구조
		// 1. Collection 선형 자료구조(List 안에 Arraylist, vector 사용해봤음)
		// 2. Map (key, value)
		// ㄴ Key - Value로 이루어진 한 쌍의 단위로 데이터를 처리

//			Map<K, V>
		// 선언 및 초기화
		// Map(키 타입, 값 타입> 변수명;
		// = new HashMap<>();()<String, String>();

		// 데이터 담기 : put(Key, Value) 메소드 사용
		map.put("고구마", "자색의 뿌리 식물로 ...");

		// 동일한 키에 put하면 수정 처리 됨
		map.put("고구마", "자색의 뿌리 식물로 단 맛이 난다...");

		// 값 가져오기 : get(Key값)
		// ㄴ map 자료구조에서의 key는 list에서의 index와 같음
		System.out.println(map.get("고구마"));

		// 보유한 키 목록 반환 : keySet

		Map<Integer, Character> myMap = new HashMap<Integer, Character>();

		myMap.put(96, (char) 96);
		myMap.put(97, (char) 97);
		myMap.put(98, (char) 98);
		myMap.put(99, (char) 99);
		myMap.put(100, (char) 100);

		for (Integer key : myMap.keySet()) {
			System.out.print(key + " : ");
			System.out.println(myMap.get(key));
		}
	}
}
