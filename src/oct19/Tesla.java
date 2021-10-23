package oct19;

public class Tesla implements Car{

    @Override
    public void move() {
        System.out.println("Speed up to 260m/h");
    }

    @Override
    public void stop() {

        System.out.println("Stops in 0.02 sec");

    }

    @Override
    public void energyInput() {

        System.out.println("Electric car");
    }

    @Override
    public void storageArea() {

        System.out.println("Storage");

    }

    @Override
    public void airBags() {

    }

    void entertainment() {
        System.out.println("Gaming");
    }

    void acControl(){
        System.out.println("AC control");
    }

    void safetyDriving(){
        System.out.println("some safety measure");
    }
}
