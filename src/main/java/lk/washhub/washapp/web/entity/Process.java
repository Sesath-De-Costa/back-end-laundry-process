package lk.washhub.washapp.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 * Created by Sesath De Costa on 2021-02-24
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "process")
public class Process implements SuperEntity{
    @Id
    @GeneratedValue
    private int id;
    @Enumerated(EnumType.STRING)
    @Column(name = "laundry_type")
    private LaundryTypes laundryType;
    private BigDecimal weight;
    private BigDecimal price;
    private String qr; // need to verify the type of QR
    private Date time;

}
