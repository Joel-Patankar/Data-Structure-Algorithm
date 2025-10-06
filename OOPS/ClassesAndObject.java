public class ClassesAndObject {
    public static void main(String args[]) {
        Pen penObject = new Pen(); // this is object (penObject)
        penObject.color = "red Color";
        System.out.println(penObject.color);
        penObject.color = "yellow Color";
        System.out.println(penObject.color);
        penObject.tipSize(4);
    }
}

class Pen{
    // this are two properties
    String color;
    int tip;

    void tipSize(int tipSize){
        tip = tipSize;
        System.out.println("size of tip is now "+tip);
    }

    // this is functions with will change prop 
    // void setColor(String newColor){
    //     color = newColor;
    // }
    
}