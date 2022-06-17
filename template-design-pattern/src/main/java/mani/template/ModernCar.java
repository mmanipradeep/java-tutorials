package mani.template;

public class ModernCar extends CarTemplate{

    public ModernCar(){
        super();
    }

    @Override
    public void fixChassis() {
        System.out.println("Assembling chassis of the Modern model");
        this.chassis = "Modern Chassis";
    }

    @Override
    public void fixBody() {
        System.out.println("Assembling body of the Modern model");
        this.body = "Modern Body";
    }

    @Override
    public void paint() {
        System.out.println("Painting body of the Modern model");
        this.paint = "Modern White Paint";
    }

    @Override
    public void fixInterior() {
        System.out.println("Setting up interior of the Modern model");
        this.interior = "Modern interior";
    }
}
