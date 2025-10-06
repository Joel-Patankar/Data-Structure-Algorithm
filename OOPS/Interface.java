public class Interface {
    public static void main(String args[]) {
        Kutta k = new Kutta();
        k.grass();
        k.meat();
     
    }
}

interface Carnivore {
    void meat();
}

interface Herbivore {
    void grass();
}

class Kutta implements Carnivore, Herbivore {
    public void meat() {
        System.out.println("eats grasss");
    }
    public void grass() {
        System.out.println("eats meat");
    }
}