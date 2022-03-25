


public class Node{


    Node next;
    Object data;

    Node(){

    

    }


    public Node(Object data){

        this.data = data;

    }

    public void insert(Node list, Object data){

        

        if(list == null){

           
           

        }

        else{

            Node p = list;

            while(p.next != null){

                p = p.next;

            }

            p.next = new Node(data);

        }

    }

    public void display(Node d){

        Node p = d;

        while(p != null){

            System.out.println(p.data);

            p = p.next;

        }

    }

    public void Rec(Node list){

     Node i = list;

        if(i.next == null){

            System.out.println(i.data);

        }

        System.out.println(i.data);

        Rec(i = i.next);
       


    }

    public Node rev(Node list){

        Node p = list;

        if(p.next.next == null || p == null){

            p.next.next = p.next;
            return list;

        }

        System.out.println(p.data);

        return rev(p.next);
      


    }

    public static void main(String[] args) {
        

        Node list = new Node(); 

        list.insert(list, 1);
        list.insert(list, 1);
        list.insert(list, 1);
        list.insert(list, 4);

       Node k = list.rev(list);

       k.display(k);



    }

}