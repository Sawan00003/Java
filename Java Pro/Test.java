interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){

        System.out.println("code, compile, run");
    }
}

class Descktop implements Computer{
    public void code(){
        System.out.println("code, compile, run, faster ");
    }
}

class Devloper{
    public void devApp(Computer lap){
        lap.code();
    }
}

public class Test {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk =new Descktop();

        Devloper sawan = new Devloper();
        sawan.devApp(desk);
        
    }
    
}
