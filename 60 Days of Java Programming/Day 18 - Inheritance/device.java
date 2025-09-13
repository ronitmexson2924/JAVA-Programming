public class device {
    String brand;
    String model;

    device(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo(){
        System.out.println("Brand " + brand);
        System.out.println("Model " + model);
    }
}
