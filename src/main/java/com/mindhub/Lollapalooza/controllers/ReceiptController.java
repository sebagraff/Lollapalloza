package com.mindhub.Lollapalooza.controllers;

import com.mindhub.Lollapalooza.repositories.DetailsRepository;
import com.mindhub.Lollapalooza.repositories.PurchaseRepository;
import com.mindhub.Lollapalooza.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReceiptController {

    @Autowired
    ReceiptController receiptController;

    @Autowired
    PurchaseRepository purchaseRepository;

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    DetailsRepository detailsRepository;

}
