import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        info rustam = new info();
        rustam.setName("Rustam");
        rustam.setBalance(1500);
        rustam.setUsername("rustam");
        rustam.setPassword("admin");

        info orkhan = new info();
        orkhan.setName("Orkhan");
        orkhan.setBalance(1800);
        orkhan.setUsername("orkhan");
        orkhan.setPassword("admin");

        ArrayList<info> array = new ArrayList<>();
        array.add(rustam);
        array.add(orkhan);

        for (info info : array) {
            System.out.println("Hello dear user . Please login !");
            Scanner scanner = new Scanner(System.in);
                System.out.println("Username:");
                String user = scanner.next();
                System.out.println("Password:");
                String pass = scanner.next();
                if (info.getUsername().equals(user) && info.getPassword().equals(pass)) {
                    System.out.println(info.getName());
                    operationBalance(info.getUsername(), info.getName(), info.getBalance());
                    break;
                } else {
                    System.out.println("Your information is false . Please try again !");
                    main(args);
                    break;
                }
            }
        }
    public static void operationBalance(String username ,String name, int balance) {
        System.out.println("Choose yor operation type :\n1.Show balance\n2.Cash in\n3.Cash out\n4.Contact with bank\n5.Exit system");
        Scanner operation = new Scanner(System.in);
        int op = operation.nextInt();
        switch (op) {
            case 1:
               showBalance(username,name,balance);
                break;
            case 2:
                cashIn(username, name, balance);
                break;
            case 3:
                cashOut(username,name,balance);
                break;
            case 4 :
                System.out.println("Phone : +994555555555\n Email : hashimlirustam@gmail.com\nContinue -> 1  | Exit -> 2");
                break;
            case 5:System.out.println("You are exitting system. Have a good day!");
            break;
        }
    }

    private static void showBalance(String username ,String name, int balance) {
        System.out.println("Your balance is " + balance+ "\nContinue -> 1  | Exit -> 2");
        Scanner cont = new Scanner(System.in);
        int cnt = cont.nextInt();
        switch (cnt){
            case 1: operationBalance(username, name , balance);
            break;
            case 2:
                System.out.println("Thanks for operation! Have a good day!");
        }
    }

    private static void cashOut(String username , String name ,int balance) {
        System.out.println("Enter ammount :");
        Scanner out = new Scanner(System.in);
        int outAm = out.nextInt();
        if (outAm<balance){
        balance= balance -outAm;
        System.out.println("Your balance is " + balance +" now.\nContinue -> 1  | Exit -> 2");
        int cnt = out.nextInt();
        System.out.println("Continue -> 1  | Exit -> 2");
        switch (cnt){
            case 1: operationBalance(username , name , balance);
            break;
            case 2:
                System.out.println("Thanks for operation! Have a good day!");
                break;
        }
        return;}
        else {
            System.out.println("Your balance isn`t enough!");
            System.out.println("Continue -> 1  | Exit -> 2");
            int cnt = out.nextInt();
            switch (cnt){
                case 1: operationBalance(username , name , balance);
                    break;
                case 2:
                    System.out.println("Thanks for operation! Have a good day!");
                    break;
            }
        }
    }

    private static void cashIn(String username,String name,int balance ) {
        System.out.println("Enter ammount :");
        Scanner in = new Scanner(System.in);
        int inAm= in.nextInt();
        balance = balance+inAm;
        System.out.println("Your balance is " + balance +" now.\nContinue -> 1  | Exit -> 2");
        int cnt = in.nextInt();
        switch (cnt){
            case 1: operationBalance(username , name , balance);
                break;
            case 2:
                System.out.println("Thanks for operation! Have a good day!");
                break;
        }
        return;
    }

}


