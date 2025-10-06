public class hirarchial_Inherit {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.color = "brownish";
        doggy.legs = 4;
        System.out.println(doggy.legs);
        System.out.println(doggy.color);
    }
}

// IN THIS TYPE OF INHERITANCE PROP GOES FROM BASE CLASSES INTO TWO DERIVED
// CLASSES OR MORE
class Mammals {
    void walk() {
        System.out.println("walks");
    }

    String color;
    int legs;
}

class Dog extends Mammals {

}

class Bird extends Mammals {

}