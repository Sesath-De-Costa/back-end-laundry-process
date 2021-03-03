package lk.washhub.washapp.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
@Table(name = "process_stage")
public class ProcessStage implements SuperEntity {
    @EmbeddedId
    private ProcessStagePK processStagePK;
    @Column(name = "started_time", insertable = false, updatable = false)
    private Date startedTime;
    @Column(name = "completed_time", insertable = false, updatable = false)
    private Date completedTime;
    @ManyToOne
    private User user;

}
