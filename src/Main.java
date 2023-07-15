import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TeslaUserService userService = new TeslaUserServiceMock();

        double percentage = 0.25; // 25%
        /**Liste de personne éligible*/
        List<TeslaUser> usersEligible = userService.getAdminissibleUsers();

        /**Liste  de 25% de personnes éligiblent */
        List<TeslaUser> selectedUsers = TeslaUserFilter.filterUsers(usersEligible, percentage);

        /**
         * Affichage de la liste
         */
        System.out.println("Utilisateurs de tesla éligible:");
        for (TeslaUser user : selectedUsers) {
            System.out.println("Email:"+ user.getIdentifiant()+ " Score: "+user.getScore());
        }
    }
}