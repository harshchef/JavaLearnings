package Singelton;

import java.util.Scanner;

public class Car {
    private static Car instance=null;

    private Car(){

    }
    public static Car getInstance()
    {
        if(instance==null)
                instance=new Car();
        return instance;
    }
    public String getSpec()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Speed");
        String z=sc.nextLine();
        return  z;
    }
    public String getColor(String c)
    {
       return c;
    }
    public void Cartype()
    {
        System.out.println(" Car is SUV type");
    }
}
