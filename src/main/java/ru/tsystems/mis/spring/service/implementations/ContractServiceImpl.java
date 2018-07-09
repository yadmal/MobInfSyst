package ru.tsystems.mis.spring.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.ContractDAO;
import ru.tsystems.mis.spring.model.Contract;
import ru.tsystems.mis.spring.service.interfaces.ContractService;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    ContractDAO contractDAO;

    @Override
    @Transactional
    public void addContract(Contract contract) {
        contractDAO.addContract(contract);
    }

    @Override
    @Transactional
    public void updateContract(Contract contract) {
        contractDAO.updateContract(contract);
    }

    @Override
    @Transactional
    public void deleteContract(Long id) {
        contractDAO.deleteContract(id);
    }

    @Override
    @Transactional
    public Contract getContractById(Long id) {
        return contractDAO.getContractById(id);
    }

    @Override
    @Transactional
    public List<Contract> listContracts() {
        return contractDAO.listContracts();
    }
}
