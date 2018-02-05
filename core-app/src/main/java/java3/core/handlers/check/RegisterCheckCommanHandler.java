package java3.core.handlers.check;

import java3.common.dtos.CheckDTO;
import java3.core.commands.checks.RegisterCheckCommand;
import java3.core.commands.checks.RegisterCheckResult;
import java3.core.domain.Check;

import java3.core.handlers.DomainCommandHandler;
import java3.core.services.checks.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import static java3.core.domain.builders.CheckBuilder.createCheck;

@Component
public class RegisterCheckCommanHandler implements DomainCommandHandler<RegisterCheckCommand, RegisterCheckResult> {

    @Autowired private CheckConverter checkConverter;
    @Autowired private CheckService checkService;
    @Override
    public RegisterCheckResult execute(RegisterCheckCommand command) {
        CheckDTO checkDTO = command.getCheckDTO();

        Check check = checkService.save(checkDTO);
        CheckDTO checkDTOResult = checkConverter.convert(check);
        return new RegisterCheckResult(checkDTOResult);
    }

    @Override
    public Class getCommandType() {
        return RegisterCheckCommand.class;
    }
}

/*
        return GetCheckCommand.class;
package lv.javaguru.java3.core.handlers.users;

import lv.javaguru.java3.core.api.users.RegisterUserCommand;
import lv.javaguru.java3.core.api.users.RegisterUserResult;
import lv.javaguru.java3.core.handlers.DomainCommandHandler;
import org.springframework.stereotype.Component;

@Component
class RegisterUserHandler implements DomainCommandHandler<RegisterUserCommand, RegisterUserResult> {

    @Override
    public RegisterUserResult execute(RegisterUserCommand command) {
        return null;
    }

    @Override
    public Class getCommandType() {
        return RegisterUserCommand.class;
    }
}

 */
