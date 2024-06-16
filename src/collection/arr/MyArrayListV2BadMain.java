package collection.arr;

public class MyArrayListV2BadMain {
    public static void main(String[] args) {
        MyArrayListV1 numList = new MyArrayListV1();

        numList.add(1);
        numList.add(2);
        numList.add("문자3");
        System.out.println(numList);

        Integer num1 = (Integer) numList.get(0);
        Integer num2 = (Integer) numList.get(1);

        // 예외 발생!!
        Integer num3 = (Integer) numList.get(2);
    }
}
