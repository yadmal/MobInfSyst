package ru.tsystems.mis.spring.service.interfaces;

import ru.tsystems.mis.spring.dto.OptionDto;
import ru.tsystems.mis.spring.model.Option;

import java.util.List;

public interface OptionService {

    void addOption(Option option);

    void updateOption(Option option);

    void deleteOption(Long id);

    Option getOptionById(Long id);

    List<Option> listOptions();
}

//package ru.tsystems.mis.spring.service.interfaces;
//
//        import ru.tsystems.mis.spring.dto.OptionDto;
//        import ru.tsystems.mis.spring.model.Option;
//
//        import java.util.List;
//
//public interface OptionService {
//
//    void addOption(OptionDto option);
//
//    void updateOption(OptionDto option);
//
//    void deleteOption(Long id);
//
//    OptionDto getOptionById(Long id);
//
//    List<OptionDto> listOptions();
//}
//
