package Class;

class cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrte(){
        System.out.println("Vibrating.....");
    }
}

public class pro_03 {
    public static void main(String[] args) {
cellphone cpho1 = new cellphone();
        cpho1.ring();
        cpho1.vibrte();

    }
}
