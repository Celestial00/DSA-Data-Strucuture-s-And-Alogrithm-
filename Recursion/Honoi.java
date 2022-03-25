public class Honoi{



    public  static void Honoi(int n, char s, char d, char  a){

        if(n == 1){

            System.out.println("from " + s + "->" + d);
            return;

        }

       Honoi(n-1, s, a, d);
       System.out.println(s + " ->" + d);
     



    }

    public static int rec(int n, char[] a){

        if(n == 3){

            return 0;

        }

        System.out.println(a[n]);
        rec(n+1, a);

        return n;

    }




    public static void main(String[] args) {
        

        Honoi(3,'A','C','B');
      
        
    }


}