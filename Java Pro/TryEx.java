public class TryEx
{
    public static void main(String[] args) 
    {   
        int i = 6;
        int j = 0;

        try {
            {
                j = 18/i;
            }
    
        } catch (Exception e) 
        {
            System.out.println("Something went wrog");
            
        }        
        System.out.println(j);

        System.out.println("Bye");
        
    }
    
}
