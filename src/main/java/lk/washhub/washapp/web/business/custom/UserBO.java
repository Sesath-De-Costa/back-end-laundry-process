package lk.washhub.washapp.web.business.custom;

import lk.washhub.washapp.web.business.SuperBO;
import lk.washhub.washapp.web.dto.UserDTO;

import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-02
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public interface UserBO extends SuperBO {
    
    void saveUser(UserDTO userDTO) throws Exception;

    void updateUser(UserDTO userDTO) throws Exception;

    void deleteUser(UserDTO userDTO) throws Exception;

    UserDTO getUser(UserDTO userDTO) throws Exception;

    List<UserDTO> getAllUser() throws Exception;
}
