package Collection;

import javax.management.RuntimeErrorException;

public class LinkCollection extends CollectionAbstract{
    

    Node head = new Node();
    int size;


    public class Node{


        Node next;
        Node prev;
        Object data;


        Node(){

            next = this;
            prev = this;


        }

        Node(Object data, Node next, Node prev){

            this.data = data;
            this.next = next;
            this.prev = prev;

        }


    }

    public boolean add(Object o){

        head.prev = head.prev.next = new Node(o,head,head.prev);
        size++;
        return true;

    }

    public boolean isEmpty(){

        return size == 0;

    }

    public int size(){

        return size;

    }

    @Override
    public Iterator iterator() {
       
        return new Iterator() {
        
            
            Node cursor = head.next;
            boolean Ok = false;

            @Override
            public boolean hasNext() {
            
                return cursor != head;
            }

            @Override
            public Object Next() {
                

                Object temp = cursor.data;
                cursor = cursor.next;
                return temp;
                
            }
            @Override
            public void remove() {
                
                cursor.prev = cursor.prev.prev;
                cursor.prev.next = cursor;
                size--;
                Ok = false;

    

            }


            


        };


    }

    

    public static void main(String[] args) {
        
        LinkCollection l = new LinkCollection();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        
      l.remove(3);

      System.out.println(l);

    }


}
