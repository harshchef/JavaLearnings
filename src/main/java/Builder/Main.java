package Builder;
public class Main {
    public static void main(String[] args) {
        // Using PhoneBuilder to create a Phone object
        Phone phone = new PhoneBuilder()
                .setOs("Android")
                .setRam(8)
                .setProcessor("Snapdragon 888")
//                .setScreenSize(6.7)
//                .setBattery(5000)
                .getPhone();

        System.out.println(phone);
    }
}
