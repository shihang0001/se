package com.bean;

import com.data.Data;

import java.sql.Time;

public class TradeBean {
    String filmTime;
    int filmName;
    String ticketType;
    int ticketId;
    int screenId;
    int studentNumber;
    String seatNumber;
    int price;

    public String getFilmTime() {
        return filmTime;
    }

    public void setFilmTime(String filmTime) {
        this.filmTime = filmTime;
    }


    public int getFilmNameID() {
        return filmName;
    }
    public String getFilmName() {
        return Data.filmMap.get(filmName);
    }

    public void setFilmName(int filmName) {
        this.filmName = filmName;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TradeBean() {
        this.setTicketId(idGenerated());
    }

    public int idGenerated() {
        int id = 0;
        do {
            for (int i = 0; i < 8; i++) {
                id = (Data.random.nextInt(4) + 1) + id*10;
            }
            System.out.println(id);
        }
        while (Data.ticketSet.contains(id));
        Data.ticketSet.add(id);
        return id;
    }

    @Override
    public String toString() {
        return "TradeBean{" +
                "filmTime='" + filmTime + '\'' +
                ", filmName=" + filmName +
                ", ticketType='" + ticketType + '\'' +
                ", ticketId=" + ticketId +
                ", screenId=" + screenId +
                ", studentNumber=" + studentNumber +
                ", seatNumber=" + seatNumber +
                ", price=" + price +
                '}';
    }
}
