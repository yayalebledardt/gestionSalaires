package gestionsalaires;

public class DeveloppeurExpert extends Developpeur {

    public DeveloppeurExpert(String nom, String prenom, int anciennete, String langage) {
        super(nom, prenom, anciennete, "developpeur expert", langage);
    }

    @Override
    public double getSalaire() {
        return super.getSalaire() * 1.1;
    }
}
