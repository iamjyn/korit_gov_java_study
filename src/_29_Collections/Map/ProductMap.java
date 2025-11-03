package _29_Collections.Map;

import java.util.*;

/*
* 1. 스캐너 객체 하나 생성하고 변수명이 productMap인 hashMap 선언 (키 String, 값 Integer)
* 2. "상품 등록하기" 라고 출력하고, for문 이용, 5번 반복, 상품명(키)입력받고 가격(값) 입력받고 productMap에 넣기
* 3. 전체 상품 출력하기 => 향상된 for문 순회하면서 "- 아이폰17 => 1250000원" 으로 출력
* 4. 상품 가격 수정 => 수정할 상품명 입력받고 입력한 상품이 productMap에 있으면 수정할 가격 입력 받고,
*    없으면 "해당 상품이 없습니다" 출력 => 만약 수정 성공시 "가격이 수정되었습니다" 출력
* 5. 특정 상품 검색 => 검색할 상품명 입력받고, 입력한 상품이 있으면 출력, 없으면 "해당 상품이 없습니다" 출력
* 6. 오름차순 정렬하기 => 키 기준 정렬 후 출력
* 7. 내림차순 정렬하기 => 키 기준 내림차순 정렬 후 출력
* */
public class ProductMap {
    public static void main(String[] args) {
        Map<String, Integer> productMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("[상품등록]");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". 상품명: ");
            String name = scanner.nextLine();
            System.out.print((i + 1) + ". 가격: ");
            Integer price = scanner.nextInt();
            scanner.nextLine();
            productMap.put(name, price);
        }

        System.out.println("[전체 상품 조회]");
        for (Map.Entry<String, Integer> product : productMap.entrySet()) {
            System.out.println("- " + product.getKey() + " => " + product.getValue() + "원");
        }

//        while (true) {
//            System.out.print("수정할 상품명: ");
//            String reName = scanner.nextLine();
//            boolean searchReName = productMap.containsKey(reName);
//
//            if (!searchReName) {
//                System.out.println("해당 상품이 없습니다");
//            } else {
//                System.out.print("수정할 가격: ");
//                Integer rePrice = scanner.nextInt();
//                scanner.nextLine();
//                productMap.put(reName, rePrice);
//                break;
//            }
//        }
//        System.out.println("가격이 수정되었습니다");

        while (true) {
            System.out.print("수정할 상품명: ");
            String reName = scanner.nextLine();
            if (productMap.containsKey(reName)) {
                System.out.print("수정할 가격: ");
                Integer rePrice = scanner.nextInt();
                scanner.nextLine();
                productMap.put(reName, rePrice);
                break;
            } else {
                System.out.println("해당 상품이 없습니다");
            }
        }
        System.out.println("가격이 수정되었습니다");

        System.out.print("검색 상품: ");
        String searchName = scanner.nextLine();
        boolean searchNameResult = productMap.containsKey(searchName);
        if (searchNameResult) {
            System.out.println(searchName + " => " + productMap.get(searchName) + "원");
        } else {
            System.out.println("해당 상품이 없습니다");
        }

        List<Map.Entry<String, Integer>> productList = new ArrayList<>(productMap.entrySet());

        Collections.sort(productList, Map.Entry.comparingByKey()); // 키 기준 오름차순
        System.out.println("오름차순: " + productList);
        Collections.sort(productList, Map.Entry.comparingByKey(Comparator.reverseOrder())); // 키 기준 내림차순
        System.out.println("내림차순: " + productList);


    }
}

