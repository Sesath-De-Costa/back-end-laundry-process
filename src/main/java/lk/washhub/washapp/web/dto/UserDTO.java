package lk.washhub.washapp.web.dto;

import lk.washhub.washapp.web.entity.UserTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by Sesath De Costa on 2021-03-01
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserDTO implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private String nic;
    private UserTypes userTypes;
    private String mobile;
}
