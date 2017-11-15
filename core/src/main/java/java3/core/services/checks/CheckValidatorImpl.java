package java3.core.services.checks;

import java3.common.dtos.ValidationErrorDTO;
import java3.core.api.exceptions.ValidationError;
import org.springframework.stereotype.Component;
import sun.security.provider.certpath.OCSPResponse;

import java.util.*;

import static java3.core.api.exceptions.ValidationExceptionBuilder.createValidationException;

@Component
public class CheckValidatorImpl implements CheckValidator {

    @Override
    public void validate(Date dataPourches,
                         Long sumOfCheck,
                         String shopName,
                         Integer userID,
                         Integer userMoneyAccountID,
                         Boolean detailsAllow,
                         String comments) {
        List<ValidationError> errors = new ArrayList<>();
        errors.addAll(validateDatePourches(dataPourches));
        validateSumOfCheck(sumOfCheck).ifPresent(errors::add);
        validateShopName(shopName).ifPresent(errors::add);
        validateUserID(userID).ifPresent(errors::add);
        validateUserMoneyAccountID(userMoneyAccountID).ifPresent(errors::add);
        validateDetailsAllow(detailsAllow).ifPresent(errors::add);
        validateComments(comments).ifPresent(errors::add);
        if (!errors.isEmpty()) {
            throw createValidationException(OCSPResponse.ResponseStatus.BAD_REQUEST)
                    .with(errors).build();
        }

    }

    private Collection<? extends ValidationError> validateDatePourches(Date dataPourches) {
        return null;
    }


    private Optional<Object> validateComments(String comments) {
        return null;
    }

    private Optional<Object> validateDetailsAllow(Boolean detailsAllow) {
        return null;
    }

    private Optional<Object> validateUserMoneyAccountID(Integer userMoneyAccountID) {
        return null;
    }

    private Optional<Object> validateUserID(Integer userID) {
        return null;
    }

    private Optional<Object> validateShopName(String shopName) {
        return null;
    }

    private Optional<Object> validateSumOfCheck(Long sumOfCheck) {
        return null;
    }


}

/*
@Component
class UserValidatorImpl implements UserValidator {

    @Autowired private EmailValidator emailValidator;
    @Autowired private LoginValidator loginValidator;

    @Override
    public void validate(String login,
                         String password,
                         String email) {
        List<ValidationError> errors = new ArrayList<>();
        errors.addAll(validateLogin(login));
        validatePassword(password).ifPresent(errors::add);
        validateEmail(email).ifPresent(errors::add);
        if (!errors.isEmpty()) {
            throw createValidationException(ResponseStatus.BAD_REQUEST)
                    .with(errors).build();
        }
    }

    private List<ValidationError> validateLogin(String login) {
        return loginValidator.validate(login);
    }

    private Optional<ValidationError> validatePassword(String password) {
        if(StringUtils.isEmpty(password)) {
            return Optional.of(createValidationError()
                    .withField("password")
                    .withErrorCode("empty.field").build());
        } else {
            return Optional.empty();
        }
    }

    private Optional<ValidationError> validateEmail(String email) {
        if(StringUtils.isEmpty(email)) {
            return Optional.of(createValidationError()
                    .withField("email")
                    .withErrorCode("empty.field").build());
        }

        if (!emailValidator.isValid(email)) {
            return Optional.of(createValidationError()
                    .withField("email")
                    .withErrorCode("invalid.value").build());
        }

        return Optional.empty();
    }

}
 */