package net.htlgkr.hintringerm.pos2.personenliste;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PersonList {
    private static List<Person> persons = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("");
        while(true){


            System.out.println("Vorname: ");
            String firstname = scan.nextLine();

            System.out.println("Nachname:");
            String lastname = scan.nextLine();

            System.out.println("Geburtstag: (YEAR-MONTH-DAY | ####-##-##)");
            LocalDate bDate = LocalDate.parse(scan.nextLine());

            System.out.println("Körpergröße");
            int height = Integer.parseInt(scan.nextLine());

            System.out.println("Gewicht: ");
            double weight = Double.parseDouble(scan.nextLine());

            persons.add(new Person(lastname, firstname, bDate, height, weight));



            System.out.println("Möchten Sie eine weitere Person hinzufügen? ( 1 - JA / 2 - NEIN)");
            int choose = Integer.parseInt(scan.nextLine());

            if(choose == 2){
                break;
            }
        }

        printPersons();

    }

    private static void printPersons(){
        System.out.println("Sortiert nach: Standart");
        Collections.sort(persons);

        persons.forEach(person -> {
            System.out.println(person);
        });

        System.out.println("\nSortiert nach: birthdate aufsteigend");
        persons.sort(new bdDateAscendingComparator());

        for(Person person : persons){
            System.out.println(person);
        }

        System.out.println("\nSortiert nach: birthdate absteigend\n");
        persons.sort(new bdDateDescendingComparator());

        for(Person person : persons){
            System.out.println(person);
        }

        System.out.println("\nSortiert nach: height aufsteigend");
        persons.sort(new heightAscendingComparator());

        for(Person person : persons){
            System.out.println(person);
        }

        System.out.println("\nSortiert nach: weight aufsteigend");
        persons.sort(new weightAscendingComparator());

        for(Person person : persons){
            System.out.println(person);
        }


    }
}
