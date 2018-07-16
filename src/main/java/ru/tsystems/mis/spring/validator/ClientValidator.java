package ru.tsystems.mis.spring.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ru.tsystems.mis.spring.model.Client;
import ru.tsystems.mis.spring.service.interfaces.ClientService;


/**
 * Validator for {@link Client} class.
 *
 *  @author Dmitry Yashkin
 *  @version 1.0
 */
@Component
public class ClientValidator implements Validator {

    @Autowired
    private ClientService clientService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Client.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Client client = (Client) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Required");

        if(client.getUsername().length() < 8 || client.getUsername().length() > 32){
            errors.rejectValue("username", "Size.userForm.username");
        }

        if(clientService.getClientByUsername(client.getUsername()) != null){
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required");

        if(client.getPassword().length() < 8 || client.getPassword().length() > 32){
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!client.getConfirmPassword().equals(client.getPassword())) {
            errors.rejectValue("confirmPassword", "Different.userForm.password");
        }
    }
}
