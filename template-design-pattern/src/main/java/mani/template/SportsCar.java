package mani.template;

public class SportsCar extends CarTemplate{

    public SportsCar(){
      //  super();
    }



    @Override
    public void fixChassis() {
        System.out.println("Assembling chassis of the SportsCar model");
        this.chassis = "SportsCar Chassis";
    }

    @Override
    public void fixBody() {
        System.out.println("Assembling body of the SportsCar model");
        this.body = "SportsCar Body";
    }

    @Override
    public void paint() {
        System.out.println("Painting body of the SportsCar model");
        this.paint = "SportsCar White Paint";
    }

    @Override
    public void fixInterior() {
        System.out.println("Setting up interior of the SportsCar model");
        this.interior = "SportsCar interior";
    }
}
