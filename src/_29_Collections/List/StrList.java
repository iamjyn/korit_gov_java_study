package _29_Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrList {
    // collection
    // 여러 객체를 모아놓는 것

    // List - 순서가 있는 데이터의 집합, 중복된 요소를 허락한다.

    public static void main(String[] args) {
//        List<String> strList1 = new ArrayList<>();
//
//        // 요소 추가
//        strList1.add("A");
//        strList1.add("B");
//        strList1.add("A"); // 중복 허용

        List<String> strList1 = new ArrayList<>(Arrays.asList("A", "B", "A")); // 리스트 선언과 추가를 동시에
        List<String> strList2 = new ArrayList<>();
        strList2.add("java");
        strList2.add("python");
        strList2.add("C#");
        strList2.add("javascript");
        strList2.add("kotlin");

//        String[] strArray = new String[2];
//        strArray[0] = "길동";
//        strArray[1] = "홍길동";
//        System.out.println(strArray[1]);
//        System.out.println(Arrays.toString(strArray));

        // 일반 배열과는 다르게 인덱스 값에 접근할 때 get을 써줘야함

        System.out.println(strList2.get(3));
        System.out.println(strList2);

        // 특정 요소의 포함 여부 -> contains()
        String searchElem1 = "python";
        boolean containResult1 = strList2.contains(searchElem1);
        System.out.println(searchElem1 + "의 포함 여부: " + containResult1);

        String searchElem2 = "py";
        boolean containResult2 = strList2.contains(searchElem2);
        System.out.println(searchElem2 + "의 포함 여부: " + containResult2);

        String email = "example@naver.com";
        boolean containResult3 = email.contains("@"); // 문자열도 배열이라서 가능함
        System.out.println("@의 포함 여부: " + containResult3);

        // 요소 삭제
        String removeElem1 = "kotlin";
        boolean removeResult1 = strList2.remove(removeElem1);
        System.out.println(removeElem1 + "의 삭제 여부: " + removeResult1);

        // 오름차순 정렬
        Collections.sort(strList2);
//        strList2.sort();
        System.out.println(strList2);

        // 내림차순 정렬
//        Collections.sort(strList2, Collections.reverseOrder());
        strList2.sort(Collections.reverseOrder());
        System.out.println(strList2);

        // List의 길이: size()
        System.out.println(strList2.size());

        List<String> strResult = new ArrayList<>();
        for (String str : strList2) {
            String result = str + "언어";
            strResult.add(result);
        }
        System.out.println(strResult);

//        List<String> strResult = new ArrayList<>();
//        for (int i = 0; i < strList2.size(); i++) {
//            String result = strList2.get(i) + "언어";
//            strResult.add(result);
//        }
//        System.out.println(strResult);
    }
}
