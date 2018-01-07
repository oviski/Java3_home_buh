package java3.core.handlers;

import java3.core.api.DomainCommand;
import java3.core.api.DomainCommandResult;

public interface DomainCommandHandler<C extends DomainCommand, R extends DomainCommandResult>  {

    R execute(C command);

    Class getCommandType();

}

/*
package lv.javaguru.java3.core.handlers;

import lv.javaguru.java3.DomainCommand;
import lv.javaguru.java3.DomainCommandResult;

public interface DomainCommandHandler<C extends DomainCommand, R extends DomainCommandResult> {

    R execute(C command);

    Class getCommandType();

}
 */