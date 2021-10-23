package oct19;

public class Ford implements Car{

    @Override
    public void move() {
        System.out.println("move up to 150 m/h");
    }

    @Override
    public void stop() {
        System.out.println("quick stop");
    }

    @Override
    public void energyInput() {
        System.out.println("gas");
    }

    @Override
    public void storageArea() {
        System.out.println("enough space");
    }

    @Override
    public void airBags() {

    }

    void acControl(){
        System.out.println("can cool or heat your car");
    }

}
