package lk.washhub.washapp.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

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
@Table(name = "request")
public class Request implements SuperEntity {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "client_name")
    private String clientName;
    private String location; //----need to verify the type
    @Column(name = "request_date")
    private Date requestDate;
    @Column(name = "required_date")
    private Date requiredDate;
    @Column(name = "picked_date")
    private Date pickedDate;
    @Column(name = "same_day_return")
    private boolean sameDayReturn;

}
