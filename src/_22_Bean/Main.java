package _22_Bean;

public class Main {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUserName("홍길동");
        userEntity.setAge(22);
        userEntity.setEmail("gildong@naver.com");
        System.out.println(userEntity);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(2);
        userEntityLombok.setUserName("홍길동");
        userEntityLombok.setAge(22);
        userEntityLombok.setEmail("abc@naver.com");
        System.out.println(userEntityLombok);

        /*
        * Lombok
        * 자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
        * 코드 다이어트를 위함
        * getter, setter, toString, 생성자, Builder
        *
        * 자바
        * .java 소스코드 => 컴파일(.class 파일 형식으로 변환)
        * .class 바이트코드로 이루어짐 => JVM에 전달 => 실행
        *
        * => (위의 과정을) 빌드
        * 빌드를 도와주는 빌더 종류 : maven, gradle
        * => 빌드를 전체적으로 효율적이고 자동화해주기 위한 외부 빌더 시스템
        * */

    }
}
