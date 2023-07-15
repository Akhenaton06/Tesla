public class TeslaUser {

    private String region;
    private String identifiant;
    private boolean payement;
    private double score;

    public TeslaUser(String region, String identifiant, boolean payement, double score) {
        this.region = region;
        this.identifiant = identifiant;
        this.payement = payement;
        this.score = score;
    }

    public String getRegion() {
        return region;
    }

    public boolean isPayement() {
        return payement;
    }

    public double getScore() {
        return score;
    }

    public String getIdentifiant() {
        return identifiant;
    }
}
