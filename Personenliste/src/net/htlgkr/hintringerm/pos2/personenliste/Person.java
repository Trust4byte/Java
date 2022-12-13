package net.htlgkr.hintringerm.pos2.personenliste;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{

    private String lastname;
    private String firstname;
    private LocalDate birthdate;
    private int height;
    private double weight;

    public Person(String lastname, String firstname, LocalDate birthdate, int height, double weight) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastname, person.lastname) && Objects.equals(firstname, person.firstname) && Objects.equals(birthdate, person.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname, birthdate);
    }

    @Override
    public String toString() {
        return lastname + " " + firstname + " geboren am " + birthdate + ". Körpergröße: " + height + " Gewicht: " + weight;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Person p) {
        if(this.lastname.equals(p.lastname)){
            return this.lastname.compareTo(p.lastname);
        } else if (this.firstname.equals(p.firstname)) {
            return this.firstname.compareTo(p.firstname);
        }
        return this.birthdate.compareTo(p.birthdate);
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
