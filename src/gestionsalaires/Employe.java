package gestionsalaires;

public abstract class employe {

    protected String nom;
    protected String prenom;
    protected int anciennete;
    protected String poste;

    public employe(String nom, String prenom, int anciennete, String poste) {
        this.poste = poste;
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete;
    }

    public abstract int getSalaire();

    public String getDescription() {
        return nom + " " + prenom + " est " + poste + " depuis "
                + anciennete + " ans et gagne " + getSalaire() + " €.";
    }
}