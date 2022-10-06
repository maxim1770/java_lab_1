class ListElement {
    ListElement next;
    int data;
}

class MyList {
    private ListElement head;
    private ListElement tail;

    void addFront(int data)
    {
        ListElement a = new ListElement();
        a.data = data;

        if(head == null)
        {
            head = a;
            tail = a;
        }
        else {
            a.next = head;
            head = a;
        }
    }

    void addBack(int data) {
        ListElement a = new ListElement();
        a.data = data;
        if (tail == null)
        {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    void printList()
    {
        ListElement t = this.head;
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    void delEl(int data)
    {
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        ListElement t = head;
        while (t.next != null) {
            if (t.next.data == data) {
                if(tail == t.next)
                {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }
}

public class ListTest {
    public static void main(String[] args) {
        MyList l = new MyList();
        for(int i = 0; i<=100; i++){
            l.addBack(i);
        }
        l.printList();
        l.addBack(123);
        l.addBack(123);
        l.addBack(123);
        l.addBack(123);
        l.printList();
    }
}