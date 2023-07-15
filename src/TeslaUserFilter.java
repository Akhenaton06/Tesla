import java.util.ArrayList;
import java.util.List;

public class TeslaUserFilter {

    public static List<TeslaUser> filterUsers(List<TeslaUser> users, double pourcentage){

        int numUsersFilter= users.size();
        int count=(int)(numUsersFilter * pourcentage);
        return users.subList(0,count);

    }
}
