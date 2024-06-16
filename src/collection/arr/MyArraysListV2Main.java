package collection.arr;

public class MyArraysListV2Main {
    public static void main(String[] args) {
        MyArrayListV2<String> stringList = new MyArrayListV2<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");

        System.out.println(stringList);
        String string = stringList.get(3);
        System.out.println(string);

        MyArrayListV2<Integer> intList = new MyArrayListV2<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        System.out.println(intList);
    }
}
