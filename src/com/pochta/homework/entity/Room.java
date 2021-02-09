package com.pochta.homework.entity;

public class Room {
    private int numberOfPerson;
    private int coast;
    private boolean freeRoom;

    public Room(int numberOfPerson, int coast, boolean freeRoom) {
        this.numberOfPerson = numberOfPerson;
        this.coast = coast;
        this.freeRoom = freeRoom;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public boolean isFreeRoom() {
        return freeRoom;
    }

    public void setFreeRoom(boolean freeRoom) {
        this.freeRoom = freeRoom;
    }
}
