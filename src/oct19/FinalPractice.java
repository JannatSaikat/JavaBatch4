package oct19;

final class FinalPractice {

    public static void main(String[] args) {
        int a = 5;
        a  =15;
        System.out.println(a);
        a = 25;

        final int b = 5;
        System.out.println(a);
        System.out.println(b);
    }

    final void m1(){
        System.out.println("m1");
    }

}
