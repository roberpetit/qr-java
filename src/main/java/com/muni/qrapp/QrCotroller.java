package com.muni.qrapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("qr")
public class QrCotroller {

    private static final String template = "Hello, %s!";

    @Autowired
    QrRestRepository restRepository;

    @GetMapping("/{id}")
    public QrEntity findById(@PathVariable String id) {
        System.out.println("==== get qr ====");
        return restRepository.findById(UUID.fromString(id));
    }

    @GetMapping("/findall")
    public List<QrEntity> findAll() {
        System.out.println("==== get all qrs ====");
        return restRepository.findAll();
    }

    @PostMapping(path = "/save", consumes = "application/json", produces = "application/json")
    public QrEntity save(@RequestBody QrEntity qr) {
        System.out.println("==== save qr ====");
        qr.setId(UUID.randomUUID());
        QrEntity saved = restRepository.save(qr);
        return saved;
    }
}