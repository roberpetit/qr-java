package com.muni.qrapp;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class QrEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String img;
    private String url;
    private String type;
    private String name;
    private String mobileDescription;
    private String mobileImg;
    private Date expiration;

}