import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vehicle implements  Comparable<Vehicle>{

    @Override
    public int compareTo(Vehicle vehicle) {
        return this.getYear().compareTo(vehicle.getYear());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }


    int code;
    String model;
    String year;

    public Vehicle(int code, String model, String year) {
        this.code = code;
        this.model = model;
        this.year = year;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(new Vehicle(567,"Civic","2019"),
                new Vehicle(22,"Civic","2006"));
        Collections.sort(vehicles);
        System.out.println(vehicles);

        //Lambda Expression
        vehicles.sort((v1,v2)-> v1.getYear().compareTo(v2.getYear()));

        // Method references
        vehicles.sort(Comparator.comparing(Vehicle::getYear).reversed()
                .thenComparing(Vehicle::getYear));

    }
}
