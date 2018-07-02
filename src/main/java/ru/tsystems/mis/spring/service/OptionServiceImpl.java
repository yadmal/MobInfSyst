package ru.tsystems.mis.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.tsystems.mis.spring.dao.OptionDAO;
import ru.tsystems.mis.spring.model.Option;

import java.util.List;

public class OptionServiceImpl implements OptionService{

    @Autowired
    OptionDAO optionDAO;

    public int add(Option option) {
        return optionDAO.add(option);
    }

    public int update(Option option) {
        return optionDAO.update(option);
    }

    public int delete(Option option) {
        return optionDAO.delete(option);
    }

    public Option get(Long id) {
        return optionDAO.get(id);
    }

    public List<Option> list() {
        return optionDAO.list();
    }
}
