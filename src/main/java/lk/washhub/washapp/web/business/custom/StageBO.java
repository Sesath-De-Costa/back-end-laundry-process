package lk.washhub.washapp.web.business.custom;

import lk.washhub.washapp.web.business.SuperBO;
import lk.washhub.washapp.web.dto.StageDTO;

import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-02
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public interface StageBO extends SuperBO {

    void saveStage(StageDTO stageDTO) throws Exception;

    void updateStage(StageDTO stageDTO) throws Exception;

    void deleteStage(int key) throws Exception;

    StageDTO getStage(int key) throws Exception;

    List<StageDTO> getAllStage() throws Exception;
}
