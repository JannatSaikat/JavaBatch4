package sep08;

public class RangeConfusion {

    public static void main(String[] args) {

        // 100 -  5% discount
        // 100 more - less than 200 10%
        // 200 more - less than 300 15%
        // 300 or more 20%

        double price = 36434.00;

        if(price == 100) {
            System.out.println(price - (price * 0.05));
        } else if(price > 100 && price < 200) {
            System.out.println(price - (price * 0.10));
        } else if(price >= 200 && price <300) {
            System.out.println(price - (price * 0.15));
        } else if( price >= 300) {
            System.out.println(price - (price * 0.20));
        } else {
            System.out.println("Not eligible for discount");
        }





    }
}
