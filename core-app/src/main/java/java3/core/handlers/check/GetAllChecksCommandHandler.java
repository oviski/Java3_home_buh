package java3.core.handlers.check;

import java3.common.dtos.CheckDTO;
import java3.core.api.checks.GetAllChecksCommand;
import java3.core.api.checks.GetAllChecksResult;
import java3.core.domain.Check;
import java3.core.handlers.DomainCommandHandler;
import java3.core.services.checks.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetAllChecksCommandHandler implements DomainCommandHandler<GetAllChecksCommand, GetAllChecksResult> {

    @Autowired
    private CheckService checkService;
    @Autowired private CheckConverter checkConverter;

    @Override
    public GetAllChecksResult execute(GetAllChecksCommand command) {
        Optional<List<Check>> checkList = checkService.getAll();
        Optional<List<CheckDTO>> checkDTOList = Optional.of(checkConverter.convert(checkList));
        return new GetAllChecksResult(checkDTOList.get());
    }

    @Override
    public Class getCommandType() {
        return GetAllChecksCommand.class;
    }
}
