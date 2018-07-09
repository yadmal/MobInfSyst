package ru.tsystems.mis.spring.dao.interfaces;

import ru.tsystems.mis.spring.model.Tariff;

import java.util.List;

public interface TariffDAO {

    void addTariff(Tariff tariff);

    void updateTariff(Tariff tariff);

    void deleteTariff(Long id);

    Tariff getTariffById(Long id);

    List<Tariff> listTariffs();
}
