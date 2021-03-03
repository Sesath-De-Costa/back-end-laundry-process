package lk.washhub.washapp.web.api;

import lk.washhub.washapp.web.business.custom.RequestBO;
import lk.washhub.washapp.web.dto.RequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-03
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@RestController
@CrossOrigin
@RequestMapping("/api/v1/requests")
public class RequestController {

    @Autowired
    private RequestBO requestBO;

    @GetMapping("/all")
    public List<RequestDTO> getAllRequests() throws Exception {
        return requestBO.getAllRequest();
    }

    @GetMapping("/{id:\\d}")
    public RequestDTO getRequest(@PathVariable int id) throws Exception {
        return requestBO.getRequest(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public int saveRequest(@RequestBody RequestDTO requestDTO) throws Exception {
        requestBO.saveRequest(requestDTO);
        return requestDTO.getId();
    }

    @PutMapping(value = "/{id:\\d}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateRequest(@PathVariable int id, @RequestBody RequestDTO requestDTO) throws Exception {
        requestDTO.setId(id);
        requestBO.saveRequest(requestDTO);

    }
}
