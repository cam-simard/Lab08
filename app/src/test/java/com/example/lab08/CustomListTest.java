package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));

        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());

        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertEquals(1, list.countCities());

        City toronto = new City("Toronto", "ON");
        list.addCity(toronto);
        assertEquals(2, list.countCities());

        list.deleteCity(calgary);
        assertEquals(1, list.countCities());
    }
}
