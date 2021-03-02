package lk.washhub.washapp.web.dto;

import lk.washhub.washapp.web.entity.StageTypes;
import lk.washhub.washapp.web.entity.ProcessStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
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
public class StageDTO implements Serializable {

    private int id;
    private UserDTO user;
    private StageTypes stageName;
    private List<ProcessStatus> processStatus;
    private ProcessDTO processDTO;

}
