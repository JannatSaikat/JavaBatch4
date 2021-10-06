package oct05;

public class Print1to50but45 {

    public static void main(String[] args) {
        Print1to50but45 ob = new Print1to50but45();
        ob.printLoop();
    }

    void printLoop(){

        int a  = 0;

       while( a  <= 50 ) {

           if(a == 45) {
               a++;
               continue;
           }
           System.out.println(a);
           a++;
       }


    }
}
