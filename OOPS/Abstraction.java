public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eats();
        d.walk();

        // by default color chipak gaya
        System.out.println(d.color);

        // we changed this color
        d.changeColor();
        System.out.println(d.color);
    }
}

// ABSTRACT KEYWORD KE WAJAG SE ANIMAL NAAM KI KEYWORD NHI BAN SKTI
// CONSTRUCTOR BHI BANA SKTE HAI, JO BHI TU LIKHENGA CONST. MAI WO BY DEFAULT
// SAB DERIVED CLASSES MAI CHLI JAYEGI UNTIL YOU CHNAGE IT
abstract class Animal {
    String color;

    Animal() {
        color = "white";
    }

    void eats() {
        System.out.println("eats");
    }

    // ISSE IMPLEMENT NHI KR SKTE HAI YE JUST EK IDEA DE RAHA HAI DIRIVED CLASSES KO
    abstract void walk();
}

class Dog extends Animal {

    void changeColor() {
        color = "laaal";
    }

    void walk() {
        System.out.println("walks");
    }
}
