public class length_looping {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        
        for(int i = 0; i < 5; i ++){
            numbers[i] *= 2;
            System.out.print(numbers[i] + " ");
            
        }
        System.out.println();
    }
}
