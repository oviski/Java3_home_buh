package java3.core.services.checks;


import java3.core.api.common.ResponseStatus;
import java3.core.api.exceptions.ValidationError;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static java3.core.api.exceptions.ValidationErrorBuilder.createValidationError;
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
        //errors.addAll();
        validateDatePourches(dataPourches).ifPresent(errors::add);
        validateSumOfCheck(sumOfCheck).ifPresent(errors::add);
        validateShopName(shopName).ifPresent(errors::add);
        validateUserID(userID).ifPresent(errors::add);
        validateUserMoneyAccountID(userMoneyAccountID).ifPresent(errors::add);
        validateDetailsAllow(detailsAllow).ifPresent(errors::add);
        validateComments(comments).ifPresent(errors::add);
        if (!errors.isEmpty()) {
            throw createValidationException(ResponseStatus.BAD_REQUEST)
                    .with(errors).build();
        }

    }

    private Optional<ValidationError> validateDatePourches(Date dataPourches) {
        if(StringUtils.isEmpty(dataPourches)) {
            return Optional.of(createValidationError()
                    .withField("dataPourches")
                    .withErrorCode("empty.field").build());
        } else {
            return Optional.empty();
        }
    }


    private Optional<ValidationError> validateComments(String comments) {
        if(StringUtils.isEmpty(comments)) {
            return Optional.of(createValidationError()
                    .withField("comments")
                    .withErrorCode("empty.field").build());
        } else {
            return Optional.empty();
        }
    }

    private Optional<ValidationError> validateDetailsAllow(Boolean detailsAllow) {
        if(StringUtils.isEmpty(detailsAllow)) {
            return Optional.of(createValidationError()
                    .withField("detailsAllow")
                    .withErrorCode("empty.field").build());
        } else {
            return Optional.empty();
        }
    }

    private Optional<ValidationError> validateUserMoneyAccountID(Integer userMoneyAccountID) {
        if(StringUtils.isEmpty(userMoneyAccountID)) {
            return Optional.of(createValidationError()
                    .withField("userMoneyAccountID")
                    .withErrorCode("empty.field").build());
        } else {
            return Optional.empty();
        }
    }

    private Optional<ValidationError> validateUserID(Integer userID) {
        if(StringUtils.isEmpty(userID)) {
            return Optional.of(createValidationError()
                    .withField("userID")
                    .withErrorCode("empty.field").build());
        } else {
            return Optional.empty();
        }
    }

    private Optional<ValidationError> validateShopName(String shopName) {
            if(StringUtils.isEmpty(shopName)) {
                return Optional.of(createValidationError()
                        .withField("shopName")
                        .withErrorCode("empty.field").build());
            } else {
                return Optional.empty();
            }
    }

    private Optional<ValidationError> validateSumOfCheck(Long sumOfCheck) {
                if(StringUtils.isEmpty(sumOfCheck)) {
                    return Optional.of(createValidationError()
                            .withField("sumOfCheck")
                            .withErrorCode("empty.field").build());
                } else {
                    return Optional.empty();
                }
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