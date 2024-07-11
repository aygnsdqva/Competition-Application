package util.sub;

import banner.BannerClass;
import domain.Contestant;
import util.FileUtil;
import util.ScannerUtil;

import java.io.IOException;
import java.util.List;

public class ShowAllContestants {
    public static int show() throws IOException, ClassNotFoundException {
        if(FileUtil.readFileDeserialize("contestants.txt") == null){
            System.out.println("There are no contestants. Please add:");
            RegisterContestants.register();
        }
        List<Contestant> contestants = (List<Contestant>) FileUtil.readFileDeserialize("contestants.txt");
        BannerClass.showContestansBanner();
        for (int i = 0; i < contestants.size() ;i++) {
            System.out.println(i+1 + ". " + contestants.get(i));
        }
        return  contestants.size();
    }
    public  static  void  showWinner(int winnerNum) throws IOException, ClassNotFoundException {
        BannerClass.winnerBanner();
        List<Contestant> contestants = (List<Contestant>) FileUtil.readFileDeserialize("contestants.txt");
        for (int i = 0; i < contestants.size() ;i++) {
            if(contestants.get(i) == contestants.get(winnerNum-1)){
                System.out.println(contestants.get(winnerNum-1));
            }
        }
    }
}
