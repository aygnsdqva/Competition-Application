import banner.BannerClass;
import util.ChoiceUtil;
import util.LoginUtil;
import util.ScannerUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Hello, Welcome !");
        LoginUtil.checkLogin(args);
        BannerClass.homePageBanner();
        while (true){
            int answer = ScannerUtil.intScanner("Please write the operation number you would like to perform, if you don't mind :" +
                    "\n1: Register contestants" +
                    "\n2: Show Contestant" +
                    "\n3: Start the competition" +
                    "\n4: Logout" +
                    "\n5: Exit");
            if(answer==5)
            {
                System.out.println("Exited the program.");
                break;
            }
            ChoiceUtil.choiceMethod(answer, args);
        }


    }
}
