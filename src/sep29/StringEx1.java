package sep29;

public class StringEx1 {

    public static void main(String[] args) {

        String a = "Java was originally developed Microsystems' Java platform.";
        String[] words = a.split(" ");

        a.contains("55");

        // {"Java" , "was", "originally", "developed"}

        System.out.println(words.length);

        for(String i : words) {
            System.out.println(i);
        }
    }
}
