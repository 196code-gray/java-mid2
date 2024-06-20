package genegic.ex1;

public class BoxMain {
    public static void main(String[] args) {
        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        System.out.println(stringBox.get());

        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        System.out.println(integerBox.get());
    }
}
