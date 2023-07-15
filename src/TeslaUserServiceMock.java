import java.util.ArrayList;
import java.util.List;

public class TeslaUserServiceMock implements TeslaUserService{
    @Override
    public List<TeslaUser> getAdminissibleUsers() {
        List<TeslaUser> users= new ArrayList<>();
        users.add(new TeslaUser("États-Unis", "users1@gmail.com", true, 99.1));
        users.add(new TeslaUser("États-Unis", "users2@gmail.com", true, 99.2));
        users.add(new TeslaUser("États-Unis", "users3@gmail.com", true, 99.3));
        users.add(new TeslaUser("États-Unis", "users4@gmail.com", true, 99.4));
        users.add(new TeslaUser("Canada", "users5@gmail.com", true, 99));
        users.add(new TeslaUser("États-Unis", "users6@gmail.com", true, 99.5));
        users.add(new TeslaUser("États-Unis", "users7@gmail.com", true, 99.6));
        users.add(new TeslaUser("Canada", "users8@gmail.com", false, 77));
        users.add(new TeslaUser("États-Unis", "users9@gmail.com", true, 99.7));
        users.add(new TeslaUser("États-Unis", "users10@gmail.com", true, 99.8));
        users.add(new TeslaUser("États-Unis", "users11@gmail.com", true, 99.9));
        users.add(new TeslaUser("Canada", "users12@gmail.com", true, 100));


        List<TeslaUser> userFilter= new ArrayList<>();
        users.forEach( userTesla-> {
            if(userTesla.isPayement()==true && userTesla.getRegion().equals("États-Unis") && userTesla.getScore()>99)
                userFilter.add(new TeslaUser(userTesla.getRegion(), userTesla.getIdentifiant(), userTesla.isPayement(), userTesla.getScore()));

        });
        return userFilter;
    }

}
