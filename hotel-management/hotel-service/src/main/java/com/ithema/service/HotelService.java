package com.ithema.service;

import com.ithema.HotelRoom;

import java.util.List;

public interface HotelService {


    List<HotelRoom> findAll();


    void save(HotelRoom roomid);
}
