package java3.core.services.checks;

import java3.common.dtos.CheckDTO;
import java3.core.domain.Check;
import java3.core.domain.repositories.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CheckService {

    Check get(Long checkID);
    Optional<List<Check>> getAll();
    Optional<List<Check>> getByDataPourches(Date dataPourches);
    Check save(CheckDTO check);
}

@Component
class CheckServiceImpl implements CheckService{

    @Autowired private CheckRepository checkRepository;
    @Autowired private CheckFactory checkFactory;

    @Override
    public Check get(Long checkID) {
        return checkRepository.getByCheckID(checkID);
    }

    @Override
    public Optional<List<Check>> getAll() {
        return Optional.of(checkRepository.findAll());
    }

    @Override
    public Optional<List<Check>> getByDataPourches(Date dataPourches) {
        return checkRepository.findAllByDataPourches(dataPourches);
    }

    @Override
    public Check save(CheckDTO check) {
        return checkFactory.create(check.getDataPourches(),check.getSumOfCheck(), check.getShopName(),
                check.getUserID(), check.getUserMoneyAccountID(), check.getDetailAllow(), check.getComments());
    }

}
/*
public interface UserService {

    User get(String login);

}

@Component
class UserServiceImpl implements UserService {

    @Autowired private UserRepository userRepository;

    @Override
    public User get(String login) {
        return userRepository.getRequiredByLogin(login);
    }

}

 */