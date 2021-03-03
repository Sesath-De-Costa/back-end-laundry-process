package lk.washhub.washapp.web.business.custom;

import lk.washhub.washapp.web.business.SuperBO;
import lk.washhub.washapp.web.dto.RequestDTO;

import java.util.List;

/**
 * Created by Sesath De Costa on 2021-03-02
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
public interface RequestBO extends SuperBO {
    
    void saveRequest(RequestDTO requestDTO) throws Exception;

    void updateRequest(RequestDTO requestDTO) throws Exception;

    RequestDTO getRequest(int key) throws Exception;

    List<RequestDTO> getAllRequest() throws Exception;
}
