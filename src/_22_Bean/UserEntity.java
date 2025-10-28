package _22_Bean;

import java.time.LocalDateTime;

/*
* Bean
* 필드 속성들을 프로퍼티라고 하며, 해당 프로퍼티들은 private로 캡슐화가 되어 있어야 한다.
* => 그리고 캡슐화 된 프로퍼티들은 getter, setter로만 접근 가능하다.
* => getter, setter들은 모두 다 public이어야 한다.
* 데이터를 표현하는 것을 목적으로 둠
*
* Entity
* 데이터베이스의 테이블과 1:1 매핑이되는 클래스
* 자바 객체 <-> DB 테이블 간 데이터를 매핑하기 위해서 사용
*
* Entity는 왜 Bean인가?
* Bean은 일종의 가이드라인, 명세, 규칙
*
* 여기서 Entity가 Bean이 되려면 기본생성자를 사용
* */
public class UserEntity {
    private int userId;
    private String userName;
    private int age;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
    private int statusCode;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    @Override
    public String toString() {
        return "UserEntitiy(userId=" + userId + ", userName=" + userName + ", age=" + age + ", email=" + email + ")";
    }
}

