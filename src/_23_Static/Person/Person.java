package _23_Static.Person;

import _23_Static.Student.Student;

public class Person {
    public static int population = 0;
    // 객체 수준에서의 상수 (객체 수준에서 변경할 수 없는 상수)
    final String COUNTRY1 = "korea";
    // 클래스 전체에서 하나뿐인 상수
    static final String COUNTRY2 = "US";
    final Student STUDENT = new Student();

    public Person() {
        population++;
    }

    public static void showPopulation() {
        System.out.println("인구 수: " + population);
        // showPopulation() 메소드는 객체가 없어도 호출이 가능한 메소드인데
        // 안에서 쓰는 population 필드가 static이 아니라면 접근할 수 없음
        // => 둘다 static이어야 함
    }
}

