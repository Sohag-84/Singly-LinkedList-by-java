package Data_structure;

public class Node {
    int value;
    Node next;
    
    Node(int value,Node next){
        this.value = value;
        this.next = next;
    }
    Node(int value){
        this.value = value;
    }
    
    Node addFirst(Node prev_head,int value){
        Node temp = new Node(value);
        temp.next = prev_head;
        return temp;
    }
    void addMiddle(Node cur ,int value,int pos){
        Node temp = new Node(value);
        for (int i = 0; i < pos-1; i++) {
            if (cur !=null) {
                cur = cur.next;
            }
        }
        temp.next = cur.next;
        cur.next = temp;
    }
    void addLast(Node cur,int value){
        Node temp = new Node(value);
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = temp;
    }
    void delete(Node cur, int pos){
        for (int i = 0; i < pos-1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }
    void traverse(Node cur){
        while (cur != null) {
            System.out.print(cur.value+" ");
            cur = cur.next;
        }
        System.out.println("");
    }
    
}
