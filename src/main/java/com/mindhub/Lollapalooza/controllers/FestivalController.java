package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.repositories.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FestivalController {

    @Autowired
    FestivalRepository festivalRepository;

}
