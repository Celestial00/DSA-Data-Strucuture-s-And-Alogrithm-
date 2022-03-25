package Stack;

public class Stack {
    

    Node top;
    int size = 0;


    public class Node{

        Node next;
        Object data;

        public Node(Object data, Node next){

            this.data = data;
            this.next = next;

        }


    }


    public void push(Object o){

        top = new Node(o,top);
        size++;

    }

    public Object peek(){

        return top.data;

    }

    public Object pop(){


        Object temp = top.data;
        top = top.next;
        size--;

        return temp;


    }


    public boolean isEmpty(){

        return size == 0;

    }

    public String toString(){

        Node i = top;

        StringBuffer st = new StringBuffer("[ ");

        while(i != null){

            st.append(i.data);
            i = i.next;

        }

        return st + "]";
    }

    public static void main(String[] args) {
        

        

    }

}
