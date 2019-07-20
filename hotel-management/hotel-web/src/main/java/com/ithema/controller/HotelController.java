package com.ithema.controller;


import com.itheima.HotelDao;
import com.ithema.HotelRoom;
import com.ithema.service.HotelService;
import com.ithema.service.impl.HotelImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/hotel")
public class HotelController {

    public void save(String username, MultipartFile uploadFile) throws IOException {
        String originalFilename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("" +originalFilename));
    }

    @Autowired
    private HotelService hotelService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();

        List<HotelRoom> rooms = hotelService.findAll();
        mv.addObject("", rooms);
        mv.setViewName("");
        return mv;
    }

    @RequestMapping("/save.do")
    public String save(HotelRoom roomid){
        hotelService.save(roomid);
        return "redurect: ";
    }
}
