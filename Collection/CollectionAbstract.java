package Collection;

public abstract class CollectionAbstract implements Collection {
 

    CollectionAbstract(){}

    @Override
    public boolean add(Object o) {
        
        return false;
    }

    @Override
    public boolean contains(Object o) {

        
        Iterator it = iterator();

        if(o == null){

            while(it.hasNext()){

                if(it.Next() == null){

                    return true;

                }

            }

        }

        else{


            while(it.hasNext()){


                if(o.equals(it.Next())){

                    return true;


                }


            }


        }

        return false;

    }

    @Override
    public boolean remove(Object o) {
       
        Iterator it = iterator();

        if(o == null){

            while(it.hasNext()){

                if(it.Next() == null){

                    it.remove();
                    return true;

                }

            }

        }

        else{


            while(it.hasNext()){


                if(o.equals(it.Next())){

                    it.remove();
                    return true;


                }


            }


        }

        return false;

    }


    @Override
    public void clear() {
        
        for(Iterator it = iterator(); it.hasNext();){

            it.Next();
            it.remove();

        }

        
    }

    public String toString(){

        Iterator it = iterator();

        StringBuffer st = new StringBuffer("[");


        while(it.hasNext()){

            st.append(" " + it.Next());

        }

        return st + " ]";

    }

    @Override
    public abstract Iterator iterator();


    @Override
    public boolean isEmpty() {

        return false;
    }

    @Override
    public int size() {

        return 0;
    }

    


    
}
