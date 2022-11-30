package de.neuefische;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class GuestListTest {

    @Test
    void shouldBeEmptyInitially() {
        GuestList guestList = new GuestList();
        guestList.setGuests(new ArrayList<>());
        List<String> actual = guestList.getGuests();

        assertEquals(0, actual.size());
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore() {
        List<String> guests = new ArrayList<>(
                Arrays.asList(
                        "Karl",
                        "Ute"
                )
        );

        GuestList guestList = new GuestList();
        guestList.setGuests(guests);
        List<String> actual = guestList.getGuests();

        assertEquals(guests, actual);
    }

    @Test
    void shouldWriteToFileSystem() {
        List<String> guests = new ArrayList<>(
                Arrays.asList(
                        "Theodor",
                        "Anette"
                )
        );

        GuestList guestList = new GuestList();
        guestList.setGuests(guests);

        File file = new File("src/main/java/de/neuefische/guests.txt");
        assertTrue(file.exists());

    }
}