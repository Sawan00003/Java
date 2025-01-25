public class Ifelseif{
    public static void main(String[] args) {
        int x = 20;
        int y = 15;
        int z = 11;
        if(x > y && x > z)
            System.out.println(x);
        else if (y > z) 
            System.out.println(y);      
        else
            System.out.println(z); 
    }
}
