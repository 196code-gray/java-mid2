package collection.arr;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("==데이터 추가==");
        System.out.println(list);

        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("a");
        System.out.println(list);

        System.out.println("== 기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('a') = " + list.indexOf("a"));
        System.out.println("list.set(2, 'z') = " + list.set(2, "z"));

        list.add("c");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        MyArrayListV1 list2 = new MyArrayListV1(2);
        list2.add(1);
        list2.add(2);
        System.out.println(list2);
        list2.add(3);
        System.out.println(list2);
        list2.add(4);
        System.out.println(list2);
        list2.add(5);
        System.out.println(list2);

        list.add(3, "addList");
        System.out.println(list);
        list.add(0, "addFirst");
        System.out.println(list);

        System.out.println(list.remove(4));
        System.out.println(list);

        System.out.println(list2.remove(4));
        System.out.println(list2);

        list2.add(3, 1000);
        System.out.println(list2);
    }
}
