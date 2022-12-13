package net.htlgkr.hintringerm.pos2.personenliste;

import java.util.Comparator;

public class weightAscendingComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return (int)((o1.getWeight() - o2.getWeight()) * 100);
    }

}
