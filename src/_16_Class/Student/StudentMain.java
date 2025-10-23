package _16_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 22, "hong@naver.com", "조선시대");
        student.showInfo();

        student.setName("김길동");
        student.showInfo();

        System.out.println(student.getAddress());

    }
}
