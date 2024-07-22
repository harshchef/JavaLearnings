

interface notification{
    void sendNodtifaction();

}

class Emailnotif implements notification{
    public void sendNodtifaction(){
        System.out.println("Email NOtification");
    }

}

class SmsNotif implements notification{
    public void sendNodtifaction(){
        System.out.println("SMS NOtification");
    }
}



interface notiffactory{
    notification createnotif();

}

class SMSfactory implements notiffactory{
    public notification createnotif(){
       return new SmsNotif();

    }
}


class Emailfactory implements notiffactory{
    public notification createnotif(){
       return new Emailnotif();

    }
}

public class abstractfactory{
    public static void main(String args[])
    {
        notiffactory s=new SMSfactory();
       
       
        
        
    }
}
