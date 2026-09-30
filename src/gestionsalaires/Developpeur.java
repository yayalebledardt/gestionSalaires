package gestionsalaires;

public class Developpeur extends Employe {

    private String langage;

    public Developpeur(String nom, String prenom, int anciennete, String langage) {
        super(nom, prenom, anciennete, "Developpeur");
        this.langage = langage;
    }

    public String getLangage() {
        return langage;
    }

    public int getPrimeLangage() {
        switch (langage.toLowerCase()) {
            case "java":
                return 50;
            case "python":
                return 70;
            case "php":
                return 45;
            default:
                return 0;
        }
    }

    @Override
    public int getSalaire() {
        return 1900 + anciennete * 100 + getPrimeLangage();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Langage de spécialité : " + langage + ".";
    }
}
