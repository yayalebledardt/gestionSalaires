package gestionsalaires;

public class Manager extends Employe {

    public Manager(String nom, String prenom, int anciennete) {
        super(nom, prenom, anciennete, "Manager");
    }

    @Override
    public int getSalaire() {
        return 2200 + anciennete * 110;
    }
}
