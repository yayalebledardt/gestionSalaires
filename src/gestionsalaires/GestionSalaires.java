package gestionsalaires;

public class GestionSalaires {

    public static void main(String[] args) {
        // Tests applicatifs

        // Ticket ID 8 PayMaster[1447] - Suppression de la redondance de code
        Developpeur d = new Developpeur("Durand", "Michel", 4);
        Manager m = new Manager("Dupont", "Lucie", 2);

        System.out.println(d.getDescription());
        System.out.println(m.getDescription());
    }

}
