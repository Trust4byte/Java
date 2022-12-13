package net.htlgkr.hintringerm.pos2.personenliste;

import java.util.Comparator;

public class bdDateAscendingComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthdate().compareTo(o2.getBirthdate());
    }

}
