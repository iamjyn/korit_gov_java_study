package _29_Collections.Map;

import java.util.*;

/*
* Map - 키(Key) / 값(Value)의 쌍으로 이루어진 데이터들의 집합
* Key는 중복될 수 없고, Value는 중복이 가능하다.
*/
public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();
        strMap1.put("kor001", "홍길동");
        strMap1.put("kor002", "홍길동");
        strMap1.put("kor003", "고길동");
        strMap1.put("kor004", "김길동");
        strMap1.put("kor005", "이길동");
        System.out.println(strMap1);

        // Map의 순회 => Map은 직접적으로 순회할 수 없다 => 직접 foreach를 돌릴 수 없다.
        // 왜냐하면 순회하기 위해서는 Iterable 이라는 인터페이스를 구현한 클래스여야 하는데, Map은 아니다.
        // Collection은 Iterable 인터페이스를 상속받고 Map이 이것으로 구현이 되어 있어야 하는데 그렇지 않다.
        // 그럼에도 순회하려면 다른 방법을 사용해야 함

        System.out.println(strMap1.keySet()); // => 키만 set형태로 반환
        System.out.println(strMap1.entrySet()); // => 키=값 전체를 set형태로 반환

        for (String key : strMap1.keySet()) {
            System.out.println("키: " + key + ", 값: " + strMap1.get(key));
        }

        System.out.println("[정렬]");
        List<String> keyList = new ArrayList<>(strMap1.keySet());
        Collections.sort(keyList);
        for (String key : keyList) {
            System.out.println("키: " + key + ", 값: " + strMap1.get(key));
        }

        // Map.Entry => {키=값} 한쌍의 자료형 형태
        for (Map.Entry<String, String> entry : strMap1.entrySet()) {
//            System.out.println(entry);
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
            System.out.println("[Entry] " + entry.getKey() + " => " + entry.getValue());
        }

        strMap1.put("kor005", "박길동");
        System.out.println(strMap1);
        // Map의 특징 중 하나로 하나의 Key에는 하나의 Value만 가능
        // 만약에 Key가 동일하게 들어간다면 Value 값은 최신 것으로 덮어쓰기 된다.
        System.out.println(strMap1.get("kor001"));

        strMap1.replace("kor005", "황길동");
        System.out.println(strMap1);

        // put은 없는 키로 변경하면 새로 추가가 되지만
        // replace는 없는 키로 변경하면 널값이 나옴

        // 특정 "키" 존재 여부
        boolean searchKeyFlag1 = strMap1.containsKey("kor001");
        System.out.println(searchKeyFlag1);

        // 특정 "값" 존재 여부
        boolean searchValueFlag2 = strMap1.containsValue("송길동");
        System.out.println(searchValueFlag2);

        // Map -> List를 하려면 Set을 경유해야함
        // Map -> Set
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>(strMap1.entrySet());
        System.out.println(entrySet1);

        // Set -> List
        List<Map.Entry<String, String>> entryList = new ArrayList<>(entrySet1);
        System.out.println(entryList);

        // Map 정렬 => 사실 불가능
        // Map은 빠른 탐색 및 검색을 위해 만들어진(설계된) 것
        // 그래서 정렬은 고려하지 않고 만듦 => 그래서 순서 보장하지 않음
        // 그럼에도 정렬하려면?
        Collections.sort(entryList, Map.Entry.comparingByKey()); // 키 기준 정렬
        System.out.println("키 기준 정렬: " + entryList);
        Collections.sort(entryList, Map.Entry.comparingByValue()); // 값 기준 정렬
        System.out.println("값 기준 정렬: " + entryList);
        Collections.sort(entryList, Map.Entry.comparingByKey(Comparator.reverseOrder())); // 키 기준 내림차순 정렬
        System.out.println("키 기준 내림차순: " + entryList);
        Collections.sort(entryList, Map.Entry.comparingByValue(Comparator.reverseOrder())); // 값 기준 내림차순 정렬
        System.out.println("값 기준 내림차순: " + entryList);


    }
}
