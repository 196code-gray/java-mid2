package collection.arr;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        // 배열 첫번째 위치에 3 데이터 추가
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        // 배열 index 위치에 4 데이터 추가
        int value = 4;
        int idx = 2;
        addAtIndex(arr, idx, value);
        System.out.println(Arrays.toString(arr));

        // 배열 마지막 위치에 5 데이터 추가
        arr[arr.length -1] = 5;
        System.out.println(Arrays.toString(arr));
    }

    private static void addAtIndex(int[] arr, int idx, int value) {
        for (int i = arr.length -1; i > idx; i--)
            arr[i] = arr[i -1];
        arr[idx] = value;
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length -1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }
}
