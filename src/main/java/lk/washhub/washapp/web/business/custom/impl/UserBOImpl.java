package lk.washhub.washapp.web.business.custom.impl;

import lk.washhub.washapp.web.business.custom.UserBO;
import lk.washhub.washapp.web.business.util.EntityDTOMapper;
import lk.washhub.washapp.web.dao.UserDAO;
import lk.washhub.washapp.web.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-02
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@Transactional
@Service

public class UserBOImpl implements UserBO {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private EntityDTOMapper mapper;

    public UserBOImpl() {
    }

    @Override
    public void saveUser(UserDTO userDTO) throws Exception {
        userDAO.save(mapper.getUser(userDTO));
    }

    @Override
    public void updateUser(UserDTO userDTO) throws Exception {
        userDAO.save(mapper.getUser(userDTO));
    }

    @Override
    public void deleteUser(int key) throws Exception {
        userDAO.deleteById(key);
    }

    @Override
    public UserDTO getUser(int key) throws Exception {
        return mapper.getUserDTO(userDAO.getOne(key));
    }

    @Override
    public List<UserDTO> getAllUser() throws Exception {
        return mapper.getAllUserDTO(userDAO.findAll());
    }
}
