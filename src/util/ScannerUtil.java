package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil {

    public static  String stringScanner(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public  static int intScanner(String title){
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int a = -1;
        System.out.println(title);
        while (!valid){
            try{
                a = scanner.nextInt();
                valid = true;
            }catch (InputMismatchException ex){
                System.out.println("Invalid input. Please enter a number : ");
                scanner.next();
            }
        }
        return a;
    }
}
