package com.otema.tosby.timetabler.cs.domain;

public class Room {
    private String number;
    private int SeatingCApacity;

    public Room(String number, int SeatingCApacity) {
        this.number = number;
        this.SeatingCApacity = SeatingCApacity;
    }

    public String getNumber() {
        return number;
    }

    public int getSeatingCApacity() {
        return SeatingCApacity;
    }
    
}
