package lk.washhub.washapp.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Sesath De Costa on 2021-02-25
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ProcessStagePK implements Serializable {
    @Column(name = "process_id")
    private int processId;
    @Column(name = "stage_id")
    private int stageID;

}
