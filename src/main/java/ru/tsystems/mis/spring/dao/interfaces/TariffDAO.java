package ru.tsystems.mis.spring.dao.interfaces;

import ru.tsystems.mis.spring.model.Tariff;

import java.util.List;

public interface TariffDAO {

    int add(Tariff tariff);

    int update(Tariff tariff);

    int delete(Tariff tariff);

    Tariff get(Long id);

    List<Tariff> list();
}
