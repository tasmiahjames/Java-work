public class ArrayOfObjects {
    
    public static void main(String[] args){

        //Food[] refridgerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        Food[] refridgerator = {
            food1, food2, food3
        };

        //refridgerator[0] = food1;
        //refridgerator[1] = food2;
        //refridgerator[2] = food3;

        System.out.println(refridgerator[0].name);
        System.out.println(refridgerator[1].name);
        System.out.println(refridgerator[2].name);
    }
}
