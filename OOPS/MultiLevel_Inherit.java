public class MultiLevel_Inherit {
    public static void main(String[] args) {
        Tiger tigu = new Tiger();
        tigu.legs = 5;
        System.out.println(tigu.legs);
        tigu.sound();
    }
}
// IN THIS TYPE OF INHERITANCE PROPERTIES GOES FROM BASE --> DERIVED --> DERIVED

class Animal {
    void eats() {
        System.out.println("eats any type of food");
    }
    void skinColor() {
        System.out.println("yellow black");
    }
}

class Mammals extends Animal {
    int legs;
}

class Tiger extends Mammals {
    void sound(){
        System.out.println("Roar");
    }
}
