package collection.link;

public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add(Object e){
        Node newNode = new Node(e);
        if (first == null)
            first = newNode;
        else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    // 첫번째에 노드 추가
    public void firstAdd(Object e){
        Node newNode = new Node(e);
        newNode.next = first;
        first = newNode;
        size++;
    }

    // 중간에 추가
    public void add(int index, Object e){
        Node newNode = new Node(e);
        Node prev = getNode(index - 1);
        prev.next = newNode;

        size++;
    }

    public Object firstRemove(){
        Object removeNode = first.item;
        first = first.next;

        size--;
        return removeNode;
    }

    private Node getLastNode(){
        Node x = first;
        while (x.next != null)
            x = x.next;
        return x;
    }

    // 특정 위치의 데이터를 변경, 기존값 반환
    public Object set(int index, Object element){
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    // 특정 위치 데이터 조회
    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++)
            x = x.next;

        return x;
    }

    // 몇번째 index인지 찾아서 반환
    public int indexOf(Object o){
        int index = 0;

        for (Node x = first; x != null; x = x.next){
            if (o.equals(x.item))
                return index;
            index++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
