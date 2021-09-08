package sep07;

public class SocialWelfare {

    public static void main(String[] args) {
        // age has to be less than 18 or has to be more than 59.5
        //18-28
        // || this is OR
        double age = 79;

        if(age < 18 || age > 59.5) {
            System.out.println("Eligible for social welfare");
        }
        else {
            System.out.println("You're not eligible");
        }
    }
}
