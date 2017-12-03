package java3.core.handlers.check;

import java3.common.dtos.CheckDTO;
import java3.core.domain.Check;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java3.common.dtos.CheckDTOBuilder.createCheckDTO;

@Component
class CheckConverter {

    public CheckDTO convert (Check check){

        return createCheckDTO()
                .withCheckID(check.getCheckID())
                .withDatePourches(check.getDataPourches())
                .withShopName(check.getShopName())
                .withSumOfCheck(check.getSumOfCheck())
                .withUserID(check.getUserID())
                .withUserMoneyAccountID(check.getUserMoneyAccountID())
                .withComments(check.getComments())
                .build();
    }

    public List<CheckDTO> convert (List<Check> checkList){
        List<CheckDTO> checkDTOList = new ArrayList<CheckDTO>();
        for (Check check:checkList){
            checkDTOList.add(convert(check));
        }
        return checkDTOList;
    }
}

/*
@Component
class UserConverter {

    public UserDTO convert(User user) {
        return createUserDTO()
                .withId(user.getId())
                .withLogin(user.getLogin())
                .withPassword(user.getPassword())
                .withEmail(user.getEmail())
                .build();
    }

}
 */