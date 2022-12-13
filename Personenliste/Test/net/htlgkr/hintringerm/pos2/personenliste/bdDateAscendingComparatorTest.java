package net.htlgkr.hintringerm.pos2.personenliste;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class bdDateAscendingComparatorTest {

    @org.junit.jupiter.api.Test
    void compare() {
        Person p = new Person("Max", "Muster", LocalDate.of(2009, 3, 1), 179, 75);
        Person p1 = new Person("tset", "test", LocalDate.of(2006, 3, 1), 160, 60);
    }
}