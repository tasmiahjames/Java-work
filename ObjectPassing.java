public class ObjectPassing {
    
    public static void main(String[] args){
        
        Garage garage = new Garage();
        CarObjectPassing car1 = new CarObjectPassing("BMW");
        CarObjectPassing car2 = new CarObjectPassing("Tesla");

        garage.park(car1);
        garage.park(car2);
        
    }
}
