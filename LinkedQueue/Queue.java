package LinkedQueue;

public class Queue{


    Node head = new Node();
    int size;

    class Node{


        Node next;
        Node prev;
        Object data;


        Node(){

            next = this;
            prev = this;
            data = this;

        }

        Node(Object data, Node prev, Node next){


            this.data = data;
            this.prev = prev;
            this.next = next;
    

        }


    }



    public void add(Object o){

        head.prev = head.prev.next = new Node(o,head.prev,head);
        size++;

    }

    public Node remove(Node head, Object data){

        

        if(head.next.data == data){

            head.next = head.next.next;

        }

        Node i = head.next;

        while(i.next != null){

            if(i.next.data == data){

                i.next = i.next.next;
                break;

            }

            i = i.next;

        }

        return head;
        

    }

    public void removeFirst(){

        head.next = head.next.next;
        size--;

    }

    public boolean contains(Node head, Object o){

        Node i = head.next;

        while(i != head){

            if(o.equals(i.data)){

                return true;

            }

            i = i.next;

        }

        return false;

    }

    public Node AddinMid(Node head, Object o){

        int mid = size/2;
        int j = 0;
        Node i = head.next;

        
        while(i != head){

            if(j == mid){

                i.next = new Node(o,i,i.next);
                break;

            }

            j++;
            i = i.next;

        }

        return head;
        


    }

    public void merge(Node head1, Node head2){


        head1.prev.next = head2.next;
        head2.next.prev = head1.prev;
        head2.prev.next = head1;
        head1.prev = head2.prev;



    }

    public String toString(){


        String st = "[";

        for(Node i = head.next; i != head; i = i.next){

            st += " " + i.data;

        }

        return st + " ]";

    }

    public static void main(String[] args) {
        
        Queue q = new Queue();

         q.add(1);
         q.add(2);
         q.add(3);
     

        Queue q2 = new Queue();

        q2.add(4);
        q2.add(5);
        q2.add(6);

         System.out.println(q);
         
        //  q.remove(q.head, 3);

        //  System.out.println(q);

        //  q.removeFirst();

        //  System.out.println(q);

         System.out.println(q.contains(q.head, 2));

        //  q.AddinMid(q.head, 6);

        //  System.out.println(q);

        q.merge(q.head, q2.head);

        System.out.println(q);


    }

}