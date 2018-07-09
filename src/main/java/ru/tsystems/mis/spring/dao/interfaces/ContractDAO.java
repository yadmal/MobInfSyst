package ru.tsystems.mis.spring.dao.interfaces;

import ru.tsystems.mis.spring.model.Contract;

import java.util.List;

public interface ContractDAO {

    void addContract(Contract contract);

    void updateContract(Contract contract);

    void deleteContract(Long id);

    Contract getContractById(Long id);

    List<Contract> listContracts();
}
