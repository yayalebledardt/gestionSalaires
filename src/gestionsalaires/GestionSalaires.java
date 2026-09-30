package gestionsalaires;

public class GestionSalaires {

    public static void main(String[] args) {
        // Tests applicatifs

        // Ticket ID 8 PayMaster[1447] - Suppression de la redondance de code
        Developpeur d = new Developpeur("Durand", "Michel", 4, "java");
        Manager m = new Manager("Dupont", "Lucie", 2);

        System.out.println(d.getDescription());
        System.out.println(m.getDescription());

        // Ticket ID 9 PayMaster[1448] - Ajout d'employés administratifs
        Administratif a = new Administratif("Bastide", "Kimy", 3);

        System.out.println(a.getDescription());

        // Ticket ID 10 PayMaster[1448] - Ajout du langage de programmation d'un développeur
        Developpeur d2 = new Developpeur("Martin", "Paul", 1, "python");
        Developpeur d3 = new Developpeur("Leroy", "Julie", 2, "php");
        Developpeur d4 = new Developpeur("Moreau", "Hugo", 3, "c#");

        System.out.println(d2.getDescription());
        System.out.println(d3.getDescription());
        System.out.println(d4.getDescription());

        // Ticket ID 11 PayMaster[1449] - Ajout des développeurs experts
        DeveloppeurExpert de = new DeveloppeurExpert("Baron", "Emma", 1, "php");

        System.out.println(de.getDescription());
    }

}
