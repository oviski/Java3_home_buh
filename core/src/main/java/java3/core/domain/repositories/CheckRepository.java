package java3.core.domain.repositories;

import java3.core.api.exceptions.ResponseStatus;
import java3.core.api.exceptions.ValidationErrorBuilder;
import java3.core.domain.Check;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static java3.core.api.exceptions.ValidationExceptionBuilder.createValidationException;

public interface CheckRepository extends JpaRepository<Check, Long> {

    Optional<Check> findOneByCheckID(Long checkID);

    default Check getByCheckID(Long checkID) {
        return findOneByCheckID(checkID)
                .orElseThrow(() -> createValidationException(ResponseStatus.NOT_FOUND)
                .with(ValidationErrorBuilder.createValidationError()
                .withField("checkID")
                .withErrorCode("invalid.value")).build());
    }


    Optional<List<Check>> findAllByDataPourches(Date dataPourches);


}

/*
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByLogin(String login);

    default User getRequiredByLogin(String login) {
        return findOneByLogin(login)
                .orElseThrow(() -> createValidationException(ResponseStatus.NOT_FOUND)
                        .with(createValidationError()
                                .withField("login")
                                .withErrorCode("invalid.value")).build());
    }

}

 */