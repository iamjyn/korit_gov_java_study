package _21_Objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    // 원래는 해시코드(참조주소)를 반환하는데,
    // 읽기 편한 방식으로 재정의해서 사용 가능하다.
    @Override
    public String toString() {
        return name + " 선생님의 " + schoolName + " 수업입니다.";
    }

    // 두 객체의 참조 주소를 비교 => 안의 값이 (논리적으로) 같은지로 바꿀 거임
    // 값 기반 비교로 오버라이드
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // 현재 비교하는 객체가 같은 메모리 주소라면 자기 자신을 비교한 것
            System.out.println("자기 자신과 비교");
            return true;
        }
        if (!(obj instanceof Teacher)) {
            return false;
        }
        Teacher t = (Teacher) obj; // 다운캐스팅
        return this.name.equals(t.name) && this.schoolName.equals(t.schoolName);
    }

    // 자바의 공식규칙: equals를 통해 같다라고 판별된 객체는 같은 해시코드를 가져야 한다.
    // => 반드시 같이 오버라이드를 해줘야 한다.
    // 하지만 hashCode를 오버라이드를 할 경우 equals 오버라이드는 필수는 아니다.
    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName); // Objects : Object를 위한 유틸성 클래스
    }




}
