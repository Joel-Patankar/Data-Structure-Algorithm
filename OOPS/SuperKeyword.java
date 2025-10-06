public class SuperKeyword {
    public static void main(String[] args) {
        Human insaan = new Human();
        System.out.println("bhagwan : insaano ko kitne lund dena chaiye => "+insaan.lund);
        
    }
}
class God{
    int lund ;
    God(){
        System.out.println("Bhagawan : maine inn chutiyo ko banaya hai ");
    }
}

class Human extends God {
    Human(){
        super.lund=1;
        System.out.println("Insaan : bhenchod kyu banaya iss chutiye ne maa chudi padi hai");
    }
}