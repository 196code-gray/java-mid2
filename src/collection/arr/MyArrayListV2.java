package collection.arr;

import java.util.Arrays;

/*
제네릭 도입.version
재사용성 up & 타입 안정성 good

항상 같은 type이 들어간다는 보장이 있다.
 */
public class MyArrayListV2<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(E e){
        if (size == elementData.length)
            grow();
        elementData[size] = e;
        size++;
    }

    // index 위치에 원하는 데이터 넣기
    public void add(int index, E e){
        if (size == elementData.length)
            grow();
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = elementData.length -1; i > index; i--) {
            elementData[i] = elementData[i -1];
        }
    }

    // 배열의 크기를 증가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    // index에 해당하는 값 조회
    @SuppressWarnings(("unchecked")) // 경고를 무시하겠다는 의미
    public E get(int index) {
        return (E) elementData[index];
    }

    // index에 값 변경
    public E set(int index, Object element){
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public E remove(int index){
        E oldValue = get(index);

        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size -1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i]))
                return i;
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(
                Arrays.copyOf(elementData, size)) + "size = " + size + ", capacity = " + elementData.length;
    }
}
