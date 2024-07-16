package Singelton;

public class CarRunner {
    public static void main(String[] args) {
        Car a=Car.getInstance();
        Car b=Car.getInstance();

        a.Cartype();
        b.Cartype();

        System.out.println(a.getColor("Red"));
        System.out.println(b.getColor("Black"));


        System.out.println("The speed is"+b.getSpec());
        System.out.println("The speed is"+a.getSpec());

       if(a==b)
            System.out.println("It is Singelton, only one instance");
       else
            System.out.println("Different Object");
    }
}
