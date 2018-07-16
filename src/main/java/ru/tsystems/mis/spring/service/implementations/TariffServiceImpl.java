package ru.tsystems.mis.spring.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.TariffDAO;
import ru.tsystems.mis.spring.model.Tariff;
import ru.tsystems.mis.spring.service.interfaces.TariffService;

import java.util.List;

@Service
public class TariffServiceImpl implements TariffService {

    @Autowired
    TariffDAO tariffDAO;

    @Override
    @Transactional
    public void addTariff(Tariff tariff) {
        tariffDAO.addTariff(tariff);
    }

    @Override
    @Transactional
    public void updateTariff(Tariff tariff) {
        tariffDAO.updateTariff(tariff);
    }

    @Override
    @Transactional
    public void deleteTariff(Long id) {
        tariffDAO.deleteTariff(id);
    }

    @Override
    @Transactional
    public Tariff getTariffById(Long id) {
        return tariffDAO.getTariffById(id);
    }

    @Override
    @Transactional
    public Tariff getTariffByTitle(String title) {
        return tariffDAO.getTariffByTitle(title);
    }

    @Override
    @Transactional
    public List<Tariff> listTariffs() {
        return tariffDAO.listTariffs();
    }

    @Transactional
    @Override
    public boolean hasTariff(String title) {
        return tariffDAO.hasTariff(title);
    }
}
