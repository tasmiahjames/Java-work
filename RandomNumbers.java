import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        //random.nextInt()
        //random.nextDouble()
        //random.nextBoolean()
  
        Random random = new Random();
        
        int x = random.nextInt(6)+1;
        //double y = random.nextDouble();
        //boolean z = random.nextBoolean();
        
        System.out.println(x);
          
       }
}
