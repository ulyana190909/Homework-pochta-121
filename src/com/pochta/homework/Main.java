package com.pochta.homework;

import com.pochta.homework.entity.Bill;
import com.pochta.homework.entity.Client;
import com.pochta.homework.entity.Hotel;
import com.pochta.homework.entity.Room;
import com.pochta.homework.service.BookServise;

public class Main {
    public static void main(String[] args) {
        Bill katyaBill = new Bill(25000);
        Client katyaClient = new Client("Katya", "Popova", "+785145512", "djjksbv@jdnckjn.ru", katyaBill);

        Bill vasilisaBill = new Bill(105000);
        Client vasilisaClient = new Client("Vasilisa", "Petrova", "+8574141545", "jdbcb@zkjnv.ru", vasilisaBill);

        Room[] rixosRoom = new Room[]{
                new Room(2, 30000, true),
                new Room(1, 20000, true),
                new Room(3, 45000, true)};

        Hotel rixosHotel = new Hotel("Rixos", rixosRoom);

        Room[] hiltonRoom = new Room[]{
                new Room(1, 10000, false),
                new Room(2, 17000, true),
                new Room(3, 25000, true)};

        Hotel hiltonHotel = new Hotel("Hilton", hiltonRoom);

        BookServise bookServise = new BookServise();
        bookServise.book(rixosHotel, katyaClient, 1);
        System.out.println("\n");
        bookServise.book(hiltonHotel, vasilisaClient, 5);
        System.out.println("\n");
        bookServise.book(rixosHotel,katyaClient,3);
    }
}
