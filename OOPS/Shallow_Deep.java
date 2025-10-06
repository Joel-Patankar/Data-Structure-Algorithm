public class Shallow_Deep {
    public static void main(String[] args) {
        Marks m = new Marks();
        m.marks[0] = 69;
        m.marks[1] = 70;
        m.marks[2] = 80;

        Marks m2 = new Marks(m);
        m.marks[1] = 100;

        for (int i = 0; i <= 2; i++) {
           System.out.println(m2.marks[i]);
        } 
    }
}

class Marks {
    int marks[] = new int[3];

    // Shallow constructor.
    // Marks(Marks m){
    //     this.marks = m.marks;
    // }


    // Depp Constructor.
    Marks(Marks m){
        System.out.println("this is deep const...");
        for (int i = 0; i < marks.length; i++) {
        this.marks[i] = m.marks[i];
        }
    }



    Marks() {
        // System.out.println("hello kya hua laude");
    }
}
