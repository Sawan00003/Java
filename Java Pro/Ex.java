@FunctionalInterface
interface A{
    int add(int i, int j);
    }
// class B implements A
// {

//     public void show()
//     {
//         System.out.println("in B show..");
//     }
// }

public class Ex 
{
    public static void main(String[] args) {

        A obj = (i, j) -> i+j;
            
        int result = obj.add(6, 5);
        System.out.println(result);
    }
}



