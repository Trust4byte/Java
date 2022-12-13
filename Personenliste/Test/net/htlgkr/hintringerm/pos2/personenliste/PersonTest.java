package net.htlgkr.hintringerm.pos2.personenliste;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void compareTo() {
        Person p = new Person("Klaffenböck", "Wynsed", LocalDate.of(2007, 3, 1), 179, 75);
        Person p1 = new Person("tset", "test", LocalDate.of(2007, 3, 1), 160, 60);

        // not equal person
        assertEquals(-2, p.compareTo(p1));

        // equal person
        p.setFirstname("tset");
        p.setFirstname("test");
        assertEquals(0, p.compareTo(p1));
    }
}