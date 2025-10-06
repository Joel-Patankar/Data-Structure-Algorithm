public class Inheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();

        t.skinColor();
        t.eats();
    }
}
// IN THIS PROPERTIES ARE GOING FROM BASE CLASS TO DERIVED CLASS
class Animal{
    int legs;

    void eats(){
        System.out.println("eats any type of food");
    }

    void skinColor(){
        System.out.println("yellow black");
    }
}

class Tiger extends Animal{
    void sound(){
        System.out.println("roar");
    }
}
