package com.mindhub.Lollapalooza.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

//

@Entity
public class VisualArts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String artName;
    private LocalDateTime dateAndTime;
}
