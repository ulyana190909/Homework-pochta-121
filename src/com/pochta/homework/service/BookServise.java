package com.pochta.homework.service;

import com.pochta.homework.entity.Bill;
import com.pochta.homework.entity.Client;
import com.pochta.homework.entity.Hotel;
import com.pochta.homework.entity.Room;

public class BookServise {
    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRooms();
        boolean freeRooms = false;
        for (Room r : rooms
        ) {
            if (r.isFreeRoom()) {
                freeRooms = true;
            }
            if (!freeRooms) {
                System.out.println("Нет свободных номеров в отеле " + hotel.getNameOfTheHotel() + " !");
            }
        }
        bookRoom(client, numberOfPerson, rooms);
    }

    private void bookRoom(Client client, int numberOfPerson, Room[] rooms) {
        boolean success = false;
        for (Room room : rooms) {
            if (room.getNumberOfPerson() == numberOfPerson) {
                success = true;
                if (client.getBill().getAmount() >= room.getCoast()) {
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - room.getCoast());
                    room.setFreeRoom(false);
                    System.out.println("Номер был успешно забронирован клиентом " + client.getName());
                } else {
                    System.out.println("Недостаточно средств для бронирования номера!");
                }
            }
        }
    }
}



