package net.htlgkr.hintringerm.pos2.personenliste;

import java.util.Comparator;

public class bdDateDescendingComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getBirthdate().compareTo(o1.getBirthdate());
    }

}
