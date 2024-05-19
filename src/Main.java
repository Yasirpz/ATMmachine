import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        atm obj=new atm();
        obj.checkPin();

    }
}
class atm {
    float balance;
    int PIN = 5627;
    public void checkPin() {
        System.out.println(" welcome to HBL atm \n Insert you card .");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin");
        int checkingpin = sc.nextInt();
        if (checkingpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
checkPin();
        }
    }
   public void menu(){
    System.out.println("1 check balance");
    System.out.println(" 2  withdrawl money");
    System.out.println(" 3 deposit  money ");
    System.out.println(" 4 exit" );
    Scanner sc=new Scanner(System.in);
    int option=sc.nextInt();
    if (option ==1){
        checkbalance();
    } else if (option ==3) {
        depositmoney();
    } else if (option ==2) {
        withdrawlmoney();

    } else if (option==4) {
        gohomebacktogetcard();
        return;

    }else{
        System.out.println("Enter a valid option");
        menu();
    }
 }
public void checkbalance(){
    System.out.println(" the balance in your account is  " +balance);
    menu();
}
public void withdrawlmoney(){
    System.out.println("enter your  Withdral amount");
    Scanner sc=new Scanner(System.in);
    float amount= sc.nextFloat();
    if (amount>balance){
        System.out.println(" you have incifficent balance");
    } else {
        balance=balance-amount;
        System.out.println(" withdrawl amount succesfully");
    }
    menu();
}
public void depositmoney(){
    System.out.println("Enter the deposit amount");
    Scanner sc=new Scanner(System.in);
    float amount=sc.nextFloat();
    balance=balance+amount;
    System.out.println("your amount deposit succesfully");
    menu();

}
public void gohomebacktogetcard(){
    System.out.println("if you are coming Atm for inhale air condition Air so please go to home and take your atm card" +
            "and get transcition");
}
}
