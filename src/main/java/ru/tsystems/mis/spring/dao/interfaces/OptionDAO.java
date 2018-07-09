package ru.tsystems.mis.spring.dao.interfaces;

import ru.tsystems.mis.spring.model.Option;

import java.util.List;

public interface OptionDAO {

    void addOption(Option option);

    void updateOption(Option option);

    void deleteOption(Long id);

    Option getOptionById(Long id);

    List<Option> listOptions();
}
