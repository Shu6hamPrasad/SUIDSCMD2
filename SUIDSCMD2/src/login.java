import java.util.Scanner;
public class login {
    private static String checkUsername;
    private static String username;
    public static void message(){
        System.out.println("Hello "+username+"!");
    }
    public static void passWord(){
        String checkPassword = "ShubhamPrasad", password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hi! please enter your Password: ");
        password = sc.next();
        if(password.equals(checkPassword)){
            System.out.println("Welcome!");
            System.out.println("");
            menu menu = new menu();
            menu.menu();
        }
        else
            error();
    }
    public static void userName(){
        Scanner sc = new Scanner(System.in);
        checkUsername = "Shubham";
        System.out.print("Hi! enter your username: ");
        username = sc.next();
        if(username.equals(checkUsername)){
            passWord();
        }
        else
            error();
    }
    public static void error(){
        System.out.println("Either your username or password is incorrect!");
        System.out.print("Do you want to try again?(y/n): ");
        String choice;
        Scanner sc = new Scanner (System.in);
        choice = sc.next();
        if (choice.equalsIgnoreCase("y")){
            userName();
        }
        else {
            System.out.println("Quitting....");
            System.exit(1);
            sc.close();
        }
    }
    public static void main(String[] args){
        System.out.println("===================");
        System.out.println("SUIDS-CMD Ver 2.0.1");
        System.out.println("===================");
        userName();
    }
}
