package lk.washhub.washapp.web.business.custom.impl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lk.washhub.washapp.web.business.custom.UserBO;
import lk.washhub.washapp.web.business.util.EntityDTOMapper;
import lk.washhub.washapp.web.dao.UserDAO;
import lk.washhub.washapp.web.dto.UserDTO;
import lk.washhub.washapp.web.entity.User;
import lk.washhub.washapp.web.util.AppUtil;
import lombok.SneakyThrows;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import javax.security.auth.login.LoginException;
import javax.transaction.Transactional;
import java.util.Date;
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
        userDTO.setPassword(DigestUtils.sha256Hex(userDTO.getPassword()));
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

    @SneakyThrows
    @Override
    public String authenticate(UserDTO userDTO) throws LoginException {
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        if (!username.isEmpty() && !password.isEmpty()) {
            password = DigestUtils.sha256Hex(userDTO.getPassword());
            List<User> users = userDAO.findAll();
            for (User user : users) {
                if (username.matches(user.getUsername())
                        && password.matches(user.getPassword())) {
                    SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64URL.decode(AppUtil.getAppSecretKey()));
                    String jws = Jwts.builder()
                            .setIssuer("ijse")
                            .setExpiration(new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24)))
                            .setIssuedAt(new Date())
                            .claim("name", userDTO.getUsername())
                            .signWith(key)
                            .compact();
                    return jws;
                }
            }
        }
        return null;
    }
}
