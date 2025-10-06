public class CopyConstructor {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "joel";
        obj.password = 8374;
        obj.roll = 69;

        Student naya = new Student(obj);
        obj.password = 696969;
        
        // naya.name = "chaha";

        System.out.println(naya.name);
        // System.out.println(naya.roll);
        // System.out.println(naya.password);
    }
}

class Student {
    int roll;
    String name;
    int password;

    Student(Student obj) {
        this.name = obj.name;
        this.roll = obj.roll;
        // System.out.println(this.password = obj.password);
        
    }

    Student() {

    }

    Student(String naam) {
        this.name = naam;
        // System.out.println(this.name = naam);
    }

    Student(int roll) {
        this.roll = roll;
        // System.out.println(this.roll);
    }

}
