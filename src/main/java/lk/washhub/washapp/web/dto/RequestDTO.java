package lk.washhub.washapp.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;

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
public class RequestDTO implements Serializable {
    private int id;
    private String clientName;
    private String location; //----need to verify the type
    private Date requestDate;
    private Date requiredDate;
    private Date pickedDate;
    private boolean sameDayReturn;
    private String username;
}
