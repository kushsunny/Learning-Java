package Class;

class Tommy{
    public void hit(){
        System.out.println("Hitting the Enemy");
    }
    public void run(){
        System.out.println("Running from the Enemy");
    }
    public void fire(){
        System.out.println("Firing on the Enemy");
    }
}

public class pro_06 {
    public static void main(String[] args) {
        Tommy Player1 = new Tommy();
        Player1.hit();
        Player1.run();
        Player1.fire();
    }
}
