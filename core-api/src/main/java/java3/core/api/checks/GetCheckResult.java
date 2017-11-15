package java3.core.api.checks;

import java3.common.dtos.CheckDTO;
import java3.core.api.DomainCommandResult;

public class GetCheckResult implements DomainCommandResult{

    private CheckDTO check;

    public GetCheckResult(CheckDTO check) {
        this.check = check;
    }

    private CheckDTO getCheck() {
        return check;
    }
}
/*
package lv.javaguru.java3.core.api.users;

import lv.javaguru.java3.common.dtos.UserDTO;
import lv.javaguru.java3.core.api.DomainCommandResult;

public class GetUserResult implements DomainCommandResult {

    private UserDTO user;

    public GetUserResult(UserDTO user) {
        this.user = user;
    }

    public UserDTO getUser() {
        return user;
    }
}
 */