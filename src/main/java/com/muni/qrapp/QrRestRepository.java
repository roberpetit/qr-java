package com.muni.qrapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface QrRestRepository extends JpaRepository<QrEntity, String> {

    QrEntity findById(@Param("id") UUID id);
    QrEntity save(QrEntity qr);
    List<QrEntity> findAll();
}