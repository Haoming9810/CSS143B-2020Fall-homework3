package Problem2;

// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        if(list == null) {
            return;
        }
        ListNode p1 = new ListNode();
        head=p1;
        ListNode p2 = list.head.next;
        while (p2 != null){
            p1.next = new ListNode(p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }
        size = list.size;
// homework
    }

    public int removeAll(int valueToRemove) {
        ListNode p1 = new ListNode();
        p1.next = head;
        ListNode p = p1;
        while(p.next != null){
            if(p.next.val == valueToRemove){
                ListNode next = p.next;
                p.next = next.next;
            }else{
                p = p.next;
            }
        }

        return valueToRemove;

    }

    // reverse the linked list nodes iteratively (no recursion)
    public ListNode reverse() {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode listToDo = head.next;
        ListNode reversedList = head;

        reversedList.next = null;

        while (listToDo != null) {
            ListNode temp = listToDo;
            listToDo = listToDo.next;

            temp.next = reversedList;
            reversedList = temp;
        }

        return reversedList;
    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
