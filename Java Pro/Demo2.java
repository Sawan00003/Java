

// abstract class Car
// {   
//     public abstract void drive();
//     public abstract void fly();

//     public void playMusic()
//     {

//         System.out.println("playing Music..");
//     } 

// }

// class WaganR extends Car{

//     class C{

//         public void age(){

//             System.out.println("In Age");
//         }
//     }

//     public void drive(){

//         System.out.println("Driving...");
        
//     }

    
//     public void fly() {
//         System.out.println("Flying....");
//     }

// }

// public class Demo2 {

//     public static void main(String[] args) {

//         Car obj = new WaganR();
//         obj.drive();
//         obj.playMusic();
//         obj.fly();
//         WaganR.C obj1 = obj.new C();
//         obj1.age();


        
//     }
       
// }
    

class A{
    public void music(){
        System.out.println("Music...");
    }
    
}

// class B extends A{
//     public void music(){
//         System.out.println("In car..");
//     }
// }
public class Demo2 {
    public static void main(String[] args) {
        A obj = new A()
        
        {   
            {
                System.out.println("New Music...");
            }
            
        };
        obj.music();

    }
}
