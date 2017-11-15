package java3.core.api.checks;

import java3.common.dtos.CheckDTO;
import java3.core.api.DomainCommandResult;

public class RegisterCheckResult implements DomainCommandResult{

    private CheckDTO check;

    public  RegisterCheckResult(CheckDTO check){
        this.check = check;
    }

    public CheckDTO getCheck() {
        return check;
    }
}
/*
package lv.javaguru.java3.core.api.users;

import lv.javaguru.java3.common.dtos.UserDTO;
import lv.javaguru.java3.core.api.DomainCommandResult;

public class RegisterUserResult implements DomainCommandResult {

    private UserDTO user;

    public RegisterUserResult(UserDTO user) {
        this.user = user;
    }

    public UserDTO getUser() {
        return user;
    }

}
 */