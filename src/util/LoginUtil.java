package util;

import banner.BannerClass;

public class LoginUtil {

    public static boolean checkLogin(String[] args) {
        BannerClass.loginPageBanner();
        String username = ScannerUtil.stringScanner("Enter username: ");
        String password = ScannerUtil.stringScanner("Enter password: ");

        while (!args[0].equals(username) || !args[1].equals(password)){
            System.out.println("Wrong Username or password! Enter again: ");
            username = ScannerUtil.stringScanner("Enter username: ");
            password = ScannerUtil.stringScanner("Enter password: ");
        }

        System.out.println("Hello " + username + " ! You are logged in !");
        return true;


    }
}
