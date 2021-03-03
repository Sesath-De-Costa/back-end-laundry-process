package lk.washhub.washapp.web.api;

import lk.washhub.washapp.web.business.custom.UserBO;
import lk.washhub.washapp.web.dto.UserDTO;
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
@RequestMapping("/api/v1/users")
@RestController
public class UserController {

    @Autowired
    private UserBO userBO;

    @GetMapping("/all")
    public List<UserDTO> getAllUsers() throws Exception {
        return userBO.getAllUser();
    }

    @GetMapping("/{id:\\d}")
    public UserDTO getUser(@PathVariable int id) throws Exception {
        return userBO.getUser(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public int saveUser(@RequestBody UserDTO userDTO) throws Exception {
        userBO.saveUser(userDTO);
        return userDTO.getId();//--------------------
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping(value = "/{id:\\d}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@PathVariable int id, @RequestBody UserDTO userDTO) throws Exception {
        userDTO.setId(id);
        userBO.updateUser(userDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id:\\d}")
    public void deleteUser(@PathVariable int id) throws Exception {
        userBO.deleteUser(id);
    }

}
