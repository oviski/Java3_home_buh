package java3.integrations.rest;


import java3.common.dtos.CheckDTO;
import java3.core.api.CommandExecutor;
import java3.core.api.checks.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = RESTResource.API_PATH)
public class CheckResourceImpl {

    @Autowired
    private CommandExecutor commandExecutor;

    @RequestMapping(value = "/checks", method = RequestMethod.POST)
    public ResponseEntity<CheckDTO> register(@RequestBody CheckDTO checkDTO) {
        RegisterCheckCommand command = new RegisterCheckCommand(checkDTO);
        RegisterCheckResult result = commandExecutor.execute(command);
        return ResponseEntity.ok(result.getCheck());
    }

    @RequestMapping(value = "/checks/{checkid}", method = RequestMethod.GET)
    public ResponseEntity<CheckDTO> get(@PathVariable("checkid") Long checkID) {
        GetCheckCommand command = new GetCheckCommand(checkID);
        GetCheckResult result = commandExecutor.execute(command);
        return ResponseEntity.ok(result.getCheck());
    }

    @RequestMapping(value = "/checks/all", method = RequestMethod.GET)
    public ResponseEntity<List<CheckDTO>> getAll() {
        GetAllChecksCommand command = new GetAllChecksCommand();
        GetAllChecksResult result = commandExecutor.execute(command);
        return ResponseEntity.ok(result.getAllChecks());
    }

}
