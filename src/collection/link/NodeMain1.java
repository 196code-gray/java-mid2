package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기
        Node first = new Node("A");
        first.next = new Node("B"); // 참조값을 연결.
        first.next.next = new Node("C"); // B 노드에서 C 노드의 참조값을 넣어줌.

        System.out.println("모든 노드 탐색");
        System.out.println(first.item);
        System.out.println(first.next.item);
        System.out.println(first.next.next.item);

        // 반복문 버전
        Node x = first;
        while( x != null){
            System.out.println(x.item);
            x = x.next;
        }

        System.out.println("연결 노드 출력");
        System.out.println(first);

        // 마지막 노드 출력
        System.out.println(getLastNode(first));

        // 특정 노드 출력
        int index = 1;
        System.out.println(getNode(first, index));

        // 데이터 추가하기
        add(first, "D");
        System.out.println(first);
    }

    private static void add(Node first, Object s) {
        Node node = getLastNode(first);
        node.next = new Node(s);
    }

    static public Node getLastNode(Node node){
        Node x = node;
        while (x != null) {
            if (x.next == null)
                return x;
            x = x.next;
        }
        return null;
    };

    private static Node getNode(Node node, int index){
        Node x = node;
        for (int i = 0; i < index; i++)
            x = x.next;

        return x;
    }

}
