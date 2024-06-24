package accessmodifiers;

class Student {
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}

public class pro_01 {
    public static void main(String[] args) {
        Student st = new Student();
//        st.id=20;
        st.setName("Sunny Kushwaha");
        System.out.println(st.getName());
        st.setId(20);
        System.out.println(st.getId());
    }
}
