package util.sub;

import banner.BannerClass;
import domain.ContestantList;
import domain.Contestant;
import util.FileUtil;
import util.ScannerUtil;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class RegisterContestants {
    public static void register() throws IOException {
        BannerClass.registerPageBanner();
        System.out.println("How many contestant do you want to register?");
        int n = ScannerUtil.intScanner("Enter the number of contestants: ");
        ContestantList.contestantsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("You are registering the " + (i + 1) + ". contestant");
            String name = ScannerUtil.stringScanner(i+1 + ". Contestant`s name :");
            String surname = ScannerUtil.stringScanner(i+1 + ". Contestant`s surname :");
            int age = ScannerUtil.intScanner(i+1 + ". Contestant`s age :");
            String username = ScannerUtil.stringScanner(i+1 + ". Contestant`s username :");
            Contestant contestants = new Contestant(name,surname,age,username);
            ContestantList.contestantsList.add(contestants);
        }
        FileUtil.writeObjectToFile((Serializable) ContestantList.contestantsList,"contestants.txt");
    }
}
