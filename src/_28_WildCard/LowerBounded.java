package _28_WildCard;

/*
* <? super U> => 하한 경계 와일드 카드
* 하위 클래스 제한(U와 그 부모클래스들만 가능하다)
* 하한이 U
* 쓰기는 가능하나, 읽기가 안전하지 않다
* => 읽기는 Object 타입으로만 가능하다.
* */
public class LowerBounded {
    public static void putDog(Box<? super Dog> box) {
        box.setValue(new Dog());
        box.setValue(new Corgi());
//        box.setValue(new Animal());
//        Dog d = box.getValue(); // 컴파일러 에러 (Box<Object>, Box<Animal> 일지 판단불가)
        Object d = box.getValue();
        System.out.println(d);
    }
}
