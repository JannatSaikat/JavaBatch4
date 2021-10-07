package oct06;

public class PrintThings {

    public static void main(String[] args) {
        PrintThings st = new PrintThings();
        st.stateProfile();
        st.passport();


    }

    void name(){
        System.out.println("Name");
    }

    void id(){
        System.out.println("id");
    }

    void stateProfile(){
        name();
        id();
        System.out.println("state id");
    }

    void passport(){
        name();
        id();
        System.out.println("citizen id");
    }

}
