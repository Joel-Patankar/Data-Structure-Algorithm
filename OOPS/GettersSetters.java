import java.util.StringJoiner;

public class GettersSetters {
    public static void main(String[] args) {
        Building bc = new Building();
        bc.setBuildingColor("whitish black");
        System.out.println(bc.getBuildingColor());
    }
}

class Building {
    private int floors;
    private String material;
    private String BuildingnColor;

    // GETTERS
    // this keyword apan isiliye use krte hai bcoz object ko as argument pass nahi
    // krna chaiye directly return ho jaye isliye
    // this keyword ki bakchodi maine copy mai bhi likha hai and thats important
    String getBuildingColor() {
        return this.BuildingnColor;
    }

    // SETTERS
    void setBuildingColor(String BuildingnColor) {
        this.BuildingnColor = BuildingnColor;
    }
}