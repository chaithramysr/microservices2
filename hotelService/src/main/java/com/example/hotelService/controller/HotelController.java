package com.example.hotelService.controller;

import com.example.hotelService.entity.Hotel;
import com.example.hotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/addHotel")
    public String addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }

    @GetMapping("/getAllHotels")
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/getHotelByID/{hotelId}")
    public Hotel getHotelByID(@PathVariable String hotelId) {
        return hotelService.getHotelByID(hotelId);
    }

    @PutMapping("/updateHotel")
    public String updateHotel(@RequestBody Hotel hotel) {
        return hotelService.updateHotel(hotel);
    }

    @DeleteMapping("/deleteHotel/{hotelId}")
    public String deleteHotel(@PathVariable String hotelId) {
        return hotelService.deleteHotel(hotelId);
    }

}
