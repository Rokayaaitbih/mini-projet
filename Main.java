import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Calendar.PM;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> ArrayEmpolyee = new ArrayList<>();

    public static void main (String[] args) {

        Employee.menu();
        int choix = sc.nextInt();

        while (choix < 1 || choix > 9) {
            Employee.menu();
            choix = sc.nextInt();
        }
        while (choix >= 1 && choix <= 9) {
            switch (choix) {

                case 1:

                    ajouterEmployé();
                    Employee.menu();
                    choix = sc.nextInt();
                    break;
                case 2:

                    afficheunEmploye();
                    choix = sc.nextInt();
                    break;

            }


        }
    }


    //static List<Employe> ArrayEmpolyé2 = new ArrayList<>();


    static void ajouterEmployé () {

        System.out.print("Entrer le matricule :");
        int Matricule = sc.nextInt();
        System.out.print("Entrer le nom :");
        String Nom = sc.next();
        System.out.print("Enter le prenom :");
        String Prenom = sc.next();
        System.out.print("Entrer l'age :");
        int Age = sc.nextInt();
        System.out.print("Entre le salaire :");
        double Salaire = sc.nextDouble();
        Employee e = new Employee(Matricule, Nom, Prenom, Age, Salaire);
        ArrayEmpolyee.add(e);

        //Object Ma;
        // int i1 = 630 - 733870;
        // Employe e = new Employe(Ma…
        // [5:55 PM, 10/11/2022] +212 i1:
    }

    static void afficherEmploye () {
        System.out.print("Entrer  d'employé pour affiché :");
        int Matricule = sc.nextInt();
        int i = 0;
        for (Employee e : ArrayEmpolyee) {
            i++;
            if (e.getMatricule() == Matricule) {
                System.out.println("les information de employé c'est" + e.getMatricule());
            } else {
                System.out.println("le employé indisponible ");
            }
        }
    }



    // pour afficher un employe
    static void afficheunEmploye () {

        if (ArrayEmpolyee.isEmpty()) {
            System.out.println("Il n'y a aucun employe !");
        } else {
            System.out.print("Entrer le matricule d'employe pour l'afficher :");
            int Matricule = sc.nextInt();
            for (Employee e:ArrayEmpolyee) {
                if (e.getMatricule() == Matricule) {
                    System.out.println(e);
                }
            }
            System.out.println("Cet employe n'extste pas !");
        }
    }


    static void Affichersalair () {
        int nb = 0;
        if (ArrayEmpolyee.isEmpty()) {
            System.out.print("la base de donner est vide \n");

        } else {

            for (int i = 0; i < ArrayEmpolyee.size(); i++) {
                if (ArrayEmpolyee.get(i).getSalaire() > 1000) {
                    nb += 1;
                }
            }
            System.out.println("le nombre des employés ayant un salaire qui dépasse 10000 est : " + nb + "\n");
        }
    }
    static void modifierEmploye(){
        System.out.print("Entrer le matricule d'employe pour le modifier :");
        int Matricule=sc.nextInt();
        boolean exist=false;
        int i=0;
        int ind = 0;
        for (Employee e : ArrayEmpolyee){
            ++i;
            if (e.getMatricule()==Matricule){
                exist=true;
                ind=i;
            }
        }
        if (exist){
            System.out.println("Modification :");
            System.out.print("Entrer le matricule :");
            Matricule=sc.nextInt();
            System.out.print("Entrer le nom :");
            String Nom=sc.next();
            System.out.print("Enter le prenom :");
            String Prenom=sc.next();
            System.out.print("Entrer l'age :");
            int Age=sc.nextInt();
            System.out.print("Entre le salaire :");
            double Salaire=sc.nextDouble();
            Employee e = new Employee(Matricule,Nom,Prenom,Age,Salaire);
            ArrayEmpolyee.set(ind,e);

        }
        else {
            System.out.println("Cet employe indisponible !");

        }
    }
    static void Supprimer() {
        if (ArrayEmpolyee.isEmpty()) {
            System.out.print("la base de donner est vide ");
        } else {
            System.out.print("donner le matricule de l'employer suprimer : ");
            int Matricule = sc.nextInt();

            for (int i = 0; i < ArrayEmpolyee.size(); i++) {
                if (Matricule == ArrayEmpolyee.get(i).getMatricule()) {
                    ArrayEmpolyee.remove(i);
                    System.out.print("la supression d'employe fait avec succes");
                    System.out.print("\n");
                }else{
                    System.out.print("se matricule ne trouve pas ");
                    System.out.print("\n");
                }
            }
        }
    }



}