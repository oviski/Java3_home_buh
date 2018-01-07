package java3.core.services.checks;

import java3.core.domain.Check;
import java3.core.domain.repositories.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

import static java3.core.domain.builders.CheckBuilder.createCheck;

@Component
class CheckFactoryImpl implements CheckFactory {

    @Autowired private CheckValidator checkValidator;
    @Autowired private CheckRepository checkRepository;

    @Override
    public Check create(Date dataPourches, Long sumOfCheck, String shopName, Integer userID, Integer userMoneyAccountID, Boolean detailAllow, String comments) {
        checkValidator.validate(dataPourches, sumOfCheck, shopName, userID, userMoneyAccountID, detailAllow, comments);
        Check check = createCheck()
                .withDatePourches(dataPourches)
                .withSumOfCheck(sumOfCheck)
                .withShopName(shopName)
                .withUserID(userID)
                .withUserMoneyAccountID(userMoneyAccountID)
                .withDetailAllow(detailAllow)
                .withComments(comments)
                .build();
        return checkRepository.save(check);
    }
}
/*
@Component
class UserFactoryImpl implements UserFactory {

    @Autowired private UserValidator userValidator;
    @Autowired private UserRepository userRepository;

    @Override
    public User create(String login, String password, String email) {
        userValidator.validate(login, password, email);
        User user = createUser()
                .withLogin(login)
                .withPassword(password)
                .withEmail(email)
                .build();
        return userRepository.save(user);
    }

}
 */