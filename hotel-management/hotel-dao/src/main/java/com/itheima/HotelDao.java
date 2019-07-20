package com.itheima;

import com.ithema.HotelRoom;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HotelDao {

    @Select("select * from room")
    List<HotelRoom> findAll();

    @Insert("insert into room(roomid,rometype,price,romedes) values(#{roomid},#{rometype},#{price},#{romedes})")
    void save(HotelRoom roomid);
}
