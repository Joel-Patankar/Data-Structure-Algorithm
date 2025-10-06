public class Hybrid_Inherit {
    public static void main(String[] args) {
        Cat kitty = new Cat();

        kitty.legs = 4;
        System.out.println(kitty.legs);
    }
}

class Mammals {
    void walk() {
        System.out.println("walks");
    }

    String color;
    int legs;
}

class Animal extends Mammals {
    void walk(){
        System.out.println("walks");
    }
}

class Bird extends Mammals {
    void fly() {
        System.out.println("flys in sky");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meowwwww");
    }
}

class Pegion extends Bird{
    
}