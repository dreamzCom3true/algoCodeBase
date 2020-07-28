public class ReverseList {
    public static listNode reverse(listNode head){
        if(head == null || head.next == null){
            return  head;
        }
        listNode curr = head;
        listNode prev = null;
        while (curr != null){
            listNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(4);
        head.next.next.next.next = new listNode(5);
        printList(head);
        listNode reverse = reverse(head);
        printList(reverse);
    }

    public static void printList(listNode head){
        listNode curr = head;
        while (curr != null){
            System.out.print(curr.data);
            if(curr.next != null)
                System.out.print("->");
            curr = curr.next;
        }
        System.out.println();
    }
}
