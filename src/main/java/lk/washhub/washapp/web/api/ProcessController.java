package lk.washhub.washapp.web.api;

import lk.washhub.washapp.web.business.custom.ProcessBO;
import lk.washhub.washapp.web.dto.ProcessDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-02
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@CrossOrigin
@RequestMapping("/api/v1/processes")
@RestController
public class ProcessController {

    @Autowired
    private ProcessBO processBO;

    @GetMapping("/all")
    public List<ProcessDTO> getAllProcesses() throws Exception {
        return processBO.getAllProcess();
    }

    @GetMapping("/{id:\\d{5}}")
    public ProcessDTO getProcess(@PathVariable int id) throws Exception {
        return processBO.getProcess(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public int saveProcess(@RequestBody ProcessDTO processDTO) throws Exception {
        processBO.saveProcess(processDTO);
        return processDTO.getId();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping(value = "/{id:\\d{5}}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateProcess(@PathVariable int id, @RequestBody ProcessDTO processDTO) throws Exception {
        processDTO.setId(id);
        processBO.updateProcess(processDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id:\\d{5}}")
    public void deleteProcess(@PathVariable int id) throws Exception {
        processBO.deleteProcess(id);
    }

}
