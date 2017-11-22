package java3.core.services;

import java3.core.api.CommandExecutor;
import java3.core.api.DomainCommand;
import java3.core.api.DomainCommandResult;
import java3.core.handlers.DomainCommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
class CommandExecutorImpl implements CommandExecutor {

    @Autowired
    private List<DomainCommandHandler> services;

    private Map<Class, DomainCommandHandler> commandServiceMap;


    @PostConstruct
    public void init() {
        commandServiceMap = new HashMap<>();
        if(services != null && !services.isEmpty()) {
            for (DomainCommandHandler service : services) {
                Class domainCommandClass = service.getCommandType();
                commandServiceMap.put(domainCommandClass, service);
            }
        }
    }

    @Transactional()
    public <T extends DomainCommandResult> T execute(DomainCommand<T> domainCommand) {
        DomainCommandHandler service = commandServiceMap.get(domainCommand.getClass());
        if(service != null) {
            return (T)service.execute(domainCommand);
        } else {
            throw new IllegalArgumentException("Unknown domain command! " + domainCommand.toString());
        }
    }

}