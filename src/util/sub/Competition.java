package util.sub;

import banner.BannerClass;
import util.ScannerUtil;

import java.io.IOException;
import java.util.Random;

public class Competition {

    public static void start() throws IOException, ClassNotFoundException {
        BannerClass.competitionBanner();
        System.out.println("Below is the list of contestants.");
        int size = ShowAllContestants.show();
        Random random = new Random();
        int selectedSize = ScannerUtil.intScanner("Please enter the user id :");
        int winner = random.nextInt(size - 1 + 1) + 1;
        boolean valid = false;
        while (!valid){
            if(winner == selectedSize){
                System.out.println("Congratulations. You picked the winner right");
                ShowAllContestants.showWinner(winner);
                BannerClass.congratulationsBanner();
                System.out.println("----------------------------------------------------------------------");
                System.out.println();
                valid = true;
            } else if (selectedSize < size ) {
                System.out.println("Unfortunately, you picked the wrong winner");
                ShowAllContestants.showWinner(winner);
                System.out.println("----------------------------------------------------------------------");
                System.out.println();
                valid = true;
            } else {
                System.out.println("There are no contestants matching this id.");
                selectedSize = ScannerUtil.intScanner("Please again enter the user id :");
            }
        }

    }
}
