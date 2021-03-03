package lk.washhub.washapp.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by Sesath De Costa on 2021-03-01
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_request")

public class UserRequest implements SuperEntity {
    @EmbeddedId
    private UserRequestPK userRequestPK;
    @Column(name = "request_id", updatable = false, insertable = false)
    private int requsetId;
    @Column(name = "user_id", updatable = false, insertable = false)
    private int userID;
    @Column(name = "assigned_time")
    private Date assignedTime;
    @Column(name = "completed_time")
    private Date completedTime;

}
