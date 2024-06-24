package Class;

class square{
    int length;

    public int paremeter(){
        int result;
        result = length*4;
        return result;

    };
    public int area(){
        return length*length;
    }
}

public class pro_04 {
    public static void main(String[] args) {
    square sq = new square();
    sq.length=10;
    sq.paremeter();
    sq.area();
        System.out.println("Paremeter of Square = "+sq.paremeter());
        System.out.println("Area of Square = "+sq.area());
    }
}
