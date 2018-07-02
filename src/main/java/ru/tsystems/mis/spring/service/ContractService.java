package ru.tsystems.mis.spring.service;

import ru.tsystems.mis.spring.model.Contract;

import java.util.List;

public interface ContractService {

    int add(Contract contract);

    int update(Contract contract);

    int delete(Contract contract);

    Contract get(Long id);

    List<Contract> list();
}
