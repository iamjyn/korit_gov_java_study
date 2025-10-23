package _16_Class.Student;

public class Student {
    private String name;
    private int age;
    private String email;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("[정보출력]");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일: " + email);
        System.out.println("주소: " + address);
    }

    // Student라는 패키지 안에 Student와 StudentMain 만들고
    // 속성 -> 이름, 나이, 이메일, 주소
    // 메소드 -> showInfo()로 정보 출력
    // StudentMain에서 객체 생성 후 정보 대입, showInfo()메소드를 통해 정보출력


}
