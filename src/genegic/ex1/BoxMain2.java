package genegic.ex1;

public class BoxMain2 {
    /*
    아까 StringBox나 IntegerBox의 경우 잘못된 type을 넣으면 바로 컴파일이 잡아줌. = 타입 안정성 높음
    다만 type별로 class를 만들어야하는 비효율적 중복 코드 발생
    이번에는 Object type으로 코드를 재사용하게 작성.
    다만 모든 type이 가능하므로 타입 안정성이 없어짐.
     */
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(1);
        Integer value = (Integer) integerBox.get();
        System.out.println(value);

        integerBox.set("문자 실수");
        Integer value2 = (Integer) integerBox.get();
        System.out.println(value2); // 예외 발생!!
    }
}
