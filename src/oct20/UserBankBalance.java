package oct20;



import java.util.*;

public class UserBankBalance {



    public static void main(String[] args) {
        ArrayList<String> user = new ArrayList<>();
        HashMap<String, Double> userNbalance = new HashMap<>();

        user.add("a");
        user.add("b");
        user.add("c");
        for(String a : user){
            System.out.println(a);
        }

        userNbalance.put("a", 25.53);
        userNbalance.put("b", 28.50);
        userNbalance.put("c", 19.18);
        userNbalance.put("d", 23.12);
        for(String x : userNbalance.keySet()){
            System.out.print(x + " = ");
            System.out.println(userNbalance.get(x));
        }


    }




}
