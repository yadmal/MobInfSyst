package ru.tsystems.mis.spring.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.OptionDAO;
import ru.tsystems.mis.spring.model.Option;
import ru.tsystems.mis.spring.service.interfaces.OptionService;

import java.util.List;

@Service
public class OptionServiceImpl implements OptionService {

    @Autowired
    OptionDAO optionDAO;

    @Override
    @Transactional
    public void addOption(Option option) {
        optionDAO.addOption(option);
    }

    @Override
    @Transactional
    public void updateOption(Option option) {
        optionDAO.updateOption(option);
    }

    @Override
    @Transactional
    public void deleteOption(Long id) {
        optionDAO.deleteOption(id);
    }

    @Override
    @Transactional
    public Option getOptionById(Long id) {
        return optionDAO.getOptionById(id);
    }

    @Override
    @Transactional
    public List<Option> listOptions() {
        return optionDAO.listOptions();
    }
}
