package gestionsalaires;

public class Developpeur extends employe {

    public Developpeur(String nom, String prenom, int anciennete) {
        super(nom, prenom, anciennete, "Developpeur");
    }

    @Override
    public int getSalaire() {
        return 1900 + anciennete * 100;
    }
}