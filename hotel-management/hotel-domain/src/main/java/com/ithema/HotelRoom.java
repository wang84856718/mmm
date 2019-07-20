package com.ithema;

public class HotelRoom {

    private Integer id;

    private String roomid;

    private String rometype;

    private String price;

    private String romedes;

    private Customer customer;

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRometype() {
        return rometype;
    }

    public void setRometype(String rometype) {
        this.rometype = rometype;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRomedes() {
        return romedes;
    }

    public void setRomedes(String romedes) {
        this.romedes = romedes;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "id=" + id +
                ", roomid='" + roomid + '\'' +
                ", rometype='" + rometype + '\'' +
                ", price='" + price + '\'' +
                ", romedes='" + romedes + '\'' +
                ", customer=" + customer +
                '}';
    }
}
