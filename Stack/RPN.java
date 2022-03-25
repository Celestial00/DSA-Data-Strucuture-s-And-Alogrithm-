package Stack;

public class RPN {
    

    public static void RPN(String[] Ex){

        Stack s = new Stack();

        for(String i : Ex){

            if(isAnOperator("" + i)){

                Double x = Double.parseDouble((String)s.pop());
                Double y = Double.parseDouble((String)s.pop());
                Double z = evalute(x, y, i);
                String a = z.toString();

                s.push(a);
 


            }
            else{


                s.push(i);


            }

        }
     

    }

    public static boolean isAnOperator(String op){

        return (op.length() == 1 && "ASMD".contains(op));

    }

    public static double evalute(double x, double y, String op){

        Double z = null;

        switch(op){

            case "A":
            z = x + y;
            break;

            case "S":
            z = x - y;
            break;

            case "M":
            z = x * y;
            break;

            case "D":
            z = x / y;
            break;



        }

        System.out.println(x + " " + op + " " + y + " = " + z);

        return z;

    }

    public static void main(String[] args) {
        
        
        String[] Ex = { "2", "4", "D", "3", "4", "M", "A" };

        RPN(Ex);

    }



}
