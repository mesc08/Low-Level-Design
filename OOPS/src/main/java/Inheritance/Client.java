package Inheritance;

public class Client {

    public static void main(String args[]){
        Car swift = new Car();
        System.out.println(swift.getCarModel());
        swift.applyBreak();
    }

}
