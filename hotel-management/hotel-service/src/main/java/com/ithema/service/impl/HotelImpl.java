package com.ithema.service.impl;

import com.itheima.HotelDao;
import com.ithema.HotelRoom;
import com.ithema.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HotelImpl implements HotelService {

    @Autowired
    private HotelDao hotelDao;

    @Override
    public List<HotelRoom> findAll() {
        return hotelDao.findAll();
    }

    @Override
    public void save(HotelRoom roomid) {
        hotelDao.save(roomid);
    }
}
