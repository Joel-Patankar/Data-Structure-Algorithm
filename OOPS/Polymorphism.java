public class Polymorphism {
    public static void main(String[] args) {
        // compile time
        // Calculation cal = new Calculation();
        // System.out.println(cal.sum(2, 4));
        // System.out.println(cal.sum((float)4, (float)9));

        // run time
        Deer d = new Deer();
        d.eats();

    }
}

// Compile time [ METHOD OVERLOADING ] { STATIC }
class Calculation {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }
}

// Run time [ METHOD OVERIDING ] { DYNAMIC }
class Animal {
    void eats() {
        System.out.println("eats");
    }
}

class Deer extends Animal {
    void eats() {
        System.out.println("eats ghassss");
    }
}
