package genegic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<String> box1 = new GenericBox<>();
        box1.set("타입 안정성 굿");
        String value = box1.get();
        System.out.println(value);

        GenericBox<Integer> box2 = new GenericBox<>();
        box2.set(111);
        Integer value2 = box2.get();
        System.out.println(value2);

        GenericBox<Double> box3 = new GenericBox<>();
        box3.set(1.1);
        Double value3 = box3.get();
        System.out.println(value3);
    }
}
