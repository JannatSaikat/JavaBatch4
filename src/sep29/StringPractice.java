package sep29;

public class StringPractice {


    public static void main(String[] args) {
        String s = "Hi! Sign in or register";
        int a  = 20;

//        System.out.println(s.length());
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.equals("Language"));
//        System.out.println(s.indexOf("n"));
//        System.out.println(s.lastIndexOf("a"));

        System.out.println(s.substring(4));
//        s.toCharArray(); {'L', 'a', 'n', 'g', .....}

        System.out.println(s.equals("Hi! Sign in or register"));
        boolean b = s.contains("Hi!");

        s.charAt(0);

        System.out.println("First char of s is: " + s.charAt(0));
//        s[0]; s.get(0); s.charAt(0)




    }
}
