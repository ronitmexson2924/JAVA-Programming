public class computer extends device {
    int ram;
    int storage;

    public computer(String brand, String model, int ram, int storage){
        super(brand,mode);
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Ram " + ram);
        System.out.println("Storage " + storage);
    }
