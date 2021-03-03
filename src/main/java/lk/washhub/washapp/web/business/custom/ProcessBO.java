package lk.washhub.washapp.web.business.custom;

import lk.washhub.washapp.web.business.SuperBO;
import lk.washhub.washapp.web.dto.ProcessDTO;

import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-02
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public interface ProcessBO extends SuperBO {

    void saveProcess(ProcessDTO processDTO) throws Exception;

    void updateProcess(ProcessDTO processDTO) throws Exception;

    void deleteProcess(int key) throws Exception;

    ProcessDTO getProcess(int key) throws Exception;

    List<ProcessDTO> getAllProcess() throws Exception;
}
