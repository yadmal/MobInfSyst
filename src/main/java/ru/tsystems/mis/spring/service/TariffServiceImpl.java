package ru.tsystems.mis.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.tsystems.mis.spring.dao.TariffDAO;
import ru.tsystems.mis.spring.model.Tariff;

import java.util.List;

public class TariffServiceImpl implements TariffService{

    @Autowired
    TariffDAO tariffDAO;

    public int add(Tariff tariff) {
        return tariffDAO.add(tariff);
    }

    public int update(Tariff tariff) {
        return tariffDAO.update(tariff);
    }

    public int delete(Tariff tariff) {
        return tariffDAO.delete(tariff);
    }

    public Tariff get(Long id) {
        return tariffDAO.get(id);
    }

    public List<Tariff> list() {
        return tariffDAO.list();
    }
}
