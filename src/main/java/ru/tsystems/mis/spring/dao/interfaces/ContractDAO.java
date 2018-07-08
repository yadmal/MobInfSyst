package ru.tsystems.mis.spring.dao.interfaces;

import ru.tsystems.mis.spring.model.Contract;

import java.util.List;

public interface ContractDAO {

    int add(Contract contract);

    int update(Contract contract);

    int delete(Contract contract);

    Contract get(Long id);

    List<Contract> list();
}
