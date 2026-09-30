package gestionsalaires;

public class GestionSalaires {

    public static void main(String[] args) {
        // Tests applicatifs

        // Ticket ID 8 PayMaster[1447] - Suppression de la redondance de code
        Developpeur d = new Developpeur("Durand", "Michel", 4);
        Manager m = new Manager("Dupont", "Lucie", 2);

        System.out.println(d.getDescription());
        System.out.println(m.getDescription());

        // Ticket ID 9 PayMaster[1448] - Ajout d'employés administratifs
        Administratif a = new Administratif("Bastide", "Kimy", 3);

        System.out.println(a.getDescription());
    }

}
