package java3.core.commands.checks;

import java3.common.dtos.CheckDTO;
import java3.core.api.DomainCommand;

public class RegisterCheckCommand implements DomainCommand<RegisterCheckResult> {

    private CheckDTO checkDTO;

    public RegisterCheckCommand(CheckDTO checkDTO){
        this.checkDTO = checkDTO;
    }

    public CheckDTO getCheckDTO() {
        return checkDTO;
    }
}
/*
package lv.javaguru.java3.core.api.users;

import lv.javaguru.java3.common.dtos.UserDTO;
import lv.javaguru.java3.core.api.DomainCommand;

public class RegisterUserCommand implements DomainCommand<RegisterUserResult> {

    private UserDTO userDTO;

    public RegisterUserCommand(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }
} */