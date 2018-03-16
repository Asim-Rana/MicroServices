package com.example.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Muhammad.Asim on 3/16/2018.
 */
public interface ExchangeValueRepository extends
        JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}