package com.edureka.travelcompany.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.edureka.travelcompany.entities.Hotel;
import com.edureka.travelcompany.repositories.UserRepository;

@RestController
public class HotelController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getHotelList")
    public List<Hotel> getHotelList() {
        return userRepository.findAll();
    }

    @PutMapping("/addHotel")
    public void addHotel(@RequestBody Hotel hotel) {
        userRepository.save(hotel);
    }

    @GetMapping("/hotels")
    public Page<Hotel> getHotelListPage(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {

        Pageable paging = PageRequest.of(page, size);
        return userRepository.findAll(paging);
    }
}
