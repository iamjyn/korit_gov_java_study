package _20_Casting.Shape;

/*
* render() => protected preDraw(), drawInternal(), postDraw(); 호출
* preDraw() => 출력(그리기 준비)
* postDraw() => 출력(그리기 마무리)
*
* 추상 메소드
* area() => double, drawInternal() => void
* */
public abstract class Shape {
    // 꼭 구현해야하는 메소드 => 각 도형마다 넓이 공식, 그리기 방법 등 구현
    public abstract double area();
    protected abstract void drawInternal();

    // 모든 도형에서 공통으로 사용하는 메소드
    protected void preDraw() {
        System.out.println("그리기 준비");
    }
    protected void postDraw() {
        System.out.println("그리기 마무리");
    }

    void render() {
        preDraw(); // 공통적으로 준비 단계
        drawInternal(); // 그리기 단계 - 자식이 구현
        postDraw(); // 공통적으로 마무리 단계
    }
}
