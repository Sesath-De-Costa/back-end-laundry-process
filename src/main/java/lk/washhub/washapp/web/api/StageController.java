package lk.washhub.washapp.web.api;

import lk.washhub.washapp.web.business.custom.StageBO;
import lk.washhub.washapp.web.dto.StageDTO;
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
@RestController
@CrossOrigin
@RequestMapping("/api/v1/stages")
public class StageController {

    @Autowired
    private StageBO stageBO;

    @GetMapping("/all")
    public List<StageDTO> getAllStages() throws Exception {
        return stageBO.getAllStage();
    }

    @GetMapping("/{id:\\d}")
    public StageDTO getStage(@PathVariable int id) throws Exception {
        return stageBO.getStage(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveStage(@RequestBody StageDTO stageDTO) throws Exception {
        stageBO.saveStage(stageDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping(value = "/{id:\\d}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStage(@PathVariable int id, @RequestBody StageDTO stageDTO) throws Exception {
        stageDTO.setId(id);
        stageBO.updateStage(stageDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PostMapping(value = "/{id:\\d}")
    public void deleteStage(@PathVariable int id) throws Exception {
        stageBO.deleteStage(id);
    }
}
