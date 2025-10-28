package _17_Inheritance.Message;

/*
* Message라는 클래스생성
* 속성: String text
* 생성자: Allargs
*
* 메소드 String 반환 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
* ===> return "[MSG] ";
*
* 메소드 String 반환 format() => 모두 접근 가능
* ===> return 접두사로 "[MSG] "가 붙고 뒤에는 메시지 텍스트가 붙어서
*
* 메소드 void print() => 모두 접근 가능
* ===> format()을 호출한 값 출력
* */
public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    protected String makePreFix() {
        return "[MSG] ";
    }

    public String format() {
        return makePreFix() + text;
    }

    public void print() {
        System.out.println(format());
    }

}
