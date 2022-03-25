



public class Rec {
    

    public static void fib(int n, int i, int in, int nt){

        
        if(n == 0){

            


        }

        else{

            fib(n-1,i=in, in=nt,nt=i+in);

            System.out.println(i + "," + in  + "," + nt);


        }


    }


    public static void main(String[] args) {
        

        fib(8, 0, 1, 0);
    }


}
