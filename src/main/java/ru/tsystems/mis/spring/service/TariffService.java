package ru.tsystems.mis.spring.service;

import ru.tsystems.mis.spring.model.Tariff;

import java.util.List;

public interface TariffService {

    int add(Tariff tariff);

    int update(Tariff tariff);

    int delete(Tariff tariff);

    Tariff get(Long id);

    List<Tariff> list();
}
