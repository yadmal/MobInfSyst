package ru.tsystems.mis.spring.service.interfaces;

import ru.tsystems.mis.spring.model.Tariff;

import java.util.List;

public interface TariffService {

    void addTariff(Tariff tariff);

    void updateTariff(Tariff tariff);

    void deleteTariff(Long id);

    Tariff getTariffById(Long id);

    Tariff getTariffByTitle(String title);

    List<Tariff> listTariffs();

    boolean hasTariff(String title);
}
