// idher default aur protected bhi dekhenge but aaqge 
public class AccessModifers {
    public static void main(String[] args) {
        MyBankAcc bA = new MyBankAcc();
        bA.gmail = "joelpatankar@gamil.com";
        System.out.println(bA.gmail);
        bA.gmail("shreyakuril4@gmail.com");
        bA.phone(837479287);;
    }
}

class MyBankAcc {
    private int password;
    public String gmail;
    public int phoneNum;

    void gmail(String gm){
        gmail = gm;
        System.out.println(gmail);
    }
    void phone(int pn){
        phoneNum = pn;
        System.out.println(phoneNum);
    }

}