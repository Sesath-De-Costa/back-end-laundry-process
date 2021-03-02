package lk.washhub.washapp.web.dto;

import lk.washhub.washapp.web.entity.LaundryTypes;
import lk.washhub.washapp.web.entity.Request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

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
public class ProcessDTO implements Serializable {

    private int id;
    private LaundryTypes laundryType;
    private BigDecimal weight;
    private BigDecimal price;
    private String qr; // need to verify the type of QR
    private Date startedTime;
    private Request request;
    private List<StageDTO> stageDTOS;
}
