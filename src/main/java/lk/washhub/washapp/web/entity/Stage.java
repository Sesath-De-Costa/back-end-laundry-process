package lk.washhub.washapp.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Sesath De Costa on 2021-02-25
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "stage")
public class Stage implements SuperEntity {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private User user;
    @Enumerated(EnumType.STRING)
    @Column(name = "process_stage")
    private StageTypes processStage;
    @Enumerated(EnumType.STRING)
    @Column(name = "process_status")
    private ProcessStatus processStatus;
}
