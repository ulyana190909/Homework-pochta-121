package com.pochta.homework.entity;

public class Hotel {
    private String nameOfTheHotel;
    private Room[] rooms;

    public Hotel(String nameOfTheHotel, Room[] rooms) {
        this.nameOfTheHotel = nameOfTheHotel;
        this.rooms = rooms;
    }

    public String getNameOfTheHotel() {
        return nameOfTheHotel;
    }

    public void setNameOfTheHotel(String nameOfTheHotel) {
        this.nameOfTheHotel = nameOfTheHotel;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
