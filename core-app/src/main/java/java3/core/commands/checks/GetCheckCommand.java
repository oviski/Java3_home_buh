package java3.core.commands.checks;

import java3.core.api.DomainCommand;

public class GetCheckCommand implements DomainCommand<GetCheckResult>{

    private Long checkID;

    public GetCheckCommand(Long checkID) {
        this.checkID = checkID;
    }

    public Long getCheckID() {
        return checkID;
    }
}
/*
package lv.javaguru.java3.core.api.users;

import lv.javaguru.java3.core.api.DomainCommand;

public class GetUserCommand implements DomainCommand<GetUserResult> {

    private String login;

    public GetUserCommand(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}


main ()
{

int P = 4;
MyClass o=NULL;
o = new MyClass();
o.myFunc(5);
myFunc();

}

myFunc()
{
int a = 4;
}

 */