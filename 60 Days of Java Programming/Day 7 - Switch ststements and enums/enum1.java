public class enum1{
    public enum CoffeeSize{
        SMALL, MEDIUM, LARGE, VENTI
    }
    public static void main(String args[]){
        CoffeeSize size = CoffeeSize.LARGE;
        double price;
        switch(size){
            case SMALL:
                price = 2.50;
                break;
            case MEDIUM:
                price = 3.50;
                break;
            case LARGE:
                price = 4.00;
                break;
            case VENTI:
                price = 5.00;
                break;
            default:
                price = 349.69;
                break;
        }
        System.out.printf("Your total is: %.2f$",price);
    }
}
