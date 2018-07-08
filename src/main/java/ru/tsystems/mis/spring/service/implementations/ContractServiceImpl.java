package ru.tsystems.mis.spring.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import ru.tsystems.mis.spring.dao.interfaces.ContractDAO;
import ru.tsystems.mis.spring.model.Contract;
import ru.tsystems.mis.spring.service.interfaces.ContractService;

import java.util.List;

public class ContractServiceImpl implements ContractService {

    @Autowired
    ContractDAO contractDAO;

    public int add(Contract contract) {
        return contractDAO.add(contract);
    }

    public int update(Contract contract) {
        return contractDAO.update(contract);
    }

    public int delete(Contract contract) {
        return contractDAO.delete(contract);
    }

    public Contract get(Long id) {
        return contractDAO.get(id);
    }

    public List<Contract> list() {
        return contractDAO.list();
    }
}
