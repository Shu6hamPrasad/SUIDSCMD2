import java.util.Scanner;
import org.shp.assets.classes.*;
public class menu {
    private static Scanner sc = new Scanner(System.in);
    public static void menu(){
        String choice;
        login login = new login();
        login.message();
        System.out.println("Menu:");
        System.out.println("1> While Loops");
        System.out.println("2> For Loops");
        System.out.println("3> Do-While Loops");
        System.out.println("4> if-else conditional control");
        System.out.println("5> nested if");
        System.out.println("6> if-else if-else conduct");
        System.out.println("7> About this Program");
        System.out.println("L> Logout");
        System.out.println("E> Exit");
        System.out.println("");
        System.out.print("Enter a choice: ");
        choice = sc.next();
    }
    public static void error(){

    }
}
