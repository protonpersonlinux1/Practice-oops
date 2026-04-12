class Objects{
    void object(){
        System.out.println("hi");
    }

    void showShape(){}
}

class Circle extends Objects {
    void object(){
        System.out.println("hi");
    }
}

public class Nice{
    public static void main(String[] args){
        Objects obj1 = new Circle();

        obj1.object(); 
        obj1.showShape(); 
    }

    
}