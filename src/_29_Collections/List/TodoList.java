package _29_Collections.List;

import java.util.*;

public class TodoList {
    /*
     * 문제) TodoList (클래스)
     * 1. todoList를 담을 리스트 생성
     * 2. 사용자한테 투두를 입력 받음, 몇개 입력할 건지 count변수에 입력받기
     * 3. count 만큼 반복해서 사용자에게 투두 입력받아 리스트에 추가
     * 4. 그 다음에 향상된 for문 사용해서 할일 목록 출력
     * 5. 목록 출력 뒤 특정 투두를 포함여부를 확인하기 위해서 searchTodo라는 변수에 찾을 투두 입력받기
     *      그리고 포함여부 확인 후 여부 출력
     * 6. 포함 여부 확인 후 삭제할 투두를 입력받아 삭제하기
     * 7. 투두들을 오름차순 정렬 후 전체 출력
     * 8. 투두들을 내림차순 정렬 후 전체 출력
     * 9. 전체 투두들의 객수 출력하기
     * */

    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Todo 갯수 입력 >>> ");
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 Todo 입력 >>> ");
            todoList.add(scanner.nextLine());
        }

        System.out.println("[할일 목록]");
        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

        System.out.print("삭제할 Todo 입력 >>> ");
        String searchTodo = scanner.nextLine();
        boolean containsResult = todoList.contains(searchTodo);
        System.out.println(searchTodo + "의 포함 여부: " + containsResult);
        todoList.remove(searchTodo);

        Collections.sort(todoList);
        System.out.println(todoList);

        todoList.sort(Collections.reverseOrder());
        System.out.println(todoList);

        System.out.println("전체 투두 갯수: " + todoList.size());

        scanner.close();
    }
}
