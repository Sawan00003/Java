interface A
{
    String area = "Mumbai";
    void show();
    void config();
}

class B implements A
{
    public void show() {
        System.out.println("in show..");
    }
    public void config() {
        System.out.println("in Config..");
    }
}

public class Interface 
{
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);
    }
    
}
