public class Employee {

    private int Matricule;
    private String Nom;
    private String Prenom;
    private int Age;
    private double Salaire;

    public Employee(int Matricule, String Nom, String Prenom, int Age, double Salaire) {
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.Salaire = Salaire;
    }



    public void setMatricule(int matricule) {
        Matricule = matricule;
    }

    public String getNom() {
        return Nom;
    }

    public int getMatricule() {
        return Matricule;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getSalaire() {
        return Salaire;
    }

    public void setSalaire(double salaire) {
        Salaire = salaire;
    }

    @Override
    public String toString() {
        return
                "      - matricule  = " + Matricule +'\n'+
                        "      - nom        = " + Nom + '\n' +
                        "      - prenom     = " + Prenom + '\n' +
                        "      - age        = " + Age +'\n' +
                        "      - salaire    = " + Salaire +'\n'
                ;
    }


    public static void menu (){
        System.out.print("""
                                         Menu du programme
                1 - Ajouter un nouvel employé\t
                2 - Modifier un employé\t
                3 - Supprimer un employé\t
                4 - Afficher un employé\t
                5 - Afficher tous les employés\t
                6 - Calculer le nombre des employés ayant un salaire qui dépasse 10000.\t
                7 - Afficher l’employé le plus âgé.\t
                8 - Afficher l’employé le moins âgé.\t
                9 - Quitter\t
                Donner votre choix :""");

    }


}