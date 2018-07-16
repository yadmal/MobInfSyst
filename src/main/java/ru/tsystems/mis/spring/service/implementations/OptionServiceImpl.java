package ru.tsystems.mis.spring.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.OptionDAO;
import ru.tsystems.mis.spring.dto.OptionDto;
import ru.tsystems.mis.spring.model.Option;
import ru.tsystems.mis.spring.service.interfaces.OptionService;

import java.util.List;
import java.util.stream.Collectors;

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

//package ru.tsystems.mis.spring.service.implementations;
//
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.stereotype.Service;
//        import org.springframework.transaction.annotation.Transactional;
//        import ru.tsystems.mis.spring.dao.interfaces.OptionDAO;
//        import ru.tsystems.mis.spring.dto.OptionDto;
//        import ru.tsystems.mis.spring.model.Option;
//        import ru.tsystems.mis.spring.service.interfaces.OptionService;
//
//        import java.util.List;
//        import java.util.stream.Collectors;

//@Service
//public class OptionServiceImpl implements OptionService {
//
//    @Autowired
//    OptionDAO optionDAO;
//
//    @Override
//    @Transactional
//    public void addOption(OptionDto option) {
//        optionDAO.addOption(convert(option));
//    }
//
//    @Override
//    @Transactional
//    public void updateOption(OptionDto option) {
//        optionDAO.updateOption(convert(option));
//    }
//
//    @Override
//    @Transactional
//    public void deleteOption(Long id) {
//        optionDAO.deleteOption(id);
//    }
//
//    @Override
//    @Transactional
//    public OptionDto getOptionById(Long id) {
//        return convert(optionDAO.getOptionById(id));
//    }
//
//    @Override
//    @Transactional
//    public List<OptionDto> listOptions() {
//        return optionDAO.listOptions()
//                .stream()
//                .map(OptionServiceImpl::convert)
//                .collect(Collectors.toList());
//    }
//
//    private static Option convert(OptionDto optionDto){
//        Option modelOption = new Option();
//        modelOption.setId(optionDto.getId());
//        modelOption.setTitle(optionDto.getTitle());
//        modelOption.setDescription(optionDto.getDescription());
//        modelOption.setConnectionCost(optionDto.getConnectionCost());
//        return modelOption;
//    }
//
//
//    private static OptionDto convert(Option nodelOption){
//        OptionDto optionDto = new OptionDto();
//        optionDto.setId(nodelOption.getId());
//        optionDto.setTitle(nodelOption.getTitle());
//        optionDto.setDescription(nodelOption.getDescription());
//        optionDto.setConnectionCost(nodelOption.getConnectionCost());
//        return optionDto;
//    }
//
//
//}

