package util;

import banner.BannerClass;
import util.sub.Competition;
import util.sub.RegisterContestants;
import util.sub.ShowAllContestants;

import java.io.IOException;

public class ChoiceUtil {

    public static void choiceMethod(int answer, String[] args) throws IOException, ClassNotFoundException {
        if(answer == 1){
            RegisterContestants.register();
        }else if (answer == 2) {
            ShowAllContestants.show();
        }else if(answer == 3){
            Competition.start();
        } else if (answer == 4) {
            LoginUtil.checkLogin(args);
            BannerClass.homePageBanner();
        }else{
            System.out.println("Unfortunately, such an option is not available.");
        }
    }
}
