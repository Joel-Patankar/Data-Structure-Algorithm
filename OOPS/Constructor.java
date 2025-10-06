public class Constructor {
    public static void main(String[] args) {
        Pen p1= new Pen("redish color");
        System.out.println(p1.color);
        Pen p2 = new Pen(8);
        System.out.println(p2.color);
    }
}

class Pen{
    String color;int tip;
        // This pen function is nothing but constructor (Function)
    Pen(int tip){
        this.tip = tip;
        System.out.println("hey constructor called me ..... "+this.tip);
    }

    Pen(String color){
        this.color = color;
        System.out.println("hey const called me babyyyy "+this.color);
    }
}