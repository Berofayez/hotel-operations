package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_not_occupied(){
        Room room = new Room(2,150, true, false);
        room.checkIn();

        assertTrue(room.isOccupied());

        assertTrue(room.isDirty());

        assertFalse(room.isAvailable());

    }

    @Test
    public void checkout_not_occupied(){
        Room room = new Room(2,150, true, false);
        room.checkout();

        assertFalse(room.isOccupied());

        assertFalse(room.isDirty());

        assertTrue(room.isAvailable());

    }

    @Test
    public void clean_room_not_occupied(){
        Room room = new Room(2,150, false, true);
        room.cleanroom();
        assertFalse(room.isDirty());

    }

    @Test
    public void clean_room_occupied(){
        Room room = new Room(2,150, true, true);
        room.cleanroom();
        assertTrue(room.isDirty());

    }


}