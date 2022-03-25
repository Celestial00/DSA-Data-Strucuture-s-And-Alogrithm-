

public class ArrayQueue extends LinkedQueue {
    
    Object[] a;
    int size;

    ArrayQueue(int capacity){

        a = new Object[capacity];
        size = 0;
    

    }

    public void add(Object o){


        if(size == a.length){

            throw new IllegalAccessError();

        }

        a[size++] = o;


    }

    public Object Remove(){

        int i = 0;
        Object temp = a[i];

        while(i != a.length-1 ){

            a[i] = a[++i]; 

        }

        return temp;

    }

    public void display(){


        for(int i =0 ;i < a.length; i++){

            if(a[i] != null){

            System.out.println(a[i]);

            }

            else{
                continue;
            }

        }

    }

    public Node toLinkedQueue(){

        Node e = new Node(a[0]);

        Node i = e;

        int j = 1;

        while( j != a.length-1){

            i.next = new Node(a[j]);
            i = i.next;
            j++;

        }

        return e;


    }

    public static void main(String[] args) {
        

        ArrayQueue a = new ArrayQueue(5);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        a.display();

        System.out.println("----- remove first-----");

        a.Remove();
    
        a.display();

        System.out.println("----- to linkQueue ------");

       LinkedQueue j = new LinkedQueue();

       Node k = a.toLinkedQueue();

       for(Node i = k; k != null; k = k.next){

        System.out.println(k.data);

       }
       

    }

}
