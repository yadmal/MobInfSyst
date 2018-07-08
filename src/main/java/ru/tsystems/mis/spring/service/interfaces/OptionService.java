package ru.tsystems.mis.spring.service.interfaces;

import ru.tsystems.mis.spring.model.Option;

import java.util.List;

public interface OptionService {

    int add(Option option);

    int update(Option option);

    int delete(Option option);

    Option get(Long id);

    List<Option> list();
}
