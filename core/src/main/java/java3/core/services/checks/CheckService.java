package java3.core.services.checks;

import java3.core.domain.Check;
import java3.core.domain.repositories.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface CheckService {

    Check get(Long checkID);
}

@Component
class CheckServiceImpl implements CheckService{

    @Autowired private CheckRepository checkRepository;

    @Override
    public Check get(Long checkID) {
        return checkRepository.getByCheckID(checkID);
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