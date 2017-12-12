package java3.core.api.checks;

import java3.common.dtos.CheckDTO;
import java3.core.api.DomainCommandResult;

import java.util.List;

public class GetAllChecksResult implements DomainCommandResult {

    private List<CheckDTO> allChecks;

    public GetAllChecksResult(List<CheckDTO> allChecks) {
        this.allChecks = allChecks;
    }
    public List<CheckDTO> getAllChecks() {
        return allChecks;
    }
}
/*
 private CheckDTO check;

    public GetCheckResult(CheckDTO check) {
        this.check = check;
    }

    public CheckDTO getCheck() {
        return check;
    }
 */