package oct19;

public class TeslaDriverlessCar extends Tesla{

    void autoDriving() {
        System.out.println("must drive without drivers");
    }

    @Override
    void safetyDriving() {
        System.out.println("stops when human or any object comes in front");
        System.out.println("have to maintain lane");
        System.out.println("have to have artificial vision");
    }

}
